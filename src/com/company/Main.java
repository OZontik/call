package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    static ConcurrentLinkedQueue<Long> callQueue = new ConcurrentLinkedQueue();
    static Runnable ats1 = new ATS();
    static Runnable operator1 = new Operator();
    static ThreadGroup mainGroup = new ThreadGroup("main group");
    static Thread ats = new Thread(mainGroup, ats1, "ats");
    static Thread operator = new Thread(mainGroup, operator1, "operator");

    public static void main(String[] args) throws InterruptedException {
        ats.start();
        operator.start();
        ats.join();
        operator.join();
    }
}
