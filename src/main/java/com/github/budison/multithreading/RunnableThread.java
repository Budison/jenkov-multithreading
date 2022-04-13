package com.github.budison.multithreading;

/**
 * @author Kevin Nowak
 */
class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("RunnableThread running...");
    }
}
