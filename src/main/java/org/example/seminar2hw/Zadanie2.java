package org.example.seminar2hw;
import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности ");
        int n = scanner.nextInt();
        System.out.println("Введите числа последовательности ");
        int num1 = scanner.nextInt();
        boolean flag = true;
        int i = 1;
        while (flag && i<n) {
            int num2 = scanner.nextInt();
            if (num2 < num1) {
                flag = false;
            }
            i++;
        }
        scanner.close();
        if (flag){
            System.out.println("Утверждение о возрастающей последовательности верно");
        }
        else{
            System.out.println("Утверждение о возрастающей последовательности неверно");
        }
    }
}
