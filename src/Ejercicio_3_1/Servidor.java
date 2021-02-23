package Ejercicio_3_1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int puerto = 50000;

        ServerSocket servidor = new ServerSocket(puerto);
        System.out.println("Esperando al cliente....");
        Socket socketLadoServidor = servidor.accept();

        ObjectOutputStream oos = new ObjectOutputStream(socketLadoServidor.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socketLadoServidor.getInputStream());

        Saludo objetoARecibir = (Saludo) ois.readObject();

        System.out.println("Saludo recibido: " + objetoARecibir.toString());

        oos.writeObject(objetoARecibir);

        ois.close();
        oos.close();
        socketLadoServidor.close();
    }
}
