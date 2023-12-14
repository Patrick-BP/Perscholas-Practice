/*
Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
Print the array in ascending order, and print the smallest and the largest element of
the array. The output will look like the following:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 0
The biggest number is 13

 */

package com.array.java_Patrice;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = {4,2,9,13,1,0};
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));
        System.out.println("The smallest number: " + numbers[0]);
        System.out.println("The biggest number: " + numbers[numbers.length-1]);
    }
}
