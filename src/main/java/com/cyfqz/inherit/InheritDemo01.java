package com.cyfqz.inherit;


/**继承必须把子类跟父类的构造器建立一种关系。supper关键字相当于一种桥梁*/
public class InheritDemo01 {

    public static void main(String[] args) {
        Son son = new Son("liqiangan",30);
        son.showSonInfo();
        son.showInfo();
    }
}


class Father{

    public String name;

    public int age;

    public Father(){};
    public Father(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("name="+name+",age="+age);
    }
}


class Son extends Father{
    private String name ;

    private int age;

    public Son(){

    }

    public Son(String name,int age){
//        super("lichuhua",58);
        this.name = name;
        this.age = age;
    }

    public Son(String name){
        this.name = name;
    }

    public void showSonInfo(){
        System.out.println("name="+name+",age=" + age);
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("------>name="+name+",age=" + age);
    }
}