package org.example.module2_binarySearch;

/**
 * операнды: отсортированный массив, переменная с искомым числом,
 * левая индекс начала рассматриваемой части - подмассива,
 * правая индекс конца рассматриваемой части - подмассива,
 * центральный элемент подмассива
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 5, 10, 80, 94, 125, 174, 223, 357, 528};
        int search = 125;
        binarySearch(array, search);
    }

    public static int binarySearch (int[] array, int search) {
        int left = 0;
        int right = array.length - 1;
        int middle = (left + right) / 2;
        // [0,1,2,3], left = 0, right = 3, middle = (3+0)/2 = 1 (если чётное кол-во, берём левый элемент)

        while (left <= right) { // условия выхода - пока индексы не встретятся
            if (array[middle] < search) {
                left = middle + 1; // чтобы сместить индекс начала подмассива, обросив все левые элементы
            } else if (array[middle] > search) {
                right = middle - 1; // смещаем, переставив правую границу
            } else {
                return middle;
            }
        }
        return -1; // если искомый элемент не найден
    }
}

/**
 * Количество итераций N = 2 ^ x = O(log n) - логарифмическое
 */
