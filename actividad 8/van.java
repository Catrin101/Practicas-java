package modelo;

@author CubiculoB

public class Van extends Vehiculo {

    protected int pasajeros; 
    
    public Van(int control, String modelo, int anyo, String color, double precio, int pasajeros) {
        super(control);
        super(modelo);
        super(anyo);
        super(color);
        super(precio);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }  

    public String toString() {
        String texto = "Datos del veiculo\n"
        + "control: " + control  
        + "\nmodelo: " + modelo
        + "\nanyo: " + anyo
        + "\ncolor: " + color
        + "\nprecio: " + precio
        + "\npasajeros: " + pasajeros;
        return texto;
    }}