package com.company;

public class ArrayClassification2 {
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

//        NEW
        int[] additional1 = pos;
        pos = new int[p];

        for(int i = 0; i < pos.length; i++) {
            pos[i] = additional1[i];
        }

        for(int i : pos) {
            System.out.print(i);
        }

        System.out.println();

//        NEW
        int[] additional2 = neg;
        neg = new int[n];

        for(int i = 0; i < neg.length; i++) {
            neg[i] = additional2[i];
        }

        for(int i : neg) {
            System.out.print(i);
        }
    }
}
