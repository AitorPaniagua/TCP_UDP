package Ejercicio_2_7;

public class Principal {

    public static void main(String[] args){

        Contador c1 = new Contador("Hilo Contador 1", 100, 60);
        Contador c2 = new Contador("Hilo Contador 2", 100, 50);
        Contador c3 = new Contador("Hilo Contador 3", 100, 30);
        Contador c4 = new Contador("Hilo Contador 4", 100, 40);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
