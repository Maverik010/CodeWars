package com.company;

import java.util.Arrays;

public class Main {

    public static int[] sortArray(int[] array) {
        int[] oddnumbers;
        int index = 0, rozmiar = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                rozmiar++;
            }
            System.out.print(array[i] + " ");
        }
        oddnumbers = new int[rozmiar];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddnumbers[index++] = array[i];
            }
        }
        Arrays.sort(oddnumbers);
        index = 0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddnumbers[index++];
            }
            System.out.print(array[i] + " ");
        }

        return array;
    }

    public static void main(String[] args) {
        sortArray(new int[]{
                41,	50,	74,	1,	2,
                73,	100,	1,	67,	93,
                15,	22,	77,	21,	71,
                11,	52,	73,	63,	71,
                48,	22,	71,	31,	85,
                23,	32,	59,	12,	71,
                45,	54,	82,	58,	21,
                70,	97,	74,	58,	85,
                94,	58,	87,	36,	33,
                2,	55,	80,	98,	12,
                77,	91,	75,	76,	29
        });
    }
}
