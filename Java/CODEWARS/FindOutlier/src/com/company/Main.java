package com.company;

public class Main {
    static int find(int[] integers){
        int[] licznik = {0,0};
        int index = 0;
        for(index = 0; index < integers.length; index++){
            if(integers[index]%2==0){
                licznik[0]++;
            }else{
                licznik[1]++;
            }
        }
        index = 0;
        if(licznik[0] > licznik[1]) {
            for (index = 0; index < integers.length; index++)
                if (abs(integers[index]) % 2 != 0) return integers[index];
        }else{
            for (index = 0; index < integers.length; index++)
                if (integers[index] % 2 == 0) return integers[index];
        }
        return 0;
    }
    public static void main(String[] args) {
        find([2, 4, 0, 100, 4, 11, 2602, 36])
    }
}
