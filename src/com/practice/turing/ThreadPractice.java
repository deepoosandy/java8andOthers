package com.practice.turing;

import java.util.Collections;

public class ThreadPractice implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(""+Thread.currentThread().getName()+" ");

        }
      //  System.out.println();
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadPractice());
        Thread t2=new Thread(new ThreadPractice());

        t1.start();

        t2.start();

       /* try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // t3.start();
        t1.start();*/
    }
}
