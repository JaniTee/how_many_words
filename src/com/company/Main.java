package com.company;
import java.util.Scanner;

// A program that counts how many words is in a string.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Input a sentence, let's count how many words there are. Type quit to quit.");

            String input = reader.nextLine();   //Users input

            if(input.equals("quit")) {
                break;
            }

            String[] split = input.split(" ");
            System.out.println("There were " + split.length + " words in your sentence!");
        }
    }
}
