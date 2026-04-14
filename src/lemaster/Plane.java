package lemaster;

public class Plane extends Vehicle {

    //Define attributes
    private String airline;

    //Define constructor
    public Plane(String brand, String model, String color, int seats, String airline) {
        super(brand, model, color, seats);
        this.airline = airline;
    }

    //Define methods
    void land() {
        IO.println("Landing...");
    }

    String takeOff() {
        return "Taking off...";
    }

    void fly(int passengers) {
        IO.println("Flying... ✈️");
        IO.println("Passengers: 🧑‍💼🧑‍💼🧑‍💼 " + passengers);
        if (passengers > super.getSeats()) {
            IO.println("Over capacity! Cannot fly. ⛔⛔⛔⛔");
        } else {
            IO.println("Plane is flying with " + passengers + " passengers. ✅✅✅✅");
        }
    }

    public String getBrand() {
        return super.getBrand();
    }

    public String getModel() {
        return super.getModel();
    }

    public String getColor() {
        return super.getColor();
    }

    public int getSeats() {
        return super.getSeats();
    }

    public String getAirline() {
        return airline;
    }
}
