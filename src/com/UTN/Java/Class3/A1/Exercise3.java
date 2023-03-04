package com.UTN.Java.Class3.A1;

public class Exercise3 {

    public static void main(String[] args) {

        int [] array = {5,8,9,4,6,11};
        int x = 7;
        int result = 0;

        for(int counter = 0;counter<array.length;counter++){

            if(array[counter]>x){
                result+=array[counter];
                System.out.println(result);
            }
        }

    }

}
