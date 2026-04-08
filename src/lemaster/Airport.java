package lemaster;

public class Airport {

    void main() {
        // crear 6 instancias del avión
        Plane plane = new Plane("Boeing", "A320", "White with Red", 416, "Avianca");
        Plane plane1 = new Plane("XLS", "A320", "White with Red", 416, "Avianca");
        Plane plane2 = new Plane("Ferrari", "A320", "White with Red", 416, "Avianca");
        Plane plane3 = new Plane("Boeing", "A320", "White with Red", 416, "Avianca");
        Plane plane4 = new Plane("Boeing", "A500", "Black", 600, "Start Aliance");
        Plane plane5 = new Plane("Boeing", "A740", "White with Red", 416, "Avianca");

        var takingOff = plane.takeOff();
        IO.println("Despegando " + takingOff);
        plane.fly(416);
        plane.land();

        // Esto es una mala practica
  /*      IO.println("Este avión es de color: " + plane.color);
        IO.println("Este avión es de marca: " + plane.brand);
        IO.println("Este avión es de modelo: " + plane.model);
        IO.println("Este avión es de aerolínea: " + plane.airline);*/

        // Esto es una buena practica (encapsulamiento)
        IO.println("Este avión es de color: " + plane.getColor());
        IO.println("Este avión es de marca: " + plane.getBrand());
        IO.println("Este avión es de modelo: " + plane.getModel());
        IO.println("Este avión es de aerolínea: " + plane.getAirline());

    }
}
