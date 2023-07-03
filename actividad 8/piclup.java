package modelo;

@author CubiculoB

public class Pickup extends Vehiculo {

    private String cabina;
    private int carga;
  
    public Alumno(int control, String modelo, int anyo, String color, double precio, String cabina, int carga) {
        super(control);
        super(modelo);
        super(anyo);
        super(color);
        super(precio); 
        this.cabina = cabina;
        this.carga = carga;
    }

    public String getCabina() {
        return cabina;
        
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }  

    public String toString() {
        String texto = "Datos del veiculo\n"
        + "control: " + control  
        + "\nmodelo: " + modelo
        + "\nanyo: " + anyo
        + "\ncolor: " + color
        + "\nprecio: " + precio
        + "\ncabina: " + cabina
        + "\ncarga: " + carga;
        return texto;
    }
}