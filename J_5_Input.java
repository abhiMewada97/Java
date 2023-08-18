// package com.company;
import java.util.Scanner;

public class J_5_Input {
    public static void main(String[] args){
        System.out.println("Taking the input ");
        Scanner abhi = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int a = abhi.nextInt();
//        System.out.println("Enter the second number");
//        int b = abhi.nextInt();
//        int sum = a+b;
//        System.out.println("The sum is : "+sum);
//
//        System.out.println("Enter the value");
//        boolean ch = abhi.hasNextInt();  //it will check it is int value true,false
//        System.out.println(ch); 

        System.out.println("Enter the string ");
//        String str = abhi.next(); // it will read only one word
        String str = abhi.nextLine(); // it will read only one line
        System.out.println(str);
    }
}
