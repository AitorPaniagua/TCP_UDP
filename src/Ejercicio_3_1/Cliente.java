package Ejercicio_3_1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Datos basicos para la creacion del cliente
        String host = "localhost";
        int puerto = 50000;
        String pais;
        String ciudad;
        String saludo;

        //Creacion del socket lado cliente para iniciar el servidor
        Socket socketLadoCliente = new Socket(host, puerto);
        System.out.println("Iniciando programa cliente...");

        //Preparamos para enviar el objeto por conexion
        ObjectOutputStream oos = new ObjectOutputStream(socketLadoCliente.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socketLadoCliente.getInputStream());

        Scanner teclado = new Scanner(System.in);

        //Pasamos los datos por consola y los enviamos al servidor
        System.out.println("Introduce un pais: ");
        pais = teclado.nextLine();
        System.out.println("Introduce una ciudad: ");
        ciudad = teclado.nextLine();
        System.out.println("Introduce un saludo: ");
        saludo = teclado.nextLine();

        Saludo objetoAEnviar = new Saludo(pais, ciudad, saludo);

        oos.writeObject(objetoAEnviar);

        System.out.println("Esperando respuesta del servidor");

        //Archivos recibidos del servidor
        Saludo dato = (Saludo) ois.readObject();
        System.out.println("Archivo recibido del servidor: " + dato.toString());

        ois.close();
        oos.close();
        socketLadoCliente.close();

    }
    
}
