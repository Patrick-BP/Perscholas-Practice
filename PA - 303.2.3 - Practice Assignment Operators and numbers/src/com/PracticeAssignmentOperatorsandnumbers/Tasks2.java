package com.PracticeAssignmentOperatorsandnumbers;

public class Tasks2 {
    public static void main(String[] args) {
        int x = 150;
        System.out.println(Integer.toBinaryString(x));
        // Predicted decimal value after left shift by 2: 37
        // Predicted binary string: "100101"
        x = x >> 2;
        System.out.println("Decimal Form : " + x);
        System.out.println("Binary Notation: " + Integer.toBinaryString(x));
    }
}
