package com.PracticeAssignmentLoops;

public class PredictFutureTuition {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.07; // 7% as a decimal
        double futureValue = principal * 2; // Double the principal

        int years = 0;
        while (principal < futureValue) {
            principal *= (1 + rate);
            years++;
        }

        System.out.println("It takes " + years + " years for the tuition to double.");
    }
}
