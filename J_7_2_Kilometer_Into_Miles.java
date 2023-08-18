//package com.company;
import java.util.Scanner;
public class J_7_2_Kilometer_Into_Miles {
    public static void main(String[] args){
        System.out.println("Enter the kilometer");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        System.out.println("miles is "+km*0.621371);
    }
}
