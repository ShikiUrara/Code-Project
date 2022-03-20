package com.company;

import javax.swing.*;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.getExtendedKeyCodeForChar;
import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) throws IOException {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(5);

        Producer p = new Producer(blockingQueue);
        Consumer c = new Consumer(blockingQueue);
        Consumer c1 = new Consumer(blockingQueue);

        // Tao luong
        Thread t = new Thread(p);
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c1);


//        // Luong san xuat
//        new Thread(p).start();
//        // Luong tieu thu
//        new Thread(c).start();
//        new Thread(c1).start();

        t.start();
        t1.start();
        t2.start();

        // Tao giao dien de bat su kien key event
//        JFrame jFrame = new JFrame("Key Event");
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setSize(450, 500);
//        jFrame.addKeyListener(new KeyEvent());
//        jFrame.setVisible(true);

        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.exit(0);

    }
}
