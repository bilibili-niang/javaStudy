package com.itheima.chap04;

public class Person {
    private String name;
    private String pwd;
    private int age;
    private double weight;
    private boolean isSingle;

    //  一个构造函数
    public Person(String name, String pwd, int age, double weight, boolean isSingle) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.weight = weight;
        this.isSingle = isSingle;

    }

    // 输出用户信息
    public void show() {
        System.out.println("用户名：" + name);
        System.out.println("密码：" + pwd);
        System.out.println("年龄：" + age);
        System.out.println("体重：" + weight);
        System.out.println("是否单身：" + isSingle);
        System.out.println("------------------");
    }
}
