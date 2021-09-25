package com.company;

import java.util.*;

public class Main {
    public static String decode(String morseCode) {
        char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?'};   /* Defining a Character Array of the English Letters numbers and Symbols
            so that we can compare and convert later */

        final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};  /* Defining an Array of String to hold the Morse Code
         value of Every English Letter,Number and Symbol in the same order as that of the character Array */
        int licznik = 0;
        StringBuilder output = new StringBuilder();
        StringBuilder literka = new StringBuilder();
        StringBuilder morsliterka = new StringBuilder();

        for (int i = 0; i < morseCode.length(); i++) {
            if(morseCode.charAt(i) == ' '){
                licznik++;

            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
    }
}
