package com.example.lib;

public class Danli2 {//第二种单例模式  直接创建好一个d1
    private String id;
    private String name;
    private static Danli2 d1=new Danli2();


    //创建静态方法，帮我们创建、管理对象
    public static  Danli2 getInstance(){

        return d1;





    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Danli2() {
    }

    public Danli2(String id, String name) {

        this.id = id;
        this.name = name;
    }
}
