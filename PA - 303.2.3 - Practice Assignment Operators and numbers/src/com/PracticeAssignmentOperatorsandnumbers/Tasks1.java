package com.PracticeAssignmentOperatorsandnumbers;

public class Tasks1 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        // Predicted decimal value after left shift by 1: 4 (2 << 1)
        // Predicted binary string: "100" (binary representation of 4)
        x = x << 1;
        System.out.println("Decimal Form : " + x);
        System.out.println("Binary Notation: " + Integer.toBinaryString(x));
    }
}
