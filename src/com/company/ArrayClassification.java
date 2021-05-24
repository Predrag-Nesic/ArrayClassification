package com.company;

public class ArrayClassification {
    public static void main(String[] args) {
        int[] array = {-2, 3, 5, 7, -9, 4, -6};
        int[] pos = new int[array.length];
        int[] neg = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                pos[i] = array[i];
            } else {
                neg[i] = array[i];
            }
        }

        for(int i : pos) {
            System.out.print(i);
        }

        System.out.println();

        for(int i : neg) {
            System.out.print(i);
        }

//        Up to this point, all the numbers kept their respective positions, if there is no positive number on the current
//        position of the iterrator, the gap is filled in with empty element, or "0". Let's shift their positions to the left.
//        Go to the next class
    }
}
