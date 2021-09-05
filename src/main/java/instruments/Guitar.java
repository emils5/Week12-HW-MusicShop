package instruments;

public class Guitar extends Instrument{
    private int numberOfStrings;
    private GuitarType type;

    public Guitar(String material, String colour, int buyPrice, int sellPrice, int numberOfStrings, GuitarType type) {
        super(material, colour, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public GuitarType getType() {
        return type;
    }

    @Override
    public String play() {
        return "Gently weeps";
    }

}
