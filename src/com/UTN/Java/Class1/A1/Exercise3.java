package com.UTN.Java.Class1.A1;

public class Exercise3 {

    public static void main(String[] args) {

        int numStart = 5;
        int numEnd = 14;
        boolean value = false;

        while (numStart<=numEnd) {

            if (value == true) {

                if (numStart % 2 == 0) {

                    System.out.print(numStart + "-");

                }

            } else if(numStart %2 != 0){

                    System.out.print(numStart + "-");
            }
            numStart++;
        }

    }

}
