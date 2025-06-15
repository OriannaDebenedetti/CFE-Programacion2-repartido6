public class Ejercicio1 {
    private String nombre;
    private double precio;
    private int stock;

    // Constructor 1: sin parámetros
    public Ejercicio1() {
        this.nombre = "Sin nombre";
        this.precio = 0.0;
        this.stock = 0;
    }

    // Constructor 2: nombre y precio
    public Ejercicio1(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }

    // Constructor 3: nombre, precio y stock
    public Ejercicio1(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método mostrarInfo
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: $" + precio + ", Stock: " + stock);
    }

    // Método main
    public static void main(String[] args) {
        Ejercicio1 p1 = new Ejercicio1(); // Usa constructor 1
        Ejercicio1 p2 = new Ejercicio1("Lapicera", 25.5); // Usa constructor 2
        Ejercicio1 p3 = new Ejercicio1("Cuaderno", 120.0, 50); // Usa constructor 3

        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
    }
}
