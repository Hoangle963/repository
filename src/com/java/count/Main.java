package com.java.count;

public class Main {

    public static final int MAX = 50;

    public static void main(String[] args) {
        int intValue = 0;
        int iCount = 0;

        for (int i = 0; i < MAX; i++) {
            if (i % 2 == 0) {
                intValue = intValue + i;
            } else {
                intValue = intValue * i;
            } // end if-else
        } // end for

        System.out.println("Final value of intValue: " + intValue);
    }
}
