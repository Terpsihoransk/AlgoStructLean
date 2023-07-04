package org.example.module1;

import java.util.ArrayList;
import java.util.List;

/**
 * Работа с отсортированным массивом проще.
 */
public class UniqueElementFromSortArray {

    public static void main(String[] args) {
        long[] phoneNumbers = new long[] {
                +79009001011L, +79009001011L,
                +79009001012L,
                +79009001013L, +79009001013L,
                +79009001014L, +79009001014L, +79009001014L, +79009001014L,
                +79009001015L, +79009001015L
        };
        // сравниваем 1 и 2, 2 и 3, 3 и 4. Если равны - пропускаем, если нет - записываем в:

        List<Long> uniqueNumbers = new ArrayList<>();

        long prevNumber = phoneNumbers[0]; // берем самый первый элемент для сравнения

        for (int i=1; i< phoneNumbers.length; i++) {
            if (prevNumber != phoneNumbers[i]) {
                uniqueNumbers.add(prevNumber); // положили первый элемент
                prevNumber = phoneNumbers[i]; // переложили = элемент для сравнения сместился
            }
        }
        uniqueNumbers.add(prevNumber); // последний элемент не с чем сравнить, просто кладем в массив

        System.out.println(uniqueNumbers);
    }
}
