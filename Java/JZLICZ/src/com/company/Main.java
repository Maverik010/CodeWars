package com.company;

import java.util.*;

public class Main {
    int[] tablica_male = new int[26]; //97-122
    int[] tablica_duze = new int[26]; //65-90
    Scanner wejscie = new Scanner(System.in);
    String tekst;

    public void wypelnij(){
        tablica_male[0] = 97;
        tablica_duze[0] = 65;

        for (int z = 0; z < tablica_duze.length && z < tablica_male.length; z++){
            this.tablica_male[z] = this.tablica_male[0]+z;
            this.tablica_duze[z] = this.tablica_duze[0]+z;
        }
    }

    public void wypisz(){
        for (int z = 0; z < tablica_duze.length && z < tablica_male.length; z++){
            System.out.print(tablica_male[z]+" ");
            System.out.println(tablica_duze[z]);
        }
    }

    public void wczytaj(){
        String tekst = this.wejscie.nextLine();
    }

    public void czysc(){
        wejscie.close();
        System.gc();
    }

    short zliczanie(){}

    public static void main(String[] args) {
    Main gerara = new Main();
    gerara.wypelnij();
    gerara.wypisz();

    }
}