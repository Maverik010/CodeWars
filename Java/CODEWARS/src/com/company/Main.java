package com.company;

public class Main {

    public static int factorial(int n){
        if(n < 0 || n > 12) throw new IllegalArgumentException();
        if (n == 0) return 1;
        else
            try {
                return n * factorial(n - 1);
            }catch (IllegalArgumentException argumentException) {
                return 0;
            }

    }

    public static void main(String[] args) {
        System.out.print(factorial(8888));
    }
}
