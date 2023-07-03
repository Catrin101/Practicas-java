package controlador;

import java.util.ArrayList;
import modelo.Ficha;
import util.MiExcepcion;

 @author jabad

public class Metodos {

    ArrayList<Cuenta> lista = new ArrayList<>();

    public void add(String nombre, String apellidos, String usuario, String password) {
        lista.add(new Cuenta(nombre, apellidos, usuario, password));
    }

    public String valida_nombre(String nombre) throws MiExcepcion {
        int si;
        do{
            String nombre = Integer.parseInt(nom);
            if (nombre == " ") {
                    
            }
            else{
                throw new MiExcepcion("");
                si=2;
            }
        }while(si!=2)
        return nombre;
    }

    public String valida_apellidos(String apellidos) throws MiExcepcion {
        try {
            int si;
            do{
                String apellidos = Integer.parseInt(apellidos);
                if (apellidos == " ") {
                    
                }
                else{
                    throw new MiExcepcion("");
                    si=2;
                }
            }while(si!=2);
            return apellidos;
    }

    public String valida_ususario(String usuario) throws MiExcepcion {
        int si;
        do{
            String usuario = Integer.parseInt(usu);
            if (usuario == " ") {
                    
            }
            else{
                throw new MiExcepcion("");
                si=2;
            }
        }while(si!=2)
        return usuario;
    }

    public String valida_password(String password) throws MiExcepcion {
        int si;
        do{
            String  = Integer.parseInt(password);
            if (password == " ") {
                    
            }
            else{
                throw new MiExcepcion("");
                si=2;
            }
        }while(si!=2)
        return password;
    }
    
    public void ingresar(String usuario, String password){{
        String  = Integer.parseInt(usu);
        if (usu == getUsuario()) {
            if (pas == getPassword()) {
                System.out.println("su usuario y password son correctos");
            }
            else{
                System.out.println("su usuario y password son incorrectos");
            }
        }
        else{
            System.out.println("su usuario y password son incorrectos");
        }
    }
}