package org.example.module1;

import java.util.Arrays;

public class Introduction {

    public static void main(String[] args) {
        int[] ages ={10, 6, 15, 93, 42, 7, 32};
        Arrays.sort(ages);
        int maxAge = ages[ages.length - 1];

        System.out.print(maxAge);

    }
}
