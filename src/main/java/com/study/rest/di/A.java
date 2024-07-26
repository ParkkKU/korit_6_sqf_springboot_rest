package com.study.rest.di;


public class A {

    private B b;

    public A(B b) {
    }

    public void aCall() {
        System.out.println("A 객체에서 메소드 호출");
        b.bCall();
    }
}
