package vehicles;

import components.Engine;
import components.Tyres;

public class DieselCar extends Car{

    public DieselCar(Engine engine, Tyres tyres, double price, String color, String make, String model){
        super(engine, tyres, price, color, make, model);
    }
}
