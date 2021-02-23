package Ejercicio_2_5;

import java.lang.reflect.Array;

public class HiloLetrasNumeros extends Thread {

    int tipo;

    public HiloLetrasNumeros(int tipo) {
        this.tipo = tipo;
    }

    public void run() {
        if (tipo == 1) {
            while (true) {
                for (char letras = 'a'; letras <= 'z'; letras++) {
                    System.out.println(letras);
                }
            }
        } else if (tipo == 2) {
            while (true) {
                for (int i = 0; i < 30; i++) {
                    System.out.println(i);
                }
            }
        }
    }
}
