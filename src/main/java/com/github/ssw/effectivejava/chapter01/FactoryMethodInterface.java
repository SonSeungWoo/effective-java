package com.github.ssw.effectivejava.chapter01;

public interface FactoryMethodInterface {

    public static FactoryMethod getMethod(){
        return new FactoryMethod();
    }
}
