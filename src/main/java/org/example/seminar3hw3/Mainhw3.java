package org.example.seminar3hw3;
import org.example.seminar3hw3.model.Books;

import java.util.ArrayList;
import java.util.List;


public class Mainhw3 {
    public static void main(String[] args) {
        Books book= new Books("Ходжа Насретдин", "Л Соловьев",2300.0, 1985, 300);
        Books book1= new Books("Царь Салтан", "АС Пушкин",1300.0, 2010, 307);
        Books book2= new Books("Пуаро", "А Кристи",800.0, 2009, 23);
        Books book3= new Books("На дне", "М Горький",700.0, 2006, 320);
        List<Books> BooksList = new ArrayList<>();
        BooksList.add(book);
        BooksList.add(book1);
        BooksList.add(book2);
        BooksList.add(book3);
        String sym = "А";
        for (Books books : BooksList) {
            if (books.getAuthor().contains(sym)) {
                if (checkNum(books.getPages())&& books.getEditionYear() > 2009) {
                    System.out.println(books.getTitle());
                }
            }
        }




    }
    public static Boolean checkNum(Integer n) {
        Boolean flag = true;
        if (n > 3) {
                Integer j = 2;
                Integer maxDivider = n / j;
                while (flag && j < maxDivider) {
                    if (n % j == 0) {
                        flag = false;
                    }
                    j++;
                }
            }
        return flag;
    }
}
