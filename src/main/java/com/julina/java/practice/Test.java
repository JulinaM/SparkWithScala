package com.julina.java.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by julina on 2/24/17.
 */
public class Test {

    public static void reverse(int[] a) {
        System.out.println("Before");
        for (int i : a) {
            System.out.print(i+" ");
        }
        for (int i = 0; i < a.length-1; i++) {
            int temp = a[i];
            a[i] = a[a.length-1];

            for (int j = a.length-1; j >i+1; j--) {
                a[j]= a[j-1] ;
            }

            a[i+1] = temp;
        }
        System.out.println("\nAfter Reverse: ");
        for (int i : a) {
            System.out.print(i+ " " );
        }
    }

    Map hasmap = new HashMap();
}
