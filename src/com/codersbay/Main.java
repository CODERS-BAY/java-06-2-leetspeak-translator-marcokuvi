package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void replaceChar(String word) {

        if (word.contains("A")) {
            word = word.replace("A", "@");
        }
        if (word.contains("B")) {
            word = word.replace("B", "8");
        }
        if (word.contains("C")) {
            word = word.replace("C", "(");
        }
        if (word.contains("E")) {
            word = word.replace("E", "3");
        }
        if (word.contains("F")) {
            word = word.replace("F", "0");
        }
        if (word.contains("G")) {
            word = word.replace("G", "6");
        }
        if (word.contains("H")) {
            word = word.replace("H", "#");
        }
        if (word.contains("I")) {
            word = word.replace("I", "!");
        }
        if (word.contains("L")) {
            word = word.replace("L", "1");
        }
        if (word.contains("O")) {
            word = word.replace("O", "0");
        }
        if (word.contains("S")) {
            word = word.replace("S", "$");
        }
        if (word.contains("T")) {
            word = word.replace("T", "7");
        }
        if (word.contains("Z")) {
            word = word.replace("Z", "2");
        }
        System.out.println(word);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your word in uppercase?");
        String word = scan.nextLine();
        replaceChar(word);

    }
}
