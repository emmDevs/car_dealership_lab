package vehicles;

import components.Engine;
import components.Tyres;

public class ElectricCar extends Car{

    public ElectricCar(Engine engine, Tyres tyres, double price, String color, String make, String model){
        super(engine, tyres, price, color, make, model);
    }
}
