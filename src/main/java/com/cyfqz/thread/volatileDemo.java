package com.cyfqz.thread;

import jdk.nashorn.internal.ir.TernaryNode;

public class volatileDemo {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
        test.setContinue(false);
    }
}

class Test{

    private boolean isContinue = true;

    public void setContinue(boolean isContinue){
        this.isContinue = isContinue;
    }

    public void test(){
        while(isContinue){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("当前执行线程是:"+Thread.currentThread().getName()+",状态:"+this.isContinue);
        }
    }
}
