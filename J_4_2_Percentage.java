//package com.company;
import java.util.Scanner;

public class J_4_2_Percentage {
    public static void main(String[] args){
        System.out.println("Enter the subject number");
        Scanner sub = new Scanner(System.in);
        int mathes = sub.nextInt();
        int eng = sub.nextInt();
        int hindi = sub.nextInt();
        double per = (mathes+eng+hindi)/3.0;

        System.out.println("Percentage is "+per);
    }
}
