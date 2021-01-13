package dealership;

import customer.Customer;
import vehicles.Car;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> stock;
    private double till;

    public Dealership(double till){
        this.till = till;
        this.stock = new ArrayList<Car>();
    }


    public ArrayList<Car> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }

    public void buyCarForStock(Car car){
        till -= car.getPrice();
        stock.add(car);
    }

    public void addMoneyToTill(Car car){
        this.till += car.getPrice();
    }

//    public void removeMoneyFromTill(int damage){
//        this.till -= damage;
//    }

    public void removeCarFromStock(Car car){
        this.stock.remove(car);
    }

    public void sellCar(Car car, Customer customer){
        removeCarFromStock(car);
        addMoneyToTill(car);
        customer.buyVehicle(car);
    }
}
