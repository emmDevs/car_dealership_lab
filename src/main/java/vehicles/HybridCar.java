package vehicles;

import components.Engine;
import components.Tyres;

import java.util.ArrayList;

public class HybridCar extends Car {

    private Engine engine2;
    private ArrayList<Engine> carEngines;

    public HybridCar(Engine engine, Tyres tyres, double price, String color,
                     String make, String model, Engine engine2){
        super(engine, tyres, price, color, make, model);
        this.engine2 = engine2;
        this.carEngines = new ArrayList<Engine>();
    }

    public int totalCarPower(){
        return this.getEnginePower() + engine2.getPower();
    }
}
