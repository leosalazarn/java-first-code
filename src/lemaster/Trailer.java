package lemaster;

public class Trailer extends Vehicle {

    public Trailer(String brand, String model, String color, int seats) {
        super(brand, model, color, seats);
    }

    public Trailer() {
        super("Generic", "Trailer", "White", 0);
    }

    @Override
    public void move() {
        IO.println("The trailer is being towed...");
    }
}
