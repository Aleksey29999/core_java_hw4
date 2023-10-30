package org.example.hw4_2;
import java.util.List;
public class Product {
    private String product;

    public Product(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "product='" + product + '\'';
    }

    public String[] split(String s) {
        return new String[0];
    }
}
