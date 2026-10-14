package lemaster.dto;

public class Car extends Vehicle {


    public Car(){
        super("Toyota", "Corolla", "Red", 5);
    }

    void road(){
        IO.println("This car is roading... ");
    }

    @Override
    public void move() {
        IO.println("The car is moving...");
    }
}
