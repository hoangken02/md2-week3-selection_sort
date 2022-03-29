package com.kenIT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your size list: ");
        int size = scanner.nextInt();
        double bS [] = new double[size];

        System.out.println("Enter " + size + " numbers : ");
        for (int i = 0; i < bS.length; i++) {
            bS[i] = scanner.nextDouble();
        }

        System.out.println("Before sorted: ");
        for (Double d:
             bS) {
            System.out.print(d + "\t");
        }
        System.out.println();


        selectionSort(bS);
    }

    public static void selectionSort(double [] list){
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < currentMin){
                    currentMinIndex = j;
                    currentMin = list[j];
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

            System.out.println("Array after " + (i + 1) + " sort: ");
            for (Double d:
                 list) {
                System.out.print(d + "\t");
            }
            System.out.println();
        }
    }
}
