package Ejercicio_2_4;

public class Caballos extends Thread{

    String nombre;
    boolean elegido;
    private static boolean bandera = false;

    public Caballos(String nombre, boolean elegido){
        this.nombre = nombre;
        this.elegido = elegido;
    }

    public void run(){
        System.out.println(nombre + " ha empezado a correr!");
        for (int i=0; i <= 500; i++){
            if (bandera == true){
                this.interrupt();
            }else {
                if (i %100 == 0 && i != 0 && bandera == false){
                    System.out.println("Distancia recorrida: " + nombre + " " + i);
                    if (i == 500 && bandera == false){
                        bandera = true;
                        System.out.println(nombre + " ha ganado la carrera");
                        if (elegido == true){
                            System.out.println("Has elegido al caballo ganador");
                        }else{
                            System.out.println("Has elegido al caballo equivocado");
                        }
                    }
                }
            }
        }
    }
}
