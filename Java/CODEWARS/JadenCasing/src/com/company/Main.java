package com.company;

public class Main {
    public static String toJadenCase(String phrase) {
        try {
            boolean spacja = false, znak = false;
            if (phrase.isEmpty()) return null;
            StringBuilder output = new StringBuilder();
            output.append(Character.toUpperCase(phrase.charAt(0)));
            for (int i = 0; i < phrase.length(); i++) {
                if(i==0) continue;
                if (spacja) {
                    output.append(Character.toUpperCase(phrase.charAt(i)));
                    spacja = false;
                    znak = true;
                }

                if (phrase.charAt(i) == (char) 32) {
                    output.append((char)32);
                    spacja = true;
                    continue;
                }
                if(!znak) {
                    output.append(phrase.charAt(i));
                }
                znak = false;
            }
            return output.toString();
        } catch (NullPointerException e) {
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.print(toJadenCase("czm ass s eree Erwar"));
    }
}
