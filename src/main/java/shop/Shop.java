package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock(){
        return this.stock;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public void removeStock(ISell item){
        this.stock.remove(item);
    }

    public int calculateProfit(){
        int total = 0;
        for (ISell item : this.stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}
