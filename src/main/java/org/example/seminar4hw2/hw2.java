package org.example.seminar4hw2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class hw2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String line1 = "{[]()}";
        boolean flag = true;
        String[] line = line1.split("");
        for (int i = 0; i < line.length; i++) {
            list.add(line[i]);
        }
        System.out.println(line1);
        while (!list.isEmpty() && flag) {
             if (list.indexOf("{") < list.indexOf("}")) {
                 list.remove(list.indexOf("{"));
                 list.remove(list.indexOf("}"));

             } else if (list.indexOf("[") < list.indexOf("]")){
                 list.remove(list.indexOf("["));
                 list.remove(list.indexOf("]"));
             }
             else if (list.indexOf("(") < list.indexOf(")")){
                 list.remove(list.indexOf("("));
                 list.remove(list.indexOf(")"));
            }
            else flag = false;
        }
        if (list.isEmpty())  {
            System.out.println("Верное выражение");
        }
        else System.out.println("Неверное выражение");
    }
}