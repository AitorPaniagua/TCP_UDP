package Ejercicio_2_7;

public class Contador extends Thread {

    String nombre;
    int contador;
    int limite;

    public Contador(String nombre, int contador, int limite) {
        this.nombre = nombre;
        this.contador = 0;
        this.limite = limite;
    }

    public void run() {

            while (contador <= limite) {
                System.out.println(nombre + ": " + contador );
                contador ++;
            }
            System.out.println(nombre + " ya ha acabado");
    }
}