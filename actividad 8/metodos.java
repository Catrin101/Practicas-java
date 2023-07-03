package controlador;

import java.util.ArrayList;
import modelo.Alumno;
import modelo.Curso;
import modelo.Grupo;
import modelo.Maestro;
import modelo.Universitario;

@author CubiculoB

public class Metodos {

    private ArrayList<Vehiculo> vehiculoArray;
    
    public Metodos(){
        vehiculoArray = new ArrayList<>();
    }

    public void add(int control, String modelo, int anyo, String color, double precio) {
        lista.add(new Vehiculo(control, modelo, anyo, color, precio));
    }

    public void registrarPickup(int control, String modelo, int anyo, String color, double precio) {
        vehiculoArray.add(new pickup(control, modelo, anyo, color, precio));
    }

    public void registrarVan(int control, String modelo, int anyo, String color, double precio) {
        vehiculoArray.add(new Van(control, modelo, anyo, color, precio));
    }

    public void registrarSedan(int control, String modelo, int anyo, String color, double precio) {
        vehiculoArray.add(new Sedan(control, modelo, anyo, color, precio));
    }

    public String buscarPickup(String cabina, int carga) {
        String buscar = "";
        for (Vehiculo vehiculo : vehiculoArray) {
             if (vehiculo instanceof Pickup && ((pickup) vehiculo).getCabina() == cabina) {
                if (vehiculo instanceof Pickup && ((pickup) vehiculo).getCarga() == carga) {
                    buscar = ((pickup) vehiculo).toString();
                }
            }
        }
        return buscar;
    }

    public String buscarVan(int pasajeros) {
        String buscar = "";
        for (Vehiculo vehiculo : vehiculoArray) {
             if (vehiculo instanceof Van && ((van) vehiculo).getPasajeros() == pasajeros) {
                buscar = ((van) vehiculo).toString();
            }
        }
        return buscar;
    }

    public String buscarSedan(boolean quemacoco, String transmision) {
        String buscar = "";
        for (Vehiculo vehiculo : vehiculoArray) {
             if (vehiculo instanceof Sedan && ((sedan) vehiculo).getQuemacoco() == quemacoco) {
                if (vehiculo instanceof Sedan && ((sedan) vehiculo).getTransmision() == transmision) {
                    buscar = ((pickup) vehiculo).toString();
                }
            }
        }
        return buscar;
    }

    public void anyoDeterminado(int anyo){
        for(Vehiculo v: lista){
            if (v.anyo == anyo) {
                System.out.println("************************************************");
                System.out.println(v);
                return v;
            }
        }   
    }

    public void colorEspecifico(Strin color){
        for(Vehiculo v: lista){
            if (v.anyo == color) {
                System.out.println("************************************************");
                System.out.println(v);
                return v;
            }
        }   
    }

    public boolean buscar(int con) {
        for (Vehiculo vehiculo : vehiculoArray) {
            if (vehiculo instanceof Vehiculo && ((vehiculo) vehiculo).getcontrol() == con) {
                return true;
            }
        }
        return false;
    }

    public void show(){
        for(Vehiculo v: lista){
            System.out.println("************************************************");
            System.out.println(v);
            return v;
        }   
    }
}