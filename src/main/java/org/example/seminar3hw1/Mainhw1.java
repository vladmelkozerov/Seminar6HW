package org.example.seminar3hw1;
import org.example.seminar3hw1.model.Commodities;

import java.util.ArrayList;
import java.util.List;

public class Mainhw1 {
    public static void main(String[] args) {
        Commodities commodities1 = new Commodities("Кофе высший уровень", 36.2, "1 сорт");
        Commodities commodities2 = new Commodities("Кофе высший уровень", 26.2, "2 сорт");
        Commodities commodities3 = new Commodities("Кофе средний уровень", 16.2, "3 сорт");
        Commodities commodities4 = new Commodities("Чай высший уровень", 42.2, "1 сорт");
        Commodities commodities5 = new Commodities("Чай средний уровень", 2.2, "2 сорт");
        Commodities commodities6 = new Commodities("Чай высший уровень", 1.2, "3 сорт");
        List<Commodities> CommodiitesList = new ArrayList<>();
        CommodiitesList.add(commodities1);
        CommodiitesList.add(commodities2);
        CommodiitesList.add(commodities3);
        CommodiitesList.add(commodities4);
        CommodiitesList.add(commodities5);
        CommodiitesList.add(commodities6);
        Double maxPrice = 0.0;
        for (Commodities com : CommodiitesList) {
            if (com.getName().toLowerCase().contains("высший")
                    && (com.getSort().equals("1 сорт") || com.getSort().equals("2 сорт"))) {
                if (com.getPrice() > maxPrice) {
                    maxPrice = com.getPrice();
                }
            }


        }
        System.out.println("Наибольшая цена  " + maxPrice);
    }
}
