package org.example.hw4_2;

public class Buyer {
   private String buyer;

    public Buyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "buyer='" + buyer + '\'';
    }

    public String[] split(String s) {
        return new String[0];
    }
}
