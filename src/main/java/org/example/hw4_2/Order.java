package org.example.hw4_2;

import java.util.ArrayList;
import java.util.Arrays;


public class Order {
    private String order;
    public String[] orderProduct;

    public Order(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }


    public void setOrder(String order) {
        this.order = order;
    }

    public static String[] orderProduct(String getOrder, String getBuyer, String getProduct) {
//        int words4 = getBuyer.length();
//        int words5 = getProduct.length();
//        if (words4 <= 2 || words5 <= 2) {
//            throw new RuntimeException("Неверный формат ввода");
//        }

        String orderProduct[] ={getOrder, getBuyer, getProduct};
        return orderProduct;
    }

    @Override
    public String toString() {
        return "order='" + order + '\'';
    }

}
