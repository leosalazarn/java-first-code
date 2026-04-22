package lemaster;

import lemaster.dto.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
                new Moto("Honda", "2021", "White", 2),
                new Trailer(),
        };

        for (Vehicle v : vehicles) {
            v.move();
        }


        // Downcasting
        Vehicle v = new Car();
        Car a = (Car) v;
        a.move();

        // Upcasting
        Car miAuto = new Car();
        Vehicle v2 = new Vehicle("Susuki", "Swift", "Red", 4);

        v2.move();    // ✅ OK

        Bus bus = new Bus("W", "2023", "RED", 30);
        Vehicle v3 = bus;

        if (v2 instanceof Trailer) {
            IO.println(" v2 is a Trailer");
        }

        // Java 16+  --> Upcasting & instance validation
        if (v2 instanceof Moto moto) {
            IO.println(" v2 is a Moto");
            moto.move();
        }

        if (v2 instanceof Vehicle) {
            IO.println(" v2 is a Vehicle");
        }
        if (bus instanceof Vehicle) {
            IO.println(" bus is a Car");
        }


        // Arrays & ArrayList
        String[] names = new String[3];
        names[0] = "Leo";
        names[1] = "Tiago";
        names[2] = "Camilo";

        IO.println(Arrays.toString(names));

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(v);
        vehicleList.add(v);
        vehicleList.add(v);
        vehicleList.add(v);
        vehicleList.add(v);
        vehicleList.add(a);
        vehicleList.add(a);
        vehicleList.add(a);
        vehicleList.add(a);
        vehicleList.add(a);
        vehicleList.add(miAuto);
        vehicleList.add(miAuto);
        vehicleList.add(miAuto);
        vehicleList.add(miAuto);
        vehicleList.add(v2);
        vehicleList.add(v2);
        vehicleList.add(v2);
        vehicleList.add(v2);
        vehicleList.add(bus);
        vehicleList.add(bus);
        vehicleList.add(bus);
        vehicleList.add(bus);
        int size = vehicleList.size();
        IO.println(Arrays.toString(vehicleList.toArray()));
        IO.println("size is: " + size);
        // Print the first item/element of the list
        Vehicle firstVehicle = vehicleList.get(0);
        Vehicle secondVehicle = vehicleList.get(1);
        Vehicle thirdVehicle = vehicleList.get(2);
        IO.println("first vehicle is " + firstVehicle.toString());

        Vehicle lastVehicle = vehicleList.get(21);
        IO.println("last vehicle is " + lastVehicle.toString());

        vehicleList.clear();
        IO.println("This list is empty:" + Arrays.toString(vehicleList.toArray()));

        HashMap<String, Vehicle> vehicleMap = new HashMap<>();
        vehicleMap.put("Fix", firstVehicle);
        vehicleMap.put("Fix 2nd", secondVehicle);
        vehicleMap.put("Fix 3rd", thirdVehicle);
        vehicleMap.put("Fix 6546513s5a5das", lastVehicle);
        vehicleMap.put("Fix 1234", lastVehicle);

        boolean CarToBeFixed = vehicleMap.containsKey("Fix");


        //Obtain vehicles to be fixed in the vehicleMap
        vehicleMap.forEach((key, value) -> {
            if (key.contains("Fix")) {
                IO.println("Vehicle to be fixed: " + value.toString());
            }
        });

        IO.println("CarToBeFixed: " + CarToBeFixed);

    }
}
