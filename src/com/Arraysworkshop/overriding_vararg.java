package com.Arraysworkshop;



    class Animal{ }
    class Dog extends Animal{ }
    class Parent{
     Animal m1() {
        System.out.println("parent m1");
        return new Animal(); }
    }
    class Child extends Parent{

//        Animal m1(){   gives syntax error : wrong method declaration
//
//        }
        Dog m1(){
           System.out.println("child m1");
           return new Dog();
        }
        public static void main(String[] args){
            Parent p = new Parent();
            Animal a = p.m1();
            Child c = new Child();
            Dog d = c.m1();
        }
    };


