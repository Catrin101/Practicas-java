package modelo;

@author CubiculoB

public class Curso {

    private int clave;
    private String nombre;
    private int creditos;
     
    
    public Curso(int clave, String nombre, int creditos) {
        this.clave = clave;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Clave: " + clave + "  Materia: " + nombre + " Creditos: " + creditos;
    }
    
    
}