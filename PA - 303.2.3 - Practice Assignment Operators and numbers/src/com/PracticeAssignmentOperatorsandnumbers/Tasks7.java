package com.PracticeAssignmentOperatorsandnumbers;

import java.util.Scanner;

public class Tasks7 {
    public static void main(String[] args) {

//        int x = 5;
//        int y = 8;
////        int sum = y + (++x) ;  //14
//        int sum = y + (x++) ; // 13
//        System.out.println(sum);

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String newStr = "";
        for(int i=0; i<A.length(); i++){

            newStr = A.substring(i, i+1) + newStr;

        }

        if(newStr.equals(A)){

            System.out.println("Yes");
        }else{

            System.out.println("No");
        }

    }
}
