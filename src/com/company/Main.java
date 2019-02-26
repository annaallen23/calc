package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int first = scanner1.nextInt();
        int second = scanner1.nextInt();


        System.out.println(first);
        System.out.println(second);

        Scanner scanner = new Scanner(System.in);
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

        System.out.println(calculate.calculate(first,second));
    }
}





