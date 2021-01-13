package vehicles;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    Engine engine;
    Engine engine2;
    Tyres tyres;
    Tyres tyres2;
    HybridCar hybridCar;


    @Before
    public void setUp(){
        engine = new Engine(1800, "Petrol");
        engine2 = new Engine(1000, "Electric");
        tyres = new Tyres(19, "Pirelli", "Summer");
        tyres2 = new Tyres(21, "Pirelli", "Winter");
        hybridCar = new HybridCar(engine, tyres, 75.00, "Blue", "Vauxhall", "Astra", engine2);
    }

    @Test
    public void canGetColorOfCar(){
        assertEquals("Blue", hybridCar.getColor());
    }

    @Test
    public void canGetPriceOfVehicle(){
        assertEquals(75.00, hybridCar.getPrice(), 0);
    }

    @Test
    public void canGetMakeOfVehicle(){
        assertEquals("Vauxhall", hybridCar.getMake());
    }

    @Test
    public void canGetModelOfVehicle(){
        assertEquals("Astra", hybridCar.getModel());
    }

    @Test
    public void cangetTotalCarPower(){
        assertEquals(2800, hybridCar.totalCarPower());
    }

    @Test
    public void canGetTyreBrand(){
        assertEquals("Pirelli", hybridCar.getTyresBrand());
    }

    @Test

    public void canChangeTyres(){
        assertEquals("Summer", hybridCar.getTyresSeason());
        hybridCar.changeTyres(tyres2);
        assertEquals("Winter", hybridCar.getTyresSeason());
    }
}
