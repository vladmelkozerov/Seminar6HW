package org.example.seminar5hw1;

import org.example.seminar3hw3.model.Books;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Подсчитать количество вхождения каждого слова
 */
public class hw1 {
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
        for (Map.Entry<String, Integer> entry : mapStr.entrySet()) {
            {
                System.out.println("Слово '" + entry.getKey() +" ' встретилось "+ entry.getValue()+" раз(а)" );
            }
        }

    }

}


