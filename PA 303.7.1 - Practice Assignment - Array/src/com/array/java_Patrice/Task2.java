//Task 2: Write a program that returns the middle element in an array.
// Give the following values to the integer array: {13, 5, 7, 68, 2}
// and produce the following output: 7
package com.array.java_Patrice;
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {13, 5, 7, 68,2};
        System.out.println(findMiddleElement(arr)); ;
    }

   public static int findMiddleElement(int[] arr){
        int middle = arr.length /2;
        return arr[middle];
   }
}
