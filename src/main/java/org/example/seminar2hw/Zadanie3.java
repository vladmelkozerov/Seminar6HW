package org.example.seminar2hw;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, -5, 6, 101, 25, 5, 11, -3, 0};
        int sum = 0;
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sum;
                flag = false;
            }
        }
        if (flag) {
            System.out.println("В массиве отсутствуют отрицательные элементы");
        } else {
            System.out.println("Преобразованный массив");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] +" ");
                }

            }
        }
    }