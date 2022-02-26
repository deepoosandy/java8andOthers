package com.practice.turing;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariablesTest {
    public static void main(String[] args) {
        AtomicInteger ii=new AtomicInteger();
        Executor er= Executors.newScheduledThreadPool(1);
        try{
            er.execute(new Runnable() {
                @Override
                public void run() {

                }
            });
        }catch (Exception e){

        }

    }
}
