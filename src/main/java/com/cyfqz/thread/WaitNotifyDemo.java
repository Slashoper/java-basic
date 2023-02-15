package com.cyfqz.thread;

import java.util.List;

public class WaitNotifyDemo {

    public static void main(String[] args) {
        Car car = new Car("宝马X3","德国");
        new Producer("producer",car).start();
        new Consumer("consumer",car).start();
    }
}

class Producer extends Thread{
    private Car car;

    public Producer(String name,Car car){
        super(name);
        this.car = car;
    }

    @Override
    public void run() {
        while ( true ){
            synchronized (car) {
                if (car.isFlag()) {
                    try {
                        car.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("【"+Thread.currentThread().getName()+"】，我正在生产汽车:" + car.toString());
                car.setFlag(true);
                car.notifyAll();
            }
        }
    }
}

class Consumer extends Thread{
    private Car car;

    public Consumer(String name,Car car){
        super(name);
        this.car = car;
    }

    @Override
    public void run() {
        while ( true ){
            synchronized (car) {
                if (car.isFlag()) {
                    try {
                        Thread.sleep(3000);// 补充消费业务
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("【"+Thread.currentThread().getName()+"】，我消费了一台车：" + car.toString());
                    car.setFlag(false);
                    car.notifyAll();
                }
                try {
                    car.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class Car{
    private String name;
    private String model;
    private boolean flag;


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Car(String name, String model){
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

