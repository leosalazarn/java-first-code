package lemaster.dto;

public class Bus extends Vehicle {

    public Bus(String brand, String model, String color, int seats) {
        super(brand, model, color, seats);
    }

    public Bus() {
        super("Mercedes-Benz", "Citaro", "Blue", 50);
    }

    @Override
    public void move() {
        IO.println("The bus is cruising down the street...");
    }
}
