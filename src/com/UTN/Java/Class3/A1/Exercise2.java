package com.UTN.Java.Class3.A1;

public class Exercise2 {

    public static void main(String[] args) {

        int[] array = {3, 1, 2};
        int[] result = sortAscending(array);
        System.out.println("Ascending order");
        for (int item : result) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Descending order");
        int[] result2 = sortDescending(array);
        for(int item2 : result2){
            System.out.print(item2 + " ");
        }

    }

    public static int[] sortAscending(int[] start) {

        for (int i = 0; i < start.length; i++) {

            for (int j = i + 1; j < start.length; j++) {

                if (start[j] < start[i]) {
                    int before = start[i];
                    int newMinor = start[j];
                    start[i] = newMinor;
                    start[j] = before;
                }

            }

        }

        return start;

    }

    public static int[] sortDescending(int[] start2) {

        for (int i = 0; i < start2.length; i++) {

            for (int j = i + 1; j < start2.length; j++) {

                if (start2[j] > start2[i]) {
                    int before = start2[j];
                    int newMinor = start2[i];
                    start2[j] = newMinor;
                    start2[i] = before;
                }

            }

        }

        return start2;

    }


}