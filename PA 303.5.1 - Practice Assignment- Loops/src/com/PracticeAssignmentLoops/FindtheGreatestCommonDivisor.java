package com.PracticeAssignmentLoops;

import java.util.Scanner;

public class FindtheGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first positive number: ");
        int n1 = sc.nextInt();
        System.out.println("enter the second positive number: ");
        int n2 = sc.nextInt();

        int gcd = 1;

        for(int i = 2 ; i<= n2; i++){
            if(n1 % i == 0 && n2 % i == 0){
                if(i > gcd){
                    gcd = i;
                }
            }
        }
        System.out.println(gcd);
    }
}
