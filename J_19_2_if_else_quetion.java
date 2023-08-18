//package com.company;
import java.util.Scanner;
public class J_19_2_if_else_quetion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

        if (200000f <= a && a <= 499999f) {
//            System.out.println(a-(a*0.05));
            System.out.println(a-(a*5)/100);
        }
        else if (500000f <= a && a <= 999999f ) {
//            System.out.println(a-(a*0.2));
            System.out.println(a-(a*20)/100);
        }
        else if(1000000f <= a) {
            System.out.println(a-(a*0.03));
//            System.out.println(a-(a*30)/100);
        }
    }
}
