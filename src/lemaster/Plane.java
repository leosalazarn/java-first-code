package lemaster;

public class Plane {

    //Define attributes
    private String brand;
    private String model;
    private String color;
    private int seats;
    private String airline;

    //Define constructor
    public Plane(String brand, String model, String color, int seats, String airline) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.seats = seats;
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
        if (passengers > this.seats) {
            IO.println("Over capacity! Cannot fly. ⛔⛔⛔⛔");
        } else {
            IO.println("Plane is flying with " + passengers + " passengers. ✅✅✅✅");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public String getAirline() {
        return airline;
    }
}
