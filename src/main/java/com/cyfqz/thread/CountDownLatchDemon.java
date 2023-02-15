package com.cyfqz.thread;

import java.util.concurrent.CountDownLatch;

// CountDownLatch 名为线程栓，在线程中调度，就阻塞当前线程
public class CountDownLatchDemon {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0;i < 9 ;i ++){
            Animal animal = new Animal("dog",10,countDownLatch);
            animal.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("我是主线程,我的名字是:"+Thread.currentThread().getName()+countDownLatch.getCount());

    }
}

class Animal extends Thread{
    private int age;
    private String name;
    private CountDownLatch countDownLatch;

    public Animal(String name,int age,CountDownLatch countDownLatch){
        this.age = age;
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("当前线程是:"+Thread.currentThread().getName()+",我是"+name+",我的年龄是:"+age+","+countDownLatch.getCount());
    }
}
