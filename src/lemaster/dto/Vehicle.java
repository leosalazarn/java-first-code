package lemaster.dto;

public class Vehicle {

    private String brand;
    private String model;
    private String color;
    private int seats;


    public Vehicle(String brand, String model, String color, int seats) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }


    public void move() {
        IO.println("The vehicle is moving...");
    }

}
