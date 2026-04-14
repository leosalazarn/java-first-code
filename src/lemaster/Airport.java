package lemaster;

import java.util.Vector;

public class Airport {

    void main() {
/*        // Instance
        var plane = new Plane("Boeing", "A320", "White with Red", 416, "Avianca");
        var plane1 = new Plane("XLS", "A320", "White with Red", 416, "Avianca");
        Plane plane2 = new Plane("Ferrari", "A320", "White with Red", 416, "Avianca");
        Plane plane3 = new Plane("Boeing", "A320", "White with Red", 416, "Avianca");
        Plane plane4 = new Plane("Boeing", "A500", "Black", 600, "Start Aliance");
        Plane plane5 = new Plane("Boeing", "A740", "White with Red", 416, "Avianca");

        var takingOff = plane.takeOff();
        IO.println("Despegando " + takingOff);
        plane.fly(416);
        plane.land();

        // Encapsulation
        IO.println("Este avión es de color: " + plane.getColor());
        IO.println("Este avión es de marca: " + plane.getBrand());
        IO.println("Este avión es de modelo: " + plane.getModel());
        IO.println("Este avión es de aerolínea: " + plane.getAirline());

        // Create a new instance of my object
        var Car = new Car();

        Car.move();
        Car.road();
        Trailer trailer = new Trailer();
        trailer.move();*/

        // Create an array of vehicles
        Vehicle[] vehicles = {
                new Car(),
                new Moto("Honda", "2021", "White",  2),
                new Trailer(),
        };

        for (Vehicle v : vehicles) {
            v.move();
        }



    }
}
