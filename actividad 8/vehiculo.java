package modelo;

import java.util.ArrayList;

@author CubiculoB

public class Vehiculo {

    protected int control;
    protected String modelo;
    protected int anyo;
    protected String color;
    protected double precio;
    
    public Vehiculo(int control, String modelo, int anyo, String color, double precio) {
        this.control = control;
        this.modelo = modelo;
        this.anyo = anyo;
        this.color = color;
        this.precio = precio;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        String texto = "Datos del veiculo\n"
        + "control: " + control  
        + "\nmodelo: " + modelo
        + "\nanyo: " + anyo
        + "\ncolor: " + color
        + "\nprecio: " + precio;
        return texto;
    }
}