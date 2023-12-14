/*
Task 11: Write some Java code that asks the user how many favorite things they have.
Based on their answer, you should create a String array of the correct size.
Then ask the user to enter the things and store them in the array you created.
Finally, print out the contents of the array.

 */
package com.array.java_Patrice;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int numOfThings = numInput.nextInt();
        String[] arr = new String[numOfThings];
        for (int i=0; i< numOfThings; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your thing: ");
            String str = input.nextLine();
            arr[i] = str;
        }

        System.out.println("Your favorite  things are: " + String.join(" " ,arr));
    }
}
