
package test;

import java.util.LinkedList;
import java.util.Queue;

public class Threadexample {
    public static void main(String[] args)
        throws InterruptedException
    {
        // Object of a class that has both produce()
        // and consume() methods
        final PC pc = new PC();
 
        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Start both threads
        t1.start();
        t2.start();
 
        // t1 finishes before t2
        t1.join();
        t2.join();
    }
 
    // This class has a list, producer (adds items to list
    // and consumer (removes items).
    public static class PC {
 
        // Create a list shared by producer and consumer
        // Size of list is 2.
        Queue<Integer> list = new LinkedList<>();
        int capacity = 10;
 
        // Function called by producer thread
        public void produce() throws InterruptedException
        {
            int value = 0;
            while (true) {
                synchronized (this)
                {
//                	System.out.println("DANG SAN XUAT");
                    // producer thread waits while list
                    // is full
                    while (list.size() == capacity){
                    	System.out.println("Full");
                    	wait();
//                    	System.out.println("DANG SAN XUAT");
                    }
                        
                   
                    System.out.println("San xuat: "
                            + value);
                    // to insert the jobs in the list
                    list.add(value++);
                    System.out.println("Kho: " + list);
                    // notifies the consumer thread that
                    // now it can start consuming
                    
                    notify();
                    
                    // makes the working of program easier
                    // to  understand
                    Thread.sleep(2000);
                }
            }
        }
 
        // Function called by consumer thread
        public void consume() throws InterruptedException
        {
            while (true) {
                synchronized (this)
                {
//                	System.out.println("DANG MUA");
                    // consumer thread waits while list
                    // is empty
                    while (list.size() == 0){
                    	System.out.println("Chay hang");
                    	wait();
//                    	System.out.println("DANG MUA");
                    }
                        
                    
                    
 
                    // to retrieve the ifrst job in the list
                    int val = list.remove();
 
                    System.out.println("Tieu thu: "
                                       + val);
 
                    // Wake up producer thread
                    
                    notify();
                    
                    // and sleep
                    Thread.sleep(5000);
                }
            }
        }
    }
}
