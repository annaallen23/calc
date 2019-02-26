package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int first = random.nextInt(100);
        int second = random.nextInt(100);

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



