package com.company;

public class ArrayClassification3 {
    public static void main(String[] args) {
//        This is a prectise class
//        This is a prectise class
//        This is a prectise class

        int[] array = {-2, 3, 5, 7, -9, 4, -6};
        int[] pos = new int[array.length];
        int[] neg = new int[array.length];

        int p = 0;
        int n = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                pos[p++] = array[i];
            } else {
                neg[n++] = array[i];
            }
        }

        int[] add1 = pos;
        int[] add2 = neg;

        pos = new int[p];
        neg = new int[n];

        for(int i = 0; i < pos.length; i++) {
            pos[i] = add1[i];
        }

        for(int i = 0; i < neg.length; i++) {
            neg[i] = add2[i];
        }

        for (int i : pos) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : neg) {
            System.out.print(i + " ");
        }
    }
}
