package com.github.ssw.effectivejava.chapter01;

import java.util.EnumSet;

import static com.github.ssw.effectivejava.chapter01.FactoryMethod.Color.BLACK;
import static com.github.ssw.effectivejava.chapter01.FactoryMethod.Color.RED;

public class FactoryMethod {

    String name;

    String address;

    public FactoryMethod() {
    }

    public FactoryMethod(String name) {
        this.name = name;
    }

    /**
     * 시그니처 제약 똑같은 타입을 파라미터로 받는 생성자 두개를 만들수 없다.
     */
    /*public FactoryMethod(String address){
        this.address = address;
    }*/
    public static FactoryMethod withName(String name) {
        return new FactoryMethod(name);
    }

    public static FactoryMethod withAddress(String address) {
        FactoryMethod factoryMethod = new FactoryMethod();
        factoryMethod.address = address;
        return factoryMethod;
    }

    /**
     * 리턴타입 반듯이 FactoryMethod 할필요 없다.
     * FactoryMethod의 하위타입으로도 리턴타입 가능
     */
    public static FactoryMethod getMethod(boolean flag) {
        return flag ? new FactoryMethod() : new BarFoo();
    }


    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod("seungwoo");

        FactoryMethod factoryMethod1 = FactoryMethod.withName("seungwoo");

        FactoryMethod factoryMethod2 = FactoryMethod.getMethod(true);

        EnumSet<Color> colors = EnumSet.allOf(Color.class);

        EnumSet<Color> colors1 = EnumSet.of(RED, BLACK);
    }

    static class BarFoo extends FactoryMethod {

    }

    enum Color {
        RED, BLACK, GREEN
    }

}
