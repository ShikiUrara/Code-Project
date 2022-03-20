package com.company;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue blockingQueue;
    int i = 0;
    private int StoreFull = 5;
    Producer(BlockingQueue queue) {
        blockingQueue = queue;
    }
    public void run() {

        try {
            Random random = new Random();
            int rd = random.nextInt(1000);
            while (true) {
                if(blockingQueue.size() == StoreFull)
                    System.out.println("Kho day - Ngung san xua\n" + blockingQueue);
                else
                    blockingQueue.put(produce());
                Thread.sleep(rd);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int produce() {
        System.out.println("Produce: " + i);
        return i++;
    }
}
