package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length: ");
        int length = scanner .nextInt();
        int[] inputNumbers = new int[length];
        for (int i=0; i<=length-1; i++) {
            System.out.print("Please enter a number: ");
            inputNumbers[i] = scanner .nextInt();
        }

        System.out.print("Please enter an operation: ");
        String operation = scanner.next();

        Cancalculate calculate;

        if (operation.equals("+")) {
            calculate = new Add();
        } else if (operation.equals("*")) {
            calculate = new Multiply();
        } else if (operation.equals ("-")) {
            calculate = new Minus();
        }else if (operation.equals ("/")) {
            calculate = new Divide();
        } else {
            return;
        }

        int answer = inputNumbers[0];
        for (int i=1; i<=length-1; i++){
            answer = calculate.calculate(inputNumbers[i],answer);
        }

        System.out.println(answer);
    }
}





