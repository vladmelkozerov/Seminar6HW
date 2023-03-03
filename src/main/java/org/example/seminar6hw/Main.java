package org.example.seminar6hw;
import java.util.Scanner;
import org.example.seminar6hw.model.Laptops;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptops laptop = new Laptops("ASUS", "N56D", 15.6, 6.00, 40000.00);
        Laptops laptop1 = new Laptops("ASUS", "N80J", 15.6, 10.00, 60000.00);
        Laptops laptop2 = new Laptops("Lenovo", "A3", 15.6, 3.00, 30000.00);
        Laptops laptop3 = new Laptops("HP", "2000", 15.6, 2.00, 12000.00);
        Laptops laptop4 = new Laptops("Sony", "27HL", 8.2, 1.00, 10000.00);
        Laptops laptop5 = new Laptops("Toshiba", "R56", 14.1, 2.00, 16000.00);

        ArrayList<Laptops> arrLT = new ArrayList<>(Arrays.asList(laptop, laptop1, laptop2, laptop3, laptop4, laptop5));
        Set<Laptops> setLT = new HashSet<>(arrLT);
        Map<Integer,String> filterMap = new HashMap<>();
        filterMap.put(1,"Марка");
        filterMap.put(2,"Модель");
        filterMap.put(3,"Размер экрана");
        filterMap.put(4,"ПЗУ");
        filterMap.put(5,"Стоимость");
        for (Map.Entry<Integer,String> entry : filterMap.entrySet()) {
            System.out.println("Для поиска по параметру " + entry.getValue()+" введите цифру "+ entry.getKey());
            }
    Integer parameter = scanner.nextInt();
    filterLT(setLT,parameter);
    }

    public static void filterLT(Set<Laptops> setLT1, int parameter1) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Laptops> result = new HashMap<>();
        Integer ID = 0;
        switch (parameter1) {
            case (1):
                System.out.println("Введите марку ноутбука");
                String brand = scanner.nextLine();
                for (Laptops item : setLT1) {
                    if (item.getBrand().equals(brand)) {
                        result.put(ID, item);
                        ID++;
                    }
                 }
                break;
            case (2):
                System.out.println("Введите модель ноутбука");
                String model = scanner.nextLine();
                for (Laptops item : setLT1) {
                    if (item.getModel().equals(model)) {
                        result.put(ID, item);

                        ID++;
                    }

                }
                break;
            case (3):
                System.out.println("Введите минимальный размер экрана");
                Double minScreenSize = scanner.nextDouble();
                System.out.println("Введите максимальный размер экрана");
                Double maxScreenSize = scanner.nextDouble();
                for (Laptops item : setLT1) {
                    if (item.getScreenSize() >= minScreenSize && item.getScreenSize() <= maxScreenSize) {
                        result.put(ID, item);
                        ID++;
                    }
                }
                break;
            case (4):
                System.out.println("Введите минимальный размер ПЗУ");
                Double minROM = scanner.nextDouble();
                System.out.println("Введите максимальный размер ПЗУ");
                Double maxROM = scanner.nextDouble();
                        for (Laptops item : setLT1) {
                            if (item.getROM() >= minROM && item.getROM() <= maxROM) {
                               result.put(ID, item);
                               ID++;
                            }
                        }
                break;
            case (5):
                System.out.println("Введите минимальную стоимость");
                Double minPrice = scanner.nextDouble();
                System.out.println("Введите максимальную стоимость");
                Double maxPrice = scanner.nextDouble();
                for (Laptops item : setLT1) {
                    if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                        result.put(ID, item);
                        ID++;
                    }
                }
                break;
            default:
                System.out.println("Некорректная команда");
                break;
            }
            if (!result.isEmpty()) {
                System.out.println("Ноутбуки, соответствующие условиям отбора:" );
                for (Map.Entry<Integer, Laptops> entry : result.entrySet()) {
                    {
                        System.out.println("Марка: "+entry.getValue().getBrand()+" Модель: "+entry.getValue().getModel()
                        +" Размер экрана: "+entry.getValue().getScreenSize()+" ПЗУ:"+entry.getValue().getROM()+
                        " Стоимость "+ entry.getValue().getPrice());
                     }
                }
            }
            else System.out.println("Ноутбуки, соответствующие заданным критериям, не обнаружены. Измените параметры поиска");
            }
    }


