package com.example.logindemo.logindemo;

import android.app.Application;

import com.example.logindemo.utils.http.HttpUtils;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpUtils.init(this);


    }
}
