//package com.company
import java.util.Scanner;

public class J_12_3_Check_Number_Greater_Or_Not {
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        System.out.println("This number is greater than 8 "+num > 8);  //This will not work byg
        System.out.println("This number is greater than 8 ");
        System.out.println(num > 8);
    }
}
