package com.github.ssw.effectivejava.chapter03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class SingleTesat {


    public static void main(String[] args) throws NoSuchMethodException {
        //Songleton1 private 생성자이라 new로 인스턴스 생성할수 없다.
        //Singleton1 singleton1 = new Singleton1();
        Singleton1 singleton1 = Singleton1.singleton1;
        Singleton2 singleton2 = Singleton2.getInstance();
        Supplier<Singleton2>  s2supplier = Singleton2::getInstance;
        //enum 상위 클래스 상속 할수없다. 인터페이스 구현 가능
        String name = Singleton3.INSATANCE.getName();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserService userService1 = applicationContext.getBean(UserService.class);
        UserService userService2 = applicationContext.getBean(UserService.class);
        //scope 기본은 singleton userService1 == userService2 true
        System.out.println(userService1 == userService2);

    }

}
