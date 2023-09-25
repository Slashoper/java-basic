package com.cyfqz.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Rentranlock详解
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/09/04 23:29
 */
public class RentTranLock {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        try{
            lock.lock();
        }finally {
            lock.unlock();
        }
    }
}
