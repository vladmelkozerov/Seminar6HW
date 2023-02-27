package org.example.seminar4hw1;

import java.util.LinkedList;

public class hw1 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Integer limit = 10;
        for (int i = 0; i < limit; i++) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
