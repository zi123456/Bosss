package com.example.lib;

public class Test {
    public static void main(String[] args) {
        Danli1 d1= Danli1.getInstance();
        Danli1 d2= Danli1.getInstance();
        System.out.println(d1==d2);


    }

}
