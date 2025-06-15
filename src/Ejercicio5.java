class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public int velocidadMaxima() {
        return 100; // valor por defecto
    }
}

class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(String marca, String modelo, int anio, int cantidadDePuertas) {
        super(marca, modelo, anio);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int velocidadMaxima() {
        return 180;
    }
}

class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    public int velocidadMaxima() {
        return 120;
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Auto("Toyota", "Corolla", 2020, 4);
        vehiculos[1] = new Motocicleta("Yamaha", "YZF-R3", 2021, false);
        vehiculos[2] = new Auto("Ford", "Fiesta", 2018, 5);
        vehiculos[3] = new Motocicleta("Honda", "CBR", 2019, true);

        for (Vehiculo v : vehiculos) {
            System.out.println(v.marca + " " + v.modelo + " → Velocidad máxima: " + v.velocidadMaxima() + " km/h");
        }
    }
}
