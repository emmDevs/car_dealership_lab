package customer;

import vehicles.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Car> ownedVehicles;
    private double money;

    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<Car>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Car> getOwnedVehicles() {
        return ownedVehicles;
    }

//    public void addCarToOwnedVehicles(Car car){
//        this.ownedVehicles.add(car);
//    }

    public double getMoney() {
        return money;
    }

//    public void removeMoneyFromWallet(Car car){
//        this.money -= car.getPrice();
//    }

//    public String buyVehicle(Car car){
//        addCarToOwnedVehicles(car);
//        removeMoneyFromWallet(car);
//        return "Congrats " + this.name + " on your new purchase!";
//    }
}
