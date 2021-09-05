import instruments.Guitar;
import instruments.GuitarType;
import instruments.Piano;
import instruments.PianoType;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    public Shop shop;
    public Guitar guitar;
    public Piano piano;

    @Before
    public void before(){
        shop = new Shop("King Tuts");
        guitar = new Guitar("wood", "Red", 400, 500, 6, GuitarType.ELECTRIC);
        piano = new Piano("steel", "Black", 1000, 1200, PianoType.CLASSIC);
    }

    @Test
    public void shopHasName(){
        assertEquals("King Tuts", shop.getName());
    }

    @Test
    public void shopCanAddStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void shopCanRemoveStock(){
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.removeStock(guitar);
        assertEquals(1,shop.stockCount());
    }

    @Test
    public void canCalculateProfit(){
        shop.addStock(guitar);
        shop.addStock(piano);
        assertEquals(300, shop.calculateProfit());
    }

}
