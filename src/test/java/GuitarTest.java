import instruments.Guitar;
import instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood", "Red", 400, 500, 6, GuitarType.ELECTRIC);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(400, guitar.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(500, guitar.getSellPrice());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasType(){
        assertEquals(GuitarType.ELECTRIC, guitar.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("Gently weeps", guitar.play());
    }

}
