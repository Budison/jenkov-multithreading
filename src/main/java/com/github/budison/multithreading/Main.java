package com.github.budison.multithreading;

public class Main {

    public static void main(String[] args) {

        // MyThread class extending the Thread class
        SubThread thread1 = new SubThread();
        thread1.start();

        // Anonymous subclass
        Thread thread2 = new Thread() {
            public void run() {
                System.out.println("Anonymous SubThread running...");
            }
        };
        thread2.start();

        // Class implementing Runnable
        Runnable runnable1 = new RunnableThread();
        Thread thread3 = new Thread(runnable1);
        thread3.start();

        // Anonymous class implementing Runnable
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous RunnableThread running...");
            }
        };
        Thread thread4 = new Thread(runnable2);
        thread4.start();

        // Lambda Implementation
        Runnable runnable3 = () -> {
            System.out.println("Lambda RunnableThread running...");
        };
        Thread thread5 = new Thread(runnable3);
        thread5.start();
    }
}	
