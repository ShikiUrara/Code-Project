package com.company;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue blockingQueue;
    Consumer(BlockingQueue queue) {
        blockingQueue = queue;
    }
    public void run() {
        try {

            // Cho san xuat lan dau
            Thread.sleep(500);

            // Bat dau tieu thu
            Random random = new Random();
            int rd = random.nextInt(1000);
            while (true) {
                if(blockingQueue.size() == 0) {
                    System.out.println("Het hang");
                }
                else
                    System.out.println("Consume: " + blockingQueue.take());
                Thread.sleep(rd);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void consume(Object take) {
        // No thing
    }
}
