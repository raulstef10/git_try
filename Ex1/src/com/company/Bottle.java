package com.company;

public class Bottle {
    private String brand;
    private float price;
    private int volume;

    public Bottle() {
        this.brand = brand;
        this.price = price;
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public Object setBrand(String brand) {
        this.brand = brand;
        return null;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "Brand= " + brand + '\n' +
                        "   Pret= " + price + '\n' +
                        "   Volum= " + volume + '\n'
                ;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

