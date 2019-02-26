package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1= new Scanner (System.in);
        int first = scanner1.nextInt ();
        int second = scanner1.nextInt ();


        System.out.println(first);
        System.out.println(second);

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();

        if (operation.equals("+")) {
            System.out.println(first + second);
        } else if (operation.equals("x")) {
            System.out.println(first * second);
        } else if (operation.equals("-")) {
            System.out.println(first - second);
        } else if (operation.equals("/")) {
            System.out.println(first / second);
        }
    }

}



