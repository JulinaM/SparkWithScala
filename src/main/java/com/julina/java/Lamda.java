package com.julina.java;

/**
 * Created by jmaharjan on 1/6/17.
 */

public class Lamda {

    public static void main(String[] args) {
        String name = "Julina";
        test runnable = () -> System.out.println("Hello");
        runnable.stop();
    }


    public interface test{
//        public void run();
        public void stop();
    }

}
