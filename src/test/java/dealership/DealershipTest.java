package dealership;

import components.Engine;
import components.Tyres;
import customer.Customer;
import org.junit.Before;
import vehicles.HybridCar;

public class DealershipTest {

    Engine engine;
    Engine engine2;
    Tyres tyres;
    Customer customer;
    HybridCar hybridCar;
    Dealership dealership;


    @Before
    public void setUp(){
        engine = new Engine(1800, "Petrol");
        engine2 = new Engine(1000, "Electric");
        tyres = new Tyres(19, "Pirelli", "Summer");
        customer = new Customer("Joe Bloggs", 100.00);
        hybridCar = new HybridCar(engine, tyres, 75.00, "Blue", "Vauxhall", "Astra", engine2);
        dealership = new Dealership(1000.00);
    }

}
