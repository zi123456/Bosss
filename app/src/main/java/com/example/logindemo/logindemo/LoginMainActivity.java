package com.example.logindemo.logindemo;


import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.logindemo.R;
import com.example.logindemo.logindemo.bean.Result;
import com.example.logindemo.logindemo.bean.User;
import com.example.logindemo.logindemo.http.MyJsonCallback;
import com.example.logindemo.logindemo.http.UserhttpUtils;
import com.example.logindemo.utils.app.BaseActivity;
import com.example.logindemo.utils.http.JsonUtils;
import com.lzy.okgo.model.Response;


public class LoginMainActivity extends BaseActivity implements View.OnClickListener {


    private EditText et_ssid, et_pwd;
    private Button bt_login;
    private TextView tv_reg;
    private ImageView iv;

    @Override
    protected int getLayoutId() {
        return R.layout.act_login;
    }

    @Override
    protected void initView() {
        et_ssid = findViewById(R.id.et_ssid);
        et_pwd = findViewById(R.id.et_pwd);
        bt_login = findViewById(R.id.bt_login);
        tv_reg = findViewById(R.id.tv_reg);
        iv=findViewById(R.id.iv);
    }

    @Override
    protected void initData() {
String u="http://p5.so.qhimgs1.com/t01f59f18783d52c16b.jpg";
        Glide.with(this).load(u).into(iv);
    }

    @Override
    protected void initListener() {
        bt_login.setOnClickListener(this);
        tv_reg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == bt_login) {//拿到数据
            String ssid = et_ssid.getText().toString();
            String pwd = et_pwd.getText().toString();
            if (TextUtils.isEmpty(ssid) || TextUtils.isEmpty(pwd)) {
                showToast("你输入的账号和密码格式不对");
                return;
            }
            UserhttpUtils.login(this, ssid, pwd, myJsonCallback);

        } else if (view == tv_reg) { //跳转页面
            jumpToActivity(RegActivity.class);


        }
    }

    private MyJsonCallback myJsonCallback = new MyJsonCallback() {
        @Override
        public void onStart(Object tag) {
            super.onStart(tag);
            showDialog();

        }

        @Override
        public void onSuccess(String json) {
            super.onSuccess(json);
            Result<User> reasult = JsonUtils.toBean(json, JsonUtils.newParamType(Result.class, User.class));
            switch (reasult.getCode()) {
                case 1: {
                  jumpToActivity(Manactivity.class);

                    break;
                }
                case -1: {//登录失败
                  showToast("账号密码输入错误");

                    break;
                }
              default:{


                    break;
                }


            }

        }

        @Override
        public void onError(Response<String> response) {
            super.onError(response);
            showToast("请检查网络");
        }

        @Override
        public void onFinish() {
            super.onFinish();
            dismissDialog();
        }


    };
}
