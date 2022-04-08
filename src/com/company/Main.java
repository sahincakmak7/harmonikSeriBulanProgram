package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        double result;
        System.out.print("N sayısını giriniz :");
        number = input.nextInt();
        result = 0;
        while (number > 0) {
            result += (1 / number);
            number--;
        }

        System.out.println("Harmonik seri :" + result);
    }
}
