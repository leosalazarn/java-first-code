public class Celulares {

    // 1. Atributos
    private String brand;
    private String model;
    private String color;
    private int storageCapacity;
    private double price;
    private boolean is5G;

    // 2. Constructor
    public Celulares(String brand, String model, String color, int storageCapacity, double price, boolean is5G) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.storageCapacity = storageCapacity;
        this.price = price;
        this.is5G = is5G;
    }

    // 3. Métodos GETTER
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getStorageCapacity() { return storageCapacity; }
    public double getPrice() { return price; }
    public boolean is5G() { return is5G; }
}