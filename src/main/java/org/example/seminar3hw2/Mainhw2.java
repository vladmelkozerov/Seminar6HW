package org.example.seminar3hw2;
import org.example.seminar3hw2.model.Commodities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainhw2 {
    public static void main(String[] args) {
        Commodities commodities1 = new Commodities("Поташ", "Россия", 10.6, 45.6, "1 сорт");
        Commodities commodities2 = new Commodities("Пенька", "Россия", 26.2, 13.7, "2 сорт");
        Commodities commodities3 = new Commodities("Кофий", "Бразилия", 36.2, 152.0, "3 сорт");
        Commodities commodities4 = new Commodities("Китовый ус", "Норвегия", 17.8, 12.5, "1 сорт");
        Commodities commodities5 = new Commodities("Ворвань", "Швеция", 2.2, 5.4, "2 сорт");
        Commodities commodities6 = new Commodities("Деготь", "Финляндия", 1.2, 3.1, "3 сорт");
        List<Commodities> CommoditiesList = new ArrayList<>();
        CommoditiesList.add(commodities1);
        CommoditiesList.add(commodities2);
        CommoditiesList.add(commodities3);
        CommoditiesList.add(commodities4);
        CommoditiesList.add(commodities5);
        CommoditiesList.add(commodities6);
        System.out.println("Введите требуемый сорт: 1/2/3 сорт");
        Scanner scanner = new Scanner(System.in);
        String sort_no = scanner.nextLine();
        String minPriceCommodity = "";
        Double minPrice = CommoditiesList.get(0).getPrice();
        for (Commodities com : CommoditiesList) {
            if (com.getSort().toLowerCase().contains(sort_no)) {
                if (com.getPrice() < minPrice) {
                    minPrice = com.getPrice();
                    minPriceCommodity = com.getName();
                }
            }

        }
        System.out.printf("Наименование товара категории " + sort_no + " c минимальной ценой, равной " + minPrice + ": " + minPriceCommodity);

    }



}