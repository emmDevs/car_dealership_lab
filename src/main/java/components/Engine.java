package components;

import vehicles.Car;

public class Engine {

    private int power;
    private String fuelType;

    public Engine(int power, String fuelType){
        this.power = power;
        this.fuelType = fuelType;
    }

    public int getPower() {
        return power;
    }

//    public void setPower(int power) {
//        this.power = power;
//    }

    public String getFuelType() {
        return fuelType;
    }

//    public void setFuelType(String fuelType) {
//        this.fuelType = fuelType;
//    }

    public String startEngine(){
        return "Vrrrrrmmmm";
    }
}
