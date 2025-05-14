package org.steven.patrones.observer;

public class Corpotation extends Observable {
    private String corpName;
    private int price;

    public Corpotation(String corpName, int price) {
        this.corpName = corpName;
        this.price = price;
    }

    public String getCorpName() {
        return corpName;
    }

    public int getPrice() {
        return price;
    }

    public void modifyPrice(int price) {
        this.price = price;
        notifyObservers();
    }
}
