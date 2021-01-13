package vehicles;

import components.Tyres;
import components.Engine;

public abstract class Car{

    private Engine engine;
    private Tyres tyres;
    private double price;
    private String color;
    private String make;
    private String model;

    public Car(Engine engine, Tyres tyres, double price, String color, String make, String model){
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

//    public void changeColor(String color){
//        this.color = color;
//    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getEnginePower() {
        return engine.getPower();
    }

    public String getFuelType() {
        return engine.getFuelType();
    }

    public int getTyresSize() {
        return tyres.getSize();
    }

    public String getTyresBrand() {
        return tyres.getBrand();
    }

    public String getTyresSeason() {
        return tyres.getSeason();
    }

    public void changeTyres(Tyres tyres){
        this.tyres = tyres;
    }
}
