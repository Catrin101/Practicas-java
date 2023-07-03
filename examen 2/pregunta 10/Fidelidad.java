package modelo;

@author CubiculoB

public class Fidelidad extends Tarjeta {

    protected int puntos; 
    
    public Fidelidad(String emisor, long numero, String propietario, int puntos) {
        super(emisor);
        super(numero);
        super(propietario);
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }  

    public String toString() {
        String texto = "Datos de la fidelidad\n"
        + "emisor: " + emisor  
        + "\nnumero: " + numero
        + "\npropietario: " + propietario
        + "\npuntos: " + puntos;
        return texto;
    }
}