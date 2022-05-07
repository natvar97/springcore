package com.indialone.lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa [price=" + price + "]";
    }

    public void hey() {
        System.out.println("Method initiated: hey how are you?");
    }

    public void jaymataji() {
        System.out.println("Method is destroyed: jay mataji");
    }

}
