package com.geekbrains.spring.context.app;
/*
 * Продукт
 *
 * @author Aleksei Pronichev
 * 17.09.2020
 */

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
