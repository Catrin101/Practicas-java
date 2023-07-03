package modelo;

@author CubiculoB

public class Credito extends Tarjeta {

    protected double deuda;
    protected int puntos;
    protected double limite; 
    
    public Fidelidad(String emisor, long numero, String propietario, double deuda, int puntos, double limite) {
        super(emisor);
        super(numero);
        super(propietario);
        this.deuda = deuda;
        this.puntos = puntos;
        this.limite = limite;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString() {
        String texto = "Datos del credito\n"
        + "emisor: " + emisor  
        + "\nnumero: " + numero
        + "\npropietario: " + propietario
        + "\ndeuda: " + deuda
        + "\npuntos: " + puntos
        + "\nlimite: " + limite;
        return texto;
    }
}