public class TiendaCelulares {

    public static void main(String[] args) {
        Celulares cel1 = new Celulares("Xiaomi", "Redmi Note 13", "Negro", 256, 1200000.0, true);
        Celulares cel2 = new Celulares("Samsung", "Galaxy S24", "Gris", 512, 4500000.0, true);

        String estadoStock = "En bodega";

        // Usamos los Getters para imprimir la información
        IO.println("Producto:       " + cel1.getBrand());
        IO.println("Referencia:     " + cel1.getModel());
        IO.println("Color:          " + cel1.getColor());
        IO.println("Almacenamiento: " + cel1.getStorageCapacity() + "GB");
        IO.println("Precio:         $" + cel1.getPrice());
        IO.println("\n---------------------------");
        IO.println("Estado actual:  " + estadoStock);
        IO.println("---------------------------");

        IO.println("¡Sistema de inventario actualizado!");
    }
}
