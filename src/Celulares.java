public class Celulares {

    // 1. Atributos
    String brand;
    String model;
    String color;
    int storageCapacity;
    double price;
    boolean is5G;

    // 2. Constructor
    public Celulares(String brand, String model, String color, int storageCapacity, double price, boolean is5G) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.storageCapacity = storageCapacity;
        this.price = price;
        this.is5G = is5G;
    }

    // 3. Metodo de retorno
    public String getDetails() {
        return brand + " " + model + " (" + color + ") " + storageCapacity + "GB - $" + price + " - 5G: " + is5G;
    }

    // 4. Metodo main
    public static void main(String[] args) {
        Celulares miCelular = new Celulares("Xiaomi", "Redmi Note 13", "Negro", 256, 1200000.0, true);

        System.out.println(miCelular.getDetails());
    }
}