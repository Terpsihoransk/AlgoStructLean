package org.example.module1;

import java.util.ArrayList;
import java.util.List;

/**
Метод грубой силы - подход "в лоб"
 */

public class UniqueElement {
    public static void main(String[] args) {
        long[] phoneNumbers = new long[] {+79161002030L, +79255588777L, +79161002030L, +79219990000L};

        List<Long> uniqueNumbers = new ArrayList<>(); // создаем "блокнотик", в который запишем уникальные номера

        for(long currentNumber : phoneNumbers) { // кол-во проходов = кол-ву элементов в массиве
            boolean alreadyExists = false; // флаг наличия номера в блокноте
            for(Long existingNumber : uniqueNumbers) { // кол-во проходов зависит от природы данных, не очевидно
                if (existingNumber == currentNumber) { // если в блокноте уже есть номер, пропускаем
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                uniqueNumbers.add(currentNumber); // если в блокноте нет номера, добавляем
            }
        }
        System.out.println(uniqueNumbers);
    }
}

/**
 * Допустим, массив состоит полностью из уникальных элементов, считаем кол-во операций для алгоритма:
 * внутренний цикл: 1 раз + 2 раза + 3 раза + ... + N
 * внешний цикл: N раз -> (1+2+3+4+...+N) * N
 * формула "Сумма математической последовательности":
 * если последовательность выглядит как 1 + 2 + 3 + ... + N, то такая последовательность == N/2
 * значит весь алгоритм выполнится за N * N/2 == N ^ 2 / 2 операций - Квадратичная зависимость
 */
