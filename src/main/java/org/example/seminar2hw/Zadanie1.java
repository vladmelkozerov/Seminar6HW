package org.example.seminar2hw;
/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности");
        int n = scanner.nextInt();
        System.out.println("Введите числа последовательности");
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            int num = scanner.nextInt();
            if (num > 1) {
                if (num == 2 | num == 3) {
                    sum += num;
                    }
                else {
                    int j = 2;
                    int maxDivider = num / j;
                    while (flag && j < maxDivider) {
                        if (num % j == 0) {
                            flag = false;
                        }
                        j++;
                    }
                    if (flag) {
                        sum += num;
                    }
                }
            }
        }
        scanner.close();
        System.out.println("Сумма простых чисел, входящих в последовательность= " + sum);
    }
}
