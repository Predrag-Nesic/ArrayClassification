package com.company;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        int[] array = {-2, 3, 5, 7, -9, 4, -6};
        ArrayList<Integer> poz = new ArrayList();
        ArrayList neg = new ArrayList();

        for(int a : array) {
            if(a > 0) {
                poz.add(a);
            } else if(a < 0) {
                neg.add(a);
            }
        }

        String j = "Some string";
//        poz.add(j);  Strings can also be in an ArrayList if the ArrayList is not reserved for Integer class in the "<>" tags
        neg.add(j);
        for(Object p : poz) {
            System.out.print(p + " ");
        }
        System.out.println("Size: " + poz.size());

        for(Object n : neg) {
            System.out.print(n + " ");
        }
        System.out.println("Size: " + neg.size());


//        In order to simplify this code, I did it also by using ArrayList class


        ArrayList<Beginner> beginners = new ArrayList<>();
        beginners.add(new PHPBeginner());
        beginners.add(new JavaBeginner());
        beginners.add(new JavaBeginner());
        beginners.add(new PHPBeginner());
        beginners.add(new PHPBeginner());
        beginners.add(new JavaBeginner());

//        By default I added objects without references, no matter, you get the point

        System.out.println("Beginners size is: " + beginners.size());

        for(Beginner b : beginners) {
            b.learns();
        }
    }
}
