package com.github.budison.multithreading;

/**
 * @author Kevin Nowak
 */
class SubThread extends Thread {

    @Override
    public void run() {
        System.out.println("SubThread running...");
    }
}
