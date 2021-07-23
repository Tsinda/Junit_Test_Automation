package com.phil;

import java.util.ArrayList;

public class Calculator {
    public static double add(double a, double b){
        return a+b;
    }
    public static double multiply(double x, double y){
        return x*y;
    }

    public static double compareThreeNumbers(double n1, double n2, double n3){
        if (n1>n2 && n1>n3){
            return n1;
        }
        else{
            if (n2>n3){
                return n2;
            }
            else {
                return n3;
            }
        }
    }

    public static boolean Palindrome(String original){
        String reverse = "";
        for (int i=original.length()-1; i>=0 ;i--){
            reverse = reverse + original.charAt(i);
        }
        if (reverse.equalsIgnoreCase(original)){
            return true;
        }
        return false;
    }
}
