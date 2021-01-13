package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine(1800, "Diesel");
    }

    @Test
    public void engineHasPower(){
        assertEquals(1800, engine.getPower());
    }

    @Test
    public void engineHasFuelType(){
        assertEquals("Diesel", engine.getFuelType());
    }

    @Test
    public void engineCanStart(){
        assertEquals("Vrrrrrmmmm", engine.startEngine());
    }
}
