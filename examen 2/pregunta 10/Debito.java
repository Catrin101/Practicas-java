package modelo;

@author CubiculoB

    public class Debito extends Tarjeta {

    protected double saldo; 
    
    public Debito(String emisor, long numero, String propietario, double saldo) {
        super(emisor);
        super(numero);
        super(propietario);
        this.saldo = saldo;
    }
 
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }  

    public String toString() {
        String texto = "Datos de la Debito\n"
        + "emisor: " + emisor  
        + "\nnumero: " + numero
        + "\npropietario: " + propietario
        + "\nsaldo: " + saldo;
        return texto;
    }
}