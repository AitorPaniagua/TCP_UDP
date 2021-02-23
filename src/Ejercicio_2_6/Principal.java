package Ejercicio_2_6;

public class Principal {

    public static void main(String[] args){


        HiloLetrasNumeros numeros = new HiloLetrasNumeros(1);
        HiloLetrasNumeros letras = new HiloLetrasNumeros(2);

        numeros.start();
        letras.start();
    }
}
