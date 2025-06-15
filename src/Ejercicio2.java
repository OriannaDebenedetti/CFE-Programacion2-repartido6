public class Ejercicio2 {
    private String nombre;
    private double sueldoBase;
    private int horasExtras;

    // Constructor 1: sin parámetros
    public Ejercicio2() {
        this.nombre = "Sin nombre";
        this.sueldoBase = 0.0;
        this.horasExtras = 0;
    }
S
    // Constructor 2: nombre y sueldoBase
    public Ejercicio2(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtras = 0;
    }

    // Constructor 3: nombre, sueldoBase y horasExtras
    public Ejercicio2(String nombre, double sueldoBase, int horasExtras) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
    }

    public double calcularSueldoTotal() {
        return sueldoBase + (250 * horasExtras);
    }

    public static void main(String[] args) {
        Ejercicio2 e1 = new Ejercicio2(); // Constructor 1
        Ejercicio2 e2 = new Ejercicio2("Juan", 15000); // Constructor 2
        Ejercicio2 e3 = new Ejercicio2("Ana", 18000, 4); // Constructor 3

        System.out.println("Empleado: " + e1.nombre + ", Sueldo total: $" + e1.calcularSueldoTotal());
        System.out.println("Empleado: " + e2.nombre + ", Sueldo total: $" + e2.calcularSueldoTotal());
        System.out.println("Empleado: " + e3.nombre + ", Sueldo total: $" + e3.calcularSueldoTotal());
    }
}
