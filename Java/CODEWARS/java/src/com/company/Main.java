package com.company;

public class Main {
    public static String even_or_odd(int number) {
        if (number %2 == 0) return "even";
        else
            return "odd";

    }
    public static void main(String[] args) {
	System.out.print(even_or_odd(1));
    }
}
