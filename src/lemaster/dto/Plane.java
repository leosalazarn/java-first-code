package lemaster.dto;

import lemaster.util.BookingUtil;

public class Plane extends BookingUtil {

    //Define attributes
    private String airline;

    //Define constructor
    public Plane(String brand, String model, String color, int seats, String airline) {
        this.airline = airline;
    }

    //Define methods
    void land() {
        IO.println("Landing...");
    }

    public String takeOff() {
        return "Taking off...";
    }

    void fly(int passengers) {
        IO.println("Flying... ✈️");
        IO.println("Passengers: 🧑‍💼🧑‍💼🧑‍💼 " + passengers);
        if (passengers > getSeats() ) {
            IO.println("Over capacity! Cannot fly. ⛔⛔⛔⛔");
        } else {
            IO.println("Plane is flying with " + passengers + " passengers. ✅✅✅✅");
        }
    }

    public void validateSeats(int passengers) {
        if (passengers > getSeats()) {
            IO.println("Over capacity! Cannot fly. ⛔⛔⛔⛔");
        } else {
            IO.println("Plane is flying with " + passengers + " passengers. ✅✅✅✅");
        }
    }

    public String getModel() {
        return getModel();
    }

    public String getColor() {
        return getColor();
    }

    public int getSeats() {
        return getSeats();
    }

    public String getAirline() {
        return airline;
    }

    public static String getBrand() {
        return "";
    }
}
