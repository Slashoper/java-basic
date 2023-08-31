package com.cyfqz.inherit;


/** Java 类的继承只有单继承，接口可以多继承*/
public class InheriDemo02 {
    public static void main(String[] args) {

    }
}


abstract class A{
    public void f1(){};
}

abstract class B extends A{
    public void f1(){};
    public  abstract void f2();
}

abstract class C extends B{

}

interface E{
    public void f1();
}

interface F{
    public void f2();
}

interface G extends E,F{

}
