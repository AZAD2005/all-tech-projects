package com.ska;

public class Parent {
    void m1(){
        System.out.println("Hii i am the parent class..!");
    }
    void m2(){
        System.out.println("Hii i am 2nd p class..!");
    }
    void m3(){
        System.out.println("hii i am 3rd p class...@");
    }
}
class Child extends Parent {

    void m1() {
        System.out.println("Hii i am child 1...!");

    }
    void m2(){
        System.out.println("Hii iam the 2nd child...!");
    }
}
