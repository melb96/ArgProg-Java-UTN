package com.UTN.Java.Class3.A1;

public class Exercise1 {


    public static int countCharacters(String stringText,char character){

     int position = 0;
     int counter = 0;
     position = stringText.indexOf(character);

     while (position!=-1){

         counter++;
         position=stringText.indexOf(character,position+1);

     }

     return counter;

    }

    public static void main(String[] args) {

    int counter2 = countCharacters("This is a string text",'i');
        System.out.println("The character 'i' repeats "+counter2+" times");
    }

}
