package Ejercicio_2_1;

public class TestHilo extends Thread {

    public void letraA() {
        String letra = "a";
        for (int i = 0; i < 100; i++) {
            System.out.println(letra);
        }
    }

    public void letraB() {
        String letra = "b";
        for (int i = 0; i < 100; i++) {
            System.out.println(letra);
        }
    }

    public void numero() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public TestHilo(String letra) {
        this.letra = letra;
    }

    private String letra;

    public void run() {
        if (letra.equals("a")) {
            letraA();
        } else if (letra.equals("b")) {
            letraB();
        } else {
            numero();
        }
    }
}
