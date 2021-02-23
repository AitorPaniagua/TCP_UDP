package Ejercicio_2_4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Caballos caballo1 = new Caballos("caballo1", false);
        Caballos caballo2 = new Caballos("caballo2", false);
        Caballos caballo3 = new Caballos("caballo3", false);

        System.out.println("Elige uno (1.Caballo1, 2.Caballo2, 3.Caballo3): ");
        int caballoElegido = teclado.nextInt();
        if (caballoElegido == 1){
            caballo1.elegido = true;
        }else if (caballoElegido == 2){
            caballo2.elegido = true;
        }else if(caballoElegido == 3){
            caballo3.elegido = true;
        }

        caballo1.start();
        caballo2.start();
        caballo3.start();


    }
}
