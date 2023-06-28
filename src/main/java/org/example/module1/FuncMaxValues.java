package org.example.module1;

import java.util.Arrays;

/**
 * Находим несколько наибольших из массива
 * 1 максимум в [] из 100 элементов = 100 операций (сравнение, умножение, вызов функций)
 * 5 максимумов в [] из 100 элементов = 500 операций
 * 100 максимумов в [] из 1000 элементов = 100 000 операций
 * время пропорционально размеру массива и количеству максимумов
 */
public class FuncMaxValues {

    public static void main(String[] args) {
        int[] ages = {34, 94, 33, 55, 20, 10, 6, 87};
        int[] top3ages = findTopElements(ages, 3);
        System.out.println(Arrays.toString(top3ages));
        int[] top8sort = findTopElements(ages, 8); // 8 максимумов из [] в 8 элементов
        System.out.println(Arrays.toString(top8sort)); // получили отсортированный по убыванию массив = сортировка выбором
    }

    public static int findMaxUnderBoundary(int[] inputArray, int topBoundary) {
        int currentMax = Integer.MIN_VALUE;
        for(int i=0; i<inputArray.length; i++) {
            if(inputArray[i] < topBoundary) {
                currentMax = Math.max(currentMax, inputArray[i]); // кладем либо текущий больший, либо максимальный из массива
            }
        }
        return currentMax;
    }

    public static int[] findTopElements(int[] inputArray, int numberOfElement) {
        int[] topElements = new int[numberOfElement];

        int previousMax = Integer.MAX_VALUE; // храним предыдущее значение максимума

        for(int i=0; i<numberOfElement; i++) {
            int currentMax = findMaxUnderBoundary(inputArray, previousMax); // находим самый первый максимум
            previousMax = currentMax;
            topElements[i] = currentMax;
        }
        return topElements;
    }
}
