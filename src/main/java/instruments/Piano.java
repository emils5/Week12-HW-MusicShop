package instruments;

public class Piano extends Instrument{
    private PianoType type;

    public Piano(String material, String colour, int buyPrice, int sellPrice, PianoType type) {
        super(material, colour, buyPrice, sellPrice);
        this.type = type;
    }

    public PianoType getType() {
        return type;
    }

    @Override
    public String play() {
        return "Mozart";
    }
}
