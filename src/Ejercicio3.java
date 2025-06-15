public class Ejercicio3 {

    // Convertir metros a centímetros
    public double convertir(double metros) {
        return metros * 100;
    }

    // Convertir kilogramos a gramos
    public double convertir(double kilogramos, String tipo) {
        if (tipo.equals("peso")) {
            return kilogramos * 1000;
        }
        return kilogramos; // No convierte si no es "peso"
    }

    // Convertir temperatura de Celsius a Fahrenheit
    public double convertir(double temperatura, boolean esTemperatura) {
        if (esTemperatura) {
            return (temperatura * 9 / 5) + 32;
        }
        return temperatura;
    }

    public static void main(String[] args) {
        Ejercicio3 conversor = new Ejercicio3();

        System.out.println("5 metros en cm: " + conversor.convertir(5.0));
        System.out.println("2 kg en gramos: " + conversor.convertir(2.0, "peso"));
        System.out.println("25°C en Fahrenheit: " + conversor.convertir(25.0, true));
    }
}
