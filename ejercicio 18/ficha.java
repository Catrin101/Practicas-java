package modelo;

@author jabad

public class Ficha {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private String eMail;
    public Ficha(String nombre, int edad, String direccion, String telefono, String eMail) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.eMail = eMail;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    
    public String toString() {
        if (direccion.equals("")) {
            return "Nombre   : " + nombre
                    + "\nEdad     : " + edad
                    + "\nTelefono : " + telefono
                    + "\nEmail    : " + eMail;
        } else {
            return "Nombre   : " + nombre
                    + "\nEdad     : " + edad
                    + "\nDireccion: " + direccion
                    + "\nTelefono : " + telefono
                    + "\nEmail    : " + eMail;
        }
    }
}