/*
Task 7: Write a program where you create an array of 5 elements.
Loop through the array and print the value of each element,
except for the middle (index 2) element.

 */
package com.array.java_Patrice;
public class Task7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0; i< arr.length; i++){
            if(i == 2){
                continue;
            }else{
                System.out.println(arr[i]);
            }
        }
    }
}
