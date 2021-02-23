package Ejercicio_3_2;

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
        String condicion = "";

        //Creacion del socket lado cliente para iniciar el servidor
        Socket socketLadoCliente = new Socket(host, puerto);
        System.out.println("Iniciando programa cliente...");

        //Preparamos para enviar el objeto por conexion
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        do {

        Scanner teclado = new Scanner(System.in);

        //Pasamos los datos por consola y los enviamos al servidor
        System.out.println("Introduce un pais: ");
        pais = teclado.nextLine();
        System.out.println("Introduce una ciudad: ");
        ciudad = teclado.nextLine();
        System.out.println("Introduce un saludo: ");
        saludo = teclado.nextLine();

        oos = new ObjectOutputStream(socketLadoCliente.getOutputStream());
        Saludo objetoAEnviar = new Saludo(pais, ciudad, saludo);

        oos.writeObject(objetoAEnviar);

        System.out.println("Esperando respuesta del servidor");
        ois = new ObjectInputStream(socketLadoCliente.getInputStream());

        //Archivos recibidos del servidor
        Saludo dato = (Saludo) ois.readObject();
        System.out.println("Archivo recibido del servidor: " + dato.toString());

        }while (!pais.equals("*") && !ciudad.equals("*") && !saludo.equals("*"));

        ois.close();
        oos.close();
        socketLadoCliente.close();

    }
    
}
