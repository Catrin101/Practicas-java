@author Alfredo Abad
public class Automovil {
    private int control;
    private String modelo;
    private int anyo;
    private String colores;
    private int cantidad;
    private double precio;
    
    public Automovil(){
        this(0,"no hay",0,"no hay",0,0.0);
    }
    
    public void Automovil(int control, String modelo, int anyo, String colores, int cantidad, double precio){
        this.control = control;
        this.modelo = modelo;
        this.anyo = anyo;
        this.colores = colores;
        this.cantidad = cantidad;
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

    public String getColores() {
        return colores;
        ;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }
    
    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String toString(){
        return "control: " + getControl() +
               "\nmodelo: " + getModelo() +
               "\nanyo: " + getAnyo() +
               "\ncolores: " + getColores() +
               "\ncantidad: " + getCantidad() +
               "\nprecio: " + getPrecio(); 
    }
}