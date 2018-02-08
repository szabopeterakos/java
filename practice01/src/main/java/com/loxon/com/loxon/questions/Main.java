package com.loxon.com.loxon.questions;

import java.util.Comparator;


class Runner implements Runnable {
    private static int sum = 0;

    public synchronized int addSum() {
        return sum++;
    }

    public void run() {
        for (int i = 0; i < 3000; i++) {
            addSum();
        }
        System.out.println(sum);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");
        Thread thread = new Thread(new Runner());
        Thread thread2 = new Thread(new Runner());
        thread.start();
        thread2.start();

    }

}
