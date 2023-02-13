package org.example.seminar1.hw;

public class Zadanie1 {
    public static void main(String[] args) {
        String str = "Yesterday all my troubles seemed so far away";
        String[] newStr = str.split(" ");
        System.out.println("Исходная строка, с конца к началу:");
        for (int i = newStr.length - 1; i >= 0; i--) {
            System.out.print(newStr[i] + " ");

        }
    }
}
