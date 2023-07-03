package controlador;

import java.util.ArrayList;
import modelo.Ficha;
import util.MiExcepcion;

 @author jabad

public class Metodos {

    ArrayList<Ficha> lista = new ArrayList<>();

    public void add(String nombre, int edad, String direccion, String telefono, String eMail) {
        lista.add(new Ficha(nombre, edad, direccion, telefono, eMail));
    }

    public String valida_nombre(String nombre) throws MiExcepcion {
        if (nombre.equals("")) {
            throw new MiExcepcion("Campo obligatorio");
        }
        return nombre;
    }

    public int valida_edad(String edad) throws MiExcepcion {
        if (edad.equals("")) {
            throw new MiExcepcion("Campo obligatorio");
        }
        try {
            int edadNumerica = Integer.parseInt(edad);
            if (edadNumerica <= 0) {
                throw new MiExcepcion("Debe ser entero positivo");
            }
            return edadNumerica;
        } catch (NumberFormatException ex) {
            throw new MiExcepcion("Dato entero");
        }
    }

    public String valida_telefono(String telefono) throws MiExcepcion {
        String numeros = "0123456789";
        if (telefono.equals("")) {
            throw new MiExcepcion("Campo obligatorio");
        }
        int len = telefono.length();
        if (len != 14) {
            throw new MiExcepcion("Formato: (000)000‐00‐00");
        }
        boolean wrongFormat = false;
        for (int x = 0; x < 14; x++) {
            switch (x) {
                case 0:
                    wrongFormat = (telefono.charAt(x) != '(');
                    break;
                case 4:
                    wrongFormat = (telefono.charAt(x) != ')');
                    break;
                case 8:
                case 11:
                    wrongFormat = (telefono.charAt(x) != '‐');
                    break;
                default:
                    wrongFormat = !(numeros.contains(Character.toString(telefono.charAt(x))));
            }
            if (wrongFormat) {
                throw new MiExcepcion("Formato: (000)000‐00‐00");
            }
        }
        return telefono;
    }

    public String valida_eMail(String eMail) throws MiExcepcion {
        if (eMail.equals("")) {
            throw new MiExcepcion("Campo obligatorio");
        }
        if (!eMail.contains("@")) {
            throw new MiExcepcion("Formato: usuario@dominio.extension");
        }
        String[] parts = eMail.split("@");
        if (parts.length != 2) {
            throw new MiExcepcion("Formato: usuario@dominio.extension");
        }
        String[] server = parts[1].split("\\.");
        if ((server.length < 2 || server.length > 3) || (server[1].length() != 3)
                || (server.length == 3 && server[2].length() != 2)) {
            throw new MiExcepcion("Formato: usuario@dominio.extension");
        }
        return eMail;
    }
    
    public void show(){
        for(Ficha f: lista){
            System.out.println("************************************************");
            System.out.println(f);
        }   
    }
}