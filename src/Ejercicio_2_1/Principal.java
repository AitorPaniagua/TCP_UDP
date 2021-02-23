package Ejercicio_2_1;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        TestHilo a = new TestHilo("a");
        TestHilo b = new TestHilo("b");
        TestHilo numeros = new TestHilo("n");

        a.start();
        b.start();
        numeros.start();

    }
}
