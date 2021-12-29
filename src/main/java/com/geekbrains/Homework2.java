package com.geekbrains;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(checkSum(2, 2));
        checkNum();
        System.out.println((checkNegativity(0)));
        stringNum("число", 15);
        System.out.println(year());
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (10 < a + b && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void checkNum() {
        int a = 0;
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public static boolean checkNegativity(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void stringNum(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a + " ");
        }
    }
    public static boolean year() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nВвведите год: ");
        int year = in.nextInt();
        if(year % 4 == 0 && year % 100!= 0 || year % 400 == 0) {
            return true;
        }else{
            return false;
        }

    }
}



