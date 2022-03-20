package com.company;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(5);

        Producer p = new Producer(blockingQueue);
        Consumer c = new Consumer(blockingQueue);
        Consumer c1 = new Consumer(blockingQueue);


        // Luong san xuat
        new Thread(p).start();

        // Luong tieu thu
        new Thread(c).start();
        new Thread(c1).start();

        if() {
            System.exit(o);
        }
        


    }
}
