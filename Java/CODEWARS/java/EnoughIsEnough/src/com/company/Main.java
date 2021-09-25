package com.company;

import java.util.*;

public class Main {

    public static int[] deleteNth(int[] elements, int maxOccurrences){
        Map map = new HashMap();
        for(int i = 0 ; i < elements.length; i++){
            map.put(i,elements[i]);
        }
        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.print("Klucz: "+entry.getKey()+" "+"Wartosc: "+entry.getValue()+"\n");
        }
        System.out.println();
        
    return null;
    }

    public static void main(String[] args) {
        deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1, 3, 4, 5, 6, 7, 8, 2, 1, 3, 4, 5, 6}, 3);
        deleteNth(new int[]{3,3,4}, 5);
    }
}
