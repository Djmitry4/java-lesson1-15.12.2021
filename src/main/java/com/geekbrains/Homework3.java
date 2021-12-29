package com.geekbrains;

public class Homework3 {
    public static void main(String[] args) {
        oneZero();
        oneHundred();
        lessThen();
        quadMass();
        int[] array = twoArguments(12,7);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }

    public static void oneZero() {
        int[] numb = {1, 0, 0, 0, 1, 1, 1, 0, 1, 0};
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] == 1) {
                numb[i] = 0;
            } else {
                numb[i] = 1;
            }
            System.out.print(numb[i] + " ");
        }
        System.out.println();
    }

    public static void oneHundred() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static void lessThen() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static void quadMass() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    arr[i][j] = 1;
                arr[i][arr.length - i - 1] = 1;
            }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] twoArguments(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        return array;
    }
}




