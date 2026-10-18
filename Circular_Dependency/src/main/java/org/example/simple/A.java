package org.example.simple;

public class A {
    private  B b;
    public A(){
        System.out.println("Object of B is Created");
        this.b=new B();
    }
}
