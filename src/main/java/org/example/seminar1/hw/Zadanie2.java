package org.example.seminar1.hw;
import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность целых + и - чисел, заключительный элемент 0");
        int sum = 0;
        int num1 = scanner.nextInt();
        String str = String.format(String.valueOf(num1))+" ";
        while (num1 != 0){
            int num2 = scanner.nextInt();
            str+=String.format(String.valueOf(num2))+" ";
            if (num1>0 && num2<0){
                sum=sum + num1;
            }
            num1 = num2;
        }
        System.out.println("Введена последовательность: "+str);
        System.out.println("Сумма + элементов, после коих стоит - элемент:");
        System.out.println(sum);

    }

}

