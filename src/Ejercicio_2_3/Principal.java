package Ejercicio_2_3;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        TestHilo a = new TestHilo("a");
        TestHilo b = new TestHilo("b");
        TestHilo numeros = new TestHilo("n");

        a.setPriority(10);
        b.setPriority(1);
        numeros.setPriority(5);
        a.start();
        b.start();
        numeros.start();

    }
}
