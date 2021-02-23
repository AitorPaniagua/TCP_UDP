package Ejercicio_3_2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String condicion = "";

        int puerto = 50000;

        ServerSocket servidor = new ServerSocket(puerto);
        System.out.println("Esperando al cliente....");
        Socket socketLadoServidor = servidor.accept();

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Saludo objetoARecibir = null;

        do {
            ois = new ObjectInputStream(socketLadoServidor.getInputStream());
            objetoARecibir = (Saludo) ois.readObject();

            System.out.println("Saludo recibido: " + objetoARecibir.toString());

            oos = new ObjectOutputStream(socketLadoServidor.getOutputStream());

            oos.writeObject(objetoARecibir);
        }while (!objetoARecibir.getPais().equals("*") && !objetoARecibir.getCiudad().equals("*") && !objetoARecibir.getSaludo().equals("*"));


        ois.close();
        oos.close();
        socketLadoServidor.close();
    }
}
