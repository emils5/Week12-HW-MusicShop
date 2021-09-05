package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String material;
    private String colour;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String material, String colour, int buyPrice, int sellPrice) {
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public int calculateMarkup() {
        return getSellPrice()-getBuyPrice();
    }
}
