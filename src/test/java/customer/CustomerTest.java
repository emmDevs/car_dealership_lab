package customer;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Engine engine;
    PetrolCar petrolCar;
    Tyres tyres;


    @Before
    public void setUp(){
        customer = new Customer("Joe Bloggs", 100.00);
        engine = new Engine(1800, "Diesel");
        tyres = new Tyres(19, "Pirelli", "Summer");
        petrolCar = new PetrolCar(engine, tyres, 75.00, "Red", "Ferrari", "Portofino");
    }

    @Test
    public void checkCustomerName(){
        assertEquals("Joe Bloggs", customer.getName());
    }

    @Test
    public void ownedCarsStartsAt0(){
        assertEquals(0, customer.getOwnedVehicles().size());
    }

    @Test
    public void canBuyVehicles(){
        customer.buyVehicle(petrolCar);
        assertEquals(1, customer.getOwnedVehicles().size());
        assertEquals(25.00, customer.getMoney(),0);
        assertEquals("Congrats Joe Bloggs on your new purchase!", customer.buyVehicle(petrolCar));

    }

}



