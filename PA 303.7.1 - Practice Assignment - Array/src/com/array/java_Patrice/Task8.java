package com.array.java_Patrice;

/*
Task 8: Write a program that creates a String array of 5 elements
and swaps the first element with the middle element without creating a new array.

 */

import java.util.Arrays;
public class Task8 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e"};
        String firstElmnt = arr[0];
        String middleElmnt = arr[2];
        String temp = firstElmnt;
        arr[0] = middleElmnt;
        arr[2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
