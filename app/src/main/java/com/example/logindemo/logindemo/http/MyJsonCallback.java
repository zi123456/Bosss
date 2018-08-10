package com.example.logindemo.logindemo.http;


import android.text.TextUtils;

import com.example.logindemo.logindemo.bean.Result;
import com.example.logindemo.utils.http.JsonCallback;
import com.example.logindemo.utils.http.JsonUtils;

public class MyJsonCallback extends JsonCallback {
    @Override
    public void onStart(Object tag) {

    }

    @Override
    public void onSuccess(String json) {
        Result r= JsonUtils.toBean(json,Result.class);
        if(r.getCode()==-2){


        }

    }



    @Override
    public void onError(Throwable exception) {

    }

    @Override
    public void onFinish() {

    }
}
