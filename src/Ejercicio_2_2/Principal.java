package Ejercicio_2_2;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        TestHilo a = new TestHilo("a");
        TestHilo b = new TestHilo("b");
        TestHilo numeros = new TestHilo("n");

        numeros.start();
        numeros.join();
        b.start();
        b.join();
        a.start();
    }
}
