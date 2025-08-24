package com.itheima.chap05;

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

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
