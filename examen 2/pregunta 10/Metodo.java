package controlador;

import java.util.ArrayList;
import modelo.Fidelidad;
import modelo.Credito;
import modelo.Debito;
import modelo.Tarjeta;

@author CubiculoB

public class Metodos {

    private ArrayList<Tarjeta> tarjetaArray;
    
    public Metodos(){
        tarjetaArray = new ArrayList<>();
    }

    public void add(String emisor, long numero, String propietario) {
        tarjetaArray.add(new Tarjeta(emisor, numero, propietario));
    }

    public void registrarFidelidad(String emisor, long numero, String propietario, int puntos) {
        tarjetaArray.add(new Tarjeta(emisor, numero, propietario, puntos));
    }

    public void registrarCredito(String emisor, long numero, String propietario, double deuda, int puntos, double limite) {
        tarjetaArray.add(new Tarjeta(emisor, numero, propietario, deuda, puntos, limite));
    }

    public void registrarDebito(String emisor, long numero, String propietario, double saldo) {
        tarjetaArray.add(new Tarjeta(emisor, numero, propietario, saldo));
    }

    public String mostrarFidelidad() {
        String info = "";
        for (Fidelidad fide : array) {
            info += fide.toString() + '\n';
        }
        return info;
    }

    public String mostrarCredito() {
        String info = "";
        for (Credito cred : array) {
            info += cred.toString() + '\n';
        }
        return info;
    }

    public String mostrarDebito() {
        String info = "";
        for (Debito debi : array) {
            info += debi.toString() + '\n';
        }
        return info;
    }

    public String modificarCredito(double saldo) {
        String info = null;
        double sal;
        Debito modde;
        sal = modde.getLimite();
        sal = sal+saldo;
        modcre.setLimite(sal);
        return info;
    }

    public String modificarDebito(int matricula, String matbuscar, int calificacion) {
        String info = null;
        for (Estudiante est : array) {
            if (est.getMatricula() == matricula) {
                est.setCalMaterias(calmat);
            }
        }
        return info;
    }
}