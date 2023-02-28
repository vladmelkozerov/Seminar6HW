package org.example.seminar5hw2;

import org.example.seminar3hw3.model.Books;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Подсчитать количество вхождения каждого слова
 */
public class hw2 {
    public static void main(String[] args) {
        String line = "Россия идет вперед всей планеты. Планета — это не Россия.";
        line = line.replace(".", " ").replace(",", " ").replace("!", " ").
                replace("?", " ").replace("—", " ").replaceAll("\\s+", " ").toLowerCase();
        String[] arrLine = line.split(" ");
        Map<String, Integer> mapStr = new HashMap<>();
        for (int i = 0; i < arrLine.length; i++) {
            mapStr.putIfAbsent(arrLine[i], 0);
            mapStr.put(arrLine[i], mapStr.get(arrLine[i]) + 1);
        }
        Scanner scanner = new Scanner(System.in);
        String search = "";
        System.out.println("Для поиска слова в строке введите его");
        search = scanner.nextLine();
        search = search.toLowerCase().strip();
        if (mapStr.containsKey(search)) {
                System.out.println("Искомое слово встречается "+ mapStr.get(search)+" раз(а)");}
        else {System.out.println("Введенное слово не обнаружено");}
        }



        }


