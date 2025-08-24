package com.itheima.chap05;

import com.itheima.chap05.Person;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();
        int age = 0;
        while (true) {
            System.out.println("请输入年龄：");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                break;
            } else {
                System.out.println("输入无效，请输入一个整数！");
                sc.next(); // 清除错误输入
            }
        }

        double weight = 0.0;
        while (true) {
            System.out.println("请输入体重：");
            if (sc.hasNextDouble()) {
                weight = sc.nextDouble();
                break;
            } else {
                System.out.println("输入无效，请输入一个浮点数！");
                sc.next(); // 清除错误输入
            }
        }

        boolean isSingle = false;
        while (true) {
            System.out.println("请输入是否单身（true/false）：");
            if (sc.hasNextBoolean()) {
                isSingle = sc.nextBoolean();
                break;
            } else {
                System.out.println("输入无效，请输入 true 或 false！");
                sc.next(); // 清除错误输入
            }
        }

        Person person = new Person(name, pwd, age, weight, isSingle);
        person.show();

        sc.close();

    }
}