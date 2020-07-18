package com.company;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Paths;
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

            System.out.println("Give a location of a text file, lets read it. We will tell you how many words there are.");
            String input_two = reader.nextLine();
            int word_counter = 0;

            try(Scanner tiedostonLukija = new Scanner(Paths.get(input_two))) {
                while (tiedostonLukija.hasNextLine()) {
                    String rivi = tiedostonLukija.nextLine();
                    System.out.println(rivi);
                    String[] a = rivi.split(" ");
                    word_counter += a.length;
                }
            } catch (Exception e) {
                System.out.println("Virhe!");
            }
            System.out.println("");
            System.out.println("The file had " + word_counter + " words!\n");

            String[] split = input.split(" ");
            System.out.println("There were " + split.length + " words in your sentence!\n");
        }
    }
}
