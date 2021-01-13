package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void setUp(){
        tyres = new Tyres(19, "Pirelli", "Summer");
    }

    @Test
    public void canGetSizeOfTyres(){
        assertEquals(19, tyres.getSize());
    }

    @Test
    public void canChangeSizeOfTyres(){
        tyres.changeSize(16);
        assertEquals(16, tyres.getSize());
    }

    @Test
    public void canGetBrandOfTyres(){
        assertEquals("Pirelli", tyres.getBrand());
    }

    @Test
    public void canChangeBrandOfTyres(){
        tyres.changeBrand("Michellin");
        assertEquals("Michellin", tyres.getBrand());
    }

    @Test
    public void canGetSeasonOfTyres(){
        assertEquals("Summer", tyres.getSeason());
    }

    @Test
    public void canChangeSeasonOfTyres(){
        tyres.changeSeason("Winter");
        assertEquals("Winter", tyres.getSeason());
    }
}
