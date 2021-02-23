package Ejercicio_3_2;

import java.io.Serializable;

public class Saludo implements Serializable {
    String pais;
    String ciudad;
    String saludo;

    public Saludo(String pais, String ciudad, String saludo) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.saludo = saludo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    @Override
    public String toString() {
        return "Saludo{" +
                "pais='" + pais + '\'' + ", ciudad='" + ciudad + '\'' + ", saludo='" + saludo + '\'' + '}';
    }

}
