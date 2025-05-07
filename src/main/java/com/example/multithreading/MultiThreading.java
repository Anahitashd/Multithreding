package com.example.multithreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Runner1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner1: "+i);
        }
    }
}

class Runner2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner2: "+i);
        }
    }
}


@SpringBootApplication
public class MultiThreading {
    public static void main(String[] args) {
        SpringApplication.run(MultiThreading.class, args);
        //  achieve multi-threading
        Thread t1 = new Thread(new Runner1(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runner1: "+i);
                }
            }
        });
        Thread t2 = new Thread(new Runner2(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runner2: "+i);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
