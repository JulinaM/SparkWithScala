package com.julina.java.practice;

/**
 * Created by julina on 2/24/17.
 */
public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(function(4));
    }

    public static int function(int n){
        if(n <= 0) return 1;
        int gn = n*n;
        for (int i = n-1; i > 1; i--) {
            if(i*i > n ) {
                gn = i*i;
            }
            else {
                break;
            }

        }
        return gn;
    }
}
