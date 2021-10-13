package com.example.SpringIoCpractice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        //1、创建Spring的IOC容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");

        //2、从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        //3、调用hello方法
        helloWorld.getHello();

    }
}
