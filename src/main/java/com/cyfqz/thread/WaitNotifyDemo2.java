package com.cyfqz.thread;

/**
 * waitnotify
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/09/06 00:10
 */
public class WaitNotifyDemo2 {

    public static void main(String[] args) {
        String a = "12345";
        String b = "abcde";

        char[] numArray = a.toCharArray();
        char[] letterArray = b.toCharArray();
        Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    for(char num : numArray){
                        System.out.print(num);
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        lock.notify();
                    }

                    lock.notify();
                }
            }
        },"线程1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    for(char letter: letterArray){
                        System.out.print(letter);
                        try {
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    lock.notify();
                }
            }
        },"线程2").start();
    }
}
