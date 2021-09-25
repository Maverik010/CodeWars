package com.company;

import java.math.BigInteger;
import java.nio.ByteBuffer;


public class Main {


    public static int countBits(int n) {
        int output = 0;
        String wartosc = Integer.toString(n, 2);
        System.out.print(wartosc);
        for(int i = 0 ; i < wartosc.length(); i++){
            if((int)wartosc.charAt(i) == 49)
            output++;
        }
        return output;

    }

    public static void main(String[] args) {
        countBits(2568);
    }
}
