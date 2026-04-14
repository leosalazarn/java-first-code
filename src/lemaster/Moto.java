package lemaster;

public class Moto extends Vehicle {
    public Moto(String brand, String model, String color, int seats) {
        super(brand, model, color, seats);
    }

    public Moto() {
        super("Yamaha", "MT-09", "Black", 2);
    }

    public void wheelie() {
        IO.println("The motorcycle is doing a wheelie! 🏍️");
    }

    @Override
    public void move() {
        IO.println("The motorcycle is speeding through traffic...");
    }

}
