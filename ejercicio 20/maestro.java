package modelo;

@author CubiculoB

public class Maestro extends Universitario {

    protected int noEmpleado;
    

    public Maestro(int noEmpleado, String nombre) {
        super(nombre);
        this.noEmpleado = noEmpleado;
    }

    public int getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    @Override
    public String toString() {
        return "Num. Empleado: " + noEmpleado + "  Nombre del maestro: " + nombre;
    }   
    
}