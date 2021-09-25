package com.company;



public class Main {
    public static int suma(int a){
        if ( a > 0 ){
            return a + suma(a-1);
        } else {
            return 0;
        }
    }
    public static int[] sumOfN(int n) {
        int[] output = new int[Math.abs(n)+1];

        if(n < 0) {
            for(int i = 0; i < output.length; i++){
                output[i]= (-(suma(i)));
            }
        }else{
            for(int i = 0; i < output.length; i++){
                output[i]=suma(i);
            }
        }


        for(int i = 0; i < output.length; i++) {
            System.out.print("Element nr "+i+" "+output[i]+"\n");
        }


        return output;
    }

    public static void main(String[] args) {
	sumOfN(-4);
    }
}
