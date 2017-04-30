package com.julina.java.practice;

/**
 * Created by julina on 2/24/17.
 */
public class nCount {
    public static void main(String[] args) {
        System.out.println(ncountfunc(new int[] {2, 3, 1, -6, 8, -3, -1, 2, 9}, 5));
    }

    public static int ncountfunc(int[] array, int n){
        int sum = array[0];
        int upcount = 0;
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            if(sum > n){
                upcount++;
            }
        }
        return upcount;
    }
}
