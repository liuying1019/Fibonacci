package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        for(int i=0;i<200;i++) {
            System.out.println("Fibonacci.of"+"("+(i+1)+")"+"=" +Fibonacci_of(i));
        }
        // write your code here
    }

    public static BigInteger Fibonacci_of(int j) {
        BigInteger num[]=new BigInteger[200];
        num[0]=new BigInteger("1");
        num[1]=new BigInteger("1");
        for(int i=2;i<200;i++){
            num[i]=num[i-1].add(num[i-2]);
        }
        return num[j];
    }
}

