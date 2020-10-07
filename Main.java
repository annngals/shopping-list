package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        /*Большую часть времени потратила на ввод/вывод который плохо работает*/
        /*У меня плохо с программированием*/
        String arr[] = new String[6];
        Scanner sc = new Scanner(new File("list.txt"));
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextLine();
            String[] str = arr[i].split(" ");
            System.out.println(str);
        }

        TreeMap<String, Integer> products = new TreeMap<>();
        // для каждого покупателя - новый объёкт
        products.put("paper", 10);
        if (products.containsKey("paper")) {
            int quantity = products.get("paper");
            quantity += 5;
            products.put("paper", quantity);
        }

        TreeMap<String, TreeMap<String, Integer>> customers = new TreeMap<>();
        customers.put("Petrov", new TreeMap<>());
        TreeMap<String, Integer> petrov_products = customers.get("Petrov"); // получаем ссылку на словарь с покупками Петрова
        System.out.println(petrov_products.size()); // напечатает 0
        // добавляем покупки
        petrov_products.put("apple", 12);
        // Вопрос: нужно ли после изменения состава покупок делать put?
        customers.put("Petrov", petrov_products);
        System.out.println(customers.get("Petrov").size()); // напечатает 1
    }

}
