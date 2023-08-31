package com.cyfqz.inherit;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/** 继承的话，子类跟父类一定要建议一种联系，父类无参构造器一般需要写上，子类会自动调用父类的无参构造器*/
public class InheritDemo03 {

    public static void main(String[] args) {
        AA a = new BB("liqingan",31);
        a.showInfo();
    }
}


class AA{

    public AA(){
        System.out.println("hello,A");
    }

    public void showInfo(){}; // 必须得加上，多态情况下不然会报错，子类找不到showInfo

}

class BB extends AA{

    private String name;
    private int age;


    public BB(){
        System.out.println("hello B");
    }

    public BB(String name,int age){
        super();// 影藏的调用
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("name="+name+",age="+age);
    }
}
