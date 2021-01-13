package vehicles;

import components.Engine;
import components.Tyres;

public class PetrolCar extends Car{

    public PetrolCar(Engine engine, Tyres tyres, double price, String color, String make, String model){
        super(engine, tyres, price, color, make, model);
    }
}
