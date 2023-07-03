@author Alfredo Abad
public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;
    private int antiguedad;
    
    public Empleado(){
        this("no existe",1,0.0,0);
    }
    
    public void Empleado(String nombre, int edad, double sueldo, int antiguedad){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return titular;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public String toString(){
        return "nombre: " + getNombre() +
               "\nedad: " + getEdad() +
               "\nsueldo: " + getSueldo() +
               "\nantiguedad: " + getAntiguedad(); 
    }
}