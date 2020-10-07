package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        String name = "";
        String product = "";
        int quantity = 0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] arrOfStr = str.split(" ");
            name = arrOfStr[0];
            product = arrOfStr[1];
            quantity = Integer.parseInt(arrOfStr[2]);
            System.out.println(name);
            System.out.println(product);
            System.out.println(quantity);
        }

        TreeMap<String, Integer> products = new TreeMap<>();
        // для каждого покупателя - новый объёкт
        products.put(product, quantity);
        if (products.containsKey(product)) {
            int p_quantity = products.get(product);
            p_quantity += quantity;
            products.put(product, p_quantity);
        }

        TreeMap<String, TreeMap<String, Integer>> customers = new TreeMap<>();
        customers.put(name, new TreeMap<>());
        TreeMap<String, Integer> petrov_products = customers.get(name); // получаем ссылку на словарь с покупками Петрова
        System.out.println(petrov_products.size()); // напечатает 0
        // добавляем покупки
        petrov_products.put(product, quantity);
        System.out.println(customers.get(name)); // напечатает 1
        System.out.println(customers); // напечатает 1
    }

}
