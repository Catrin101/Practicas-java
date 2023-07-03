package modelo;

@author CubiculoB

public class Grupo {

    private int num;
    private int clave;
    private int capacidad;

    public Grupo(int num, int clave, int capacidad) {
        this.num = num;
        this.clave = clave;
        this.capacidad = capacidad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
}