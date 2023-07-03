
package modelo;

import java.util.ArrayList;

@author CubiculoB

public class Universitario {

    protected String nombre;
    protected ArrayList<Grupo> carga;
    
    public Universitario(){
        this.carga = new ArrayList<>();
    }

    public Universitario(String nombre) {
        this.nombre = nombre;
        this.carga = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Grupo> getCarga() {
        return carga;
    }

    public void addCarga(Grupo carga) {
        this.carga.add(carga);
    }

}