package Ejercicio_2_6;

public class HiloLetrasNumeros extends Thread {

    int tipo;
    private static boolean cambio = false;

    public HiloLetrasNumeros(int tipo) {
        this.tipo = tipo;
    }

    public void run() {
        while (true) {
            if (tipo == 1) {
                while (cambio == true) {
                    cambio = false;
                    for (char letras = 'a'; letras <= 'z'; letras++) {
                        System.out.println(letras);
                    }
                }
            } else if (tipo == 2) {
                while (cambio == false) {
                    cambio = true;
                    for (int i = 0; i < 30; i++) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
