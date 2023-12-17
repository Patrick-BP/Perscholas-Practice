package com.PracticeAssignmentOperatorsandnumbers;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z;
        // Comment predicting the result of bitwise AND operation: 7 & 17 -> 1
        // Binary representation: 0111 & 10001 -> 0001

        // Use bitwise AND operator to derive decimal and binary values and assign to z
         z = x & y;

        // Print the results
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Predicted Result of x & y: 1");
        System.out.println("Decimal Value of z: " + z);
        System.out.println("Binary Value of z: " + Integer.toBinaryString(z));


    }
}
