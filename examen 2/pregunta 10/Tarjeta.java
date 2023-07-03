package modelo;

import java.util.ArrayList;

@author CubiculoB

public class Tarjeta {

    protected String emisor;
    protected long numero;
    protected String propietario;
    
    public Tarjeta(String emisor, long numero, String propietario) {
        this.emisor = emisor;
        this.numero = numero;
        this.propietario = propietario;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String toString() {
        String texto = "Datos de la tarjeta\n"
        + "emisor: " + emisor  
        + "\nnumero: " + numero
        + "\npropietario: " + propietario;
        return texto;
    }
}