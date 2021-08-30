package com.company;

class Operator extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            while (Main.callQueue.peek() != null) {
                Thread.sleep(3000);
                long telNumber = Main.callQueue.remove();
                System.out.println(telNumber + " принят");
            }
        } catch (InterruptedException err) {
        }
    }
}
