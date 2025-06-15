class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau");
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Animal[] animales = {
                new Perro("Fido"),
                new Gato("Mishi"),
                new Perro("Luna"),
                new Gato("Tom")
        };

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
