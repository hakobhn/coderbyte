package com.example.easy;

import java.util.Scanner;

/**
 *                  CODERBYTE BEGINNER CHALLENGE                                        *
 *                                                                                      *
 *  First Factorial                                                                     *
 *  Using the Java language, have the function CheckNums(num1,num2) take both     *
 *  parameters being passed and return the string true if num2 is greater than num1,    *
 *  otherwise return the string false. If the parameter values are equal to each other  *
 *  then return the string -1                                                           *
 *                                                                                      *
 *  SOLUTION                                                                            *
 *  This solution has to use an If...else if...else  statement since you will be        *
 *  comparing for three different comparisons.
 */
class CheckNums {

    public static String CheckNums(int num1, int num2) {

        if (num2 > num1)
            return "true";
        else if (num2 < num1)
            return "false";
        else
            return "-1";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CheckNums(s.nextInt(), s.nextInt()));
    }
}

