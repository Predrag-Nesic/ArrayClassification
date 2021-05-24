package com.company;

public class ArrayClassification1 {
    public static void main(String[] args) {
        int[] array = {-2, 3, 5, 7, -9, 4, -6};
        int[] pos = new int[array.length];
        int[] neg = new int[array.length];

        int p = 0;
        int n = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                pos[p++] = array[i];
            } else {
                neg[n++] = array[i];
            }
        }

        for(int i : pos) {
            System.out.print(i);
        }

        System.out.println();

        for(int i : neg) {
            System.out.print(i);
        }

//        In this case, we successfuly aligned them to the left, starting with the first position, and so on. Now we need to erase the unnecessary zeroes
    }
}
