package com.example.randomnumber;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int counter;
        Random rnum = new Random();
        /*
         * 10 random numbers are generated
         * between 0 and 100.
         */
        System.out.println("10 Random Numbers between 1 & 100:");
        System.out.println("***************");
        for (counter = 1; counter <= 10; counter++) {
            System.out.println(rnum.nextInt(100));
        }
    }
}
