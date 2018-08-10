package com.example.lib;

public class Danli1 {

        private String id;
        private String name;
        private static Danli1 d1;


        //创建静态方法，帮我们创建、管理对象
    public static Danli1 getInstance(){
        if(d1==null){
            d1=new Danli1();
        }


        return  d1;



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

    private Danli1() {
    }

    public Danli1(String id, String name) {

        this.id = id;
        this.name = name;
    }
}
