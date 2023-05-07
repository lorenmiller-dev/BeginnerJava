package com.norel;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //takes user input
        System.out.println("Age:");
        int age = scanner.nextInt(); //takes int val from user input error if input is not an int
        System.out.println("You are " + age + " years old.");
    }
}
