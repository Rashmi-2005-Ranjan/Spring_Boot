package org.example.simple;

public class B {
    private A a;

    public B() {
        System.out.println("Object of A is created");
        this.a = new A();
    }
}
