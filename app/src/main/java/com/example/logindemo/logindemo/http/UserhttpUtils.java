package com.example.logindemo.logindemo.http;

import com.example.logindemo.logindemo.LoginMainActivity;
import com.example.logindemo.utils.http.HttpUtils;
import com.example.logindemo.utils.http.JsonCallback;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//对网络框架进行第三次封装
public class UserhttpUtils {
    public static final String url_base = "http://10.0.2.2:8080/WebLoginTest";

    public static void login(LoginMainActivity tag, String ssid, String pwd, MyJsonCallback callback) {
        String url = url_base + "/login";
        Map<String,String> parmars=new HashMap<>();

        parmars.put("ssid",ssid);
        parmars.put("password",pwd);
        HttpUtils.post(tag,url,parmars,callback );

    }

    public static void reg(Objects tag, String ssid, String pwd, String name,MyJsonCallback callback) {
        String url = url_base + "/reg";
        Map<String,String> parmars=new HashMap<>();

        parmars.put("ssid",ssid);
        parmars.put("password",pwd);
        parmars.put("name",name);
        HttpUtils.post(tag,url,parmars,callback );

    }

    public static void update(Objects tag, String ssid, String name,String headUrl,String token,MyJsonCallback callback) {
        String url = url_base + "/update";
        Map<String,String> parmars=new HashMap<>();

        parmars.put("ssid",ssid);
        parmars.put("name",name);
        parmars.put("headUrl",headUrl);
        parmars.put("token",token);
        HttpUtils.post(tag,url,parmars,callback );

    }
}
