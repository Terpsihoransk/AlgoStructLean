package org.example.module1;

/**
 * Подход через "динамическое программирование"
 * По сравнению с Arrays.sort быстрее (10 милисекунд против 1 секунды)
 * Зависимость от количества входных данных - линейная
 */
public class ArrayMax {

    public static void main(String[] args) {
        int ageMom = 45;
        int ageDad = 47;
        int maxAge = Math.max(ageDad, ageMom);

        System.out.println(maxAge);

        int[] ages = {10, 6, 15, 93, 42, 7, 32};
        int maxNum = 0;
        for(int i=0; i<ages.length; i++) {
            maxNum = Math.max(maxNum, ages[i]);
        }

        // если нам нужно два максимальных элемента
        int maxNum2 = 0;
        for (int i=0; i<ages.length; i++) {
            if (ages[i] < maxNum) {
                maxNum2 = Math.max(maxNum2, ages[i]);
            }
        }

        System.out.println("Максимумы из цикла: " + maxNum + ", " + maxNum2);

        // or
        int numOne = 0;
        int numTwo = 0;
        for(int i=0; i<ages.length; i++) {
            numOne = Math.max(numOne, ages[i]);
            if (ages[i] < maxNum) {
                numTwo = Math.max(numTwo, ages[i]);
            }
        }

        System.out.println(numOne + ", " + numTwo);
        System.out.println(Math.random());

        int[] values = {-10, 6, -15, -93, -42, 7, -32};

        for (int value : values) {
            if (value > 0) {
                System.out.println("Положительное целое число из массива: " + value);
            }
        }

    }
}
