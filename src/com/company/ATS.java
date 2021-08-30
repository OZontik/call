package com.company;

class ATS extends Thread {

    @Override
    public void run() {
        try {
            int call = 60;
            while (call > 0) {
                Thread.sleep(1000);
                long telNumber = Math.round(Math.random() * 300000);
                System.out.println("Входящий " + telNumber);
                Main.callQueue.add(telNumber);
                call--;
            }
        } catch (InterruptedException err) {
        }
    }
}
