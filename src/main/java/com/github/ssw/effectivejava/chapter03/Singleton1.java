package com.github.ssw.effectivejava.chapter03;

public class Singleton1 {

    public static final Singleton1 singleton1 = new Singleton1();

    //인스턴스 갯수를 카운터를해서 리플렉션으로 싱클톤을 뚫는 것을 방지할 수 있다.
    int count;

    //한번 이상 호출시에러로 싱클톤 유지
    private Singleton1() {
        count++;
        if (count != 1) {
            throw new IllegalStateException("this object should be singleton");
        }
    }

}
