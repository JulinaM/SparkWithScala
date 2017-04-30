package com.julina.java.practice;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by julina on 2/24/17.
 */
public class NiceArray {

     static boolean niceArrayFunc(int[] array){
        boolean isNiceArray = false;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            for (int j = 0; j < array.length ; j++) {
                if(i !=j ){
                    int newValue = array[j];
                    if(value -1 == newValue || value+1 == newValue){
                        isNiceArray = true;
                        break;
                    }
                    else {
                        isNiceArray = false;
                    }
                }
            }
            //System.out.println(value+ "::"+ isNiceArray);
            if(!isNiceArray) return false;
        }
        return true;
    }


    static boolean isBunkerArray(int[] array){
        boolean hasOne = false;
        boolean hasPrime = false;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1 && !hasOne) hasOne = true;
            if(isPrime(array[i])){
                hasPrime = true;
            }
            if(hasOne && hasPrime) return true;
        }
        return hasOne && hasPrime;
    }

    static boolean isPrime(int value){
        if(value == 1 || value == 0) return false;
        if(value == 2) return true;
        for (int i = 2; i <= value/2; i++) {
           if(value % i == 0 ){
               return false;
           }
        }
        return true;
    }

    static boolean isMeeraNumber(int number){
        List<Integer>  result = getFactorial(number);
        for (int i = 0; i < result.size(); i++) {
            if(result.get(i) == result.size()){
                return true;
            }
        }
        return false;
    }

    static List<Integer> getFactorial(int number){
        List<Integer>  result = new ArrayList<Integer>();

        for (int i = number-1; i > 1; i--) {
            if(number % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    static boolean isBeanArray(int[] array){
        boolean has9andhas13 = true;
        boolean has7butnot16 = true;

        if(containsNumber(array, 9)){
            has9andhas13 = containsNumber(array, 13);
        }
        if(containsNumber(array, 7)){
            has7butnot16 = !containsNumber(array, 16);
        }
        return has9andhas13 && has7butnot16;
    }

    static boolean containsNumber(int[] array, int number){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }

    static boolean isWaveArray(int[] array){

        for(int i = 0 ; i< array.length ; i++){
            if(isAdjacentSimilar(array[i] , array[i+1]))
            return false;
            if(i == array.length -2) break;
        }
        return true;
    }


    static boolean isAdjacentSimilar(int a, int b){
        if(a % 2 != 0) {
            return (b %2 != 0);
        }
	else{ // a is even
            return b%2 ==0;
        }

    }

    static int getMinPrimeDistance(int number){
        List<Integer> factorialsWithPrime = new ArrayList<Integer>();

        for (int i = number; i > 0; i--) {
            if(number%i == 0){
                if(isPrime(i) || i ==1) {
                    factorialsWithPrime.add(i);
                }
            }
        }

        System.out.println(factorialsWithPrime);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < factorialsWithPrime.size(); i++) {
            for (int j = i; j < factorialsWithPrime.size()-1; j++) {
                int diff = factorialsWithPrime.get(i) - factorialsWithPrime.get(j+1);
                diff = (diff < 0) ? -(diff ): diff;
                if(diff < result){
                    result = diff;
                }
            }
        }
        return result;
    }

    static boolean isBunkerOddArray(int[] array){
        boolean isbunker = true;

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] %2 != 0){
                //check followed by prime
                if(isPrime(array[i+1])){
                    return true;
                }
                else {
                    isbunker = false;
                }
            }
        }
        return isbunker;
    }

    static int countDigit(int n, int digit){
        int[] result = splitDigit(n, new int[10], 0);
        int counter = 0;
        for (int i = 0; i < result.length; i++) {
            System.out.print(" "+ result[i]);

            if(digit == result[i]){
                counter++;
            }
        }
        return counter;
    }

    static int[] splitDigit(int n, int[] result, int index){
        //System.out.println(index + " "+ n %10);
        if(n  < 10){
            result[index] = n;
            return result;
        }
        else {
            result[index++] =  n %10;
            return splitDigit(n/10, result, index);
        }
    }

    //wrong TODO
    static boolean isHollow(int[] array){
        if(array.length %2 == 0 || array.length<5) return false;
        int midIndex = array.length/2;
        if(array[midIndex -1] == 0 && array[midIndex ] == 0 && array[midIndex+1] == 0){
            for (int i = 0; i < midIndex; i++) {
                if(array[i] == 0 || array[array.length-i-1] == 0) return false;
            }
            return true;
        }
        else {
            return false;
        }
    }

    static boolean twinoid (int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0){
                if(i+1== array.length || array[i+1]%2 !=0){
                    return false;
                }
                i = i+1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println("Is nice Array :"+ niceArrayFunc(new int[]{1,9,0,2, 10,-1, -5,11}));
     /*   System.out.println("Is Prime :"+ isPrime(23));
        System.out.println("Is bunker Array :"+ isBunkerArray(new int[]{3,2,5,9,1}) );
        System.out.println("Is Meera Number :"+ isMeeraNumber(30) );
        System.out.println("Factorials :"+ getFactorial(30) );
        System.out.println("Is Bean Array : "+ isBeanArray(new int[]{1,2,3,9,6,13}));
        System.out.println("Is adjacentSimilar: "+ isAdjacentSimilar(4,9));
        System.out.println("Is wave Array: "+ isWaveArray(new int[]{2,3,4,5}));
        System.out.println("Min Prime Difference: "+ getMinPrimeDistance(13013));
        System.out.println("Is Bunker Odd Array: "+ isBunkerOddArray(new int[]{4,9,6,5,23}));*/
        System.out.println("Count Digit: "+ countDigit(77886636, 6));
        System.out.println("Twinoid: "+ twinoid(new int []{1,2,4,3,4,6,1,8,0}));
        System.out.println("Is hollow: "+ isHollow(new int []{1,2,0,0,0,6,9}));

        System.out.println(new char[]{'a', 'b','c','d'});
    }
}
