package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number with comma");
        double number=input.nextDouble();
        double digit=(int) number;
        System.out.println("number " + digit);
    }
}
