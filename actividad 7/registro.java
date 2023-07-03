package vista;
import controlador.Metodos;
import java.util.InputMismatchException;
import java.util.Scanner;
import util.MiExcepcion;

@author jabad

public class Registro {

    static Metodos control;
    static Scanner inN;
    static Scanner inS;

    public static void main(String[] args) {
        control = new Metodos();
        inN = new Scanner(System.in);
        inS = new Scanner(System.in);
        do {
            switch (menu()) {
                case 1:
                    alta();
                break;
                case 2:
                    ingresar();
                break;
                case 3:
                    System.exit(0);
                break;
                default:
                    System.out.println("ERROR");
                break;
            }
        } while (true);
    }

    static int menu() {
        System.out.println("que quiere hacer");
        System.out.println("1. crear cuenta");
        System.out.println("2. ingresar a cuenta");
        System.out.println("3. salir");
        System.out.print(">> ");
        do {
            try {
                int op = inN.nextInt();
                return op;
            } catch (InputMismatchException ex) {
                System.out.println("Introduce un numero entero");
                inN = new Scanner(System.in);
            }
        } while (true);
    }

    static void alta() {
        String nombre;
        String apellidos;
        String usuario;
        String password;
        System.out.println("captura de datos (*obligatorio)");
        do {
            System.out.print("nombre :");
            nombre = inS.nextLine();
            try {
                nombre = control.valida_nombre(nombre);
                break;
            } catch (MiExcepcion miEx) {
                System.out.println(miEx.getMessage());
            }
        } while (true);
        do {
            System.out.print("apellidos :");
            String apellidos = inS.nextLine();
            try {
                apellidos = control.valida_apellidos(apellidos);
                break;
            } catch (MiExcepcion miEx) {
                System.out.println(miEx.getMessage());
            }
        } while (true);
        do {
            System.out.print("usuario :");
            usuario = inS.nextLine();
            try {
                usuario = control.valida_usuario(usuario);
                break;
            } catch (MiExcepcion miEx) {
             System.out.println(miEx.getMessage());
            }
        } while (true);
        do {
            System.out.print("password: ");
            password = inS.nextLine();
            try {
                password = control.valida_password(password);
                break;
            } catch (MiExcepcion miEx) {
                System.out.println(miEx.getMessage());
            }
        } while (true);
        control.add(nombre, apellidos, usuario, password);
    }
    
    static void ingresar() {
        String usu;
        String pas;
        do {
            System.out.print("usuario :");
            usu = inS.nextLine();
            try {
                usu = control.valida_usuario(usuario);
                break;
            } catch (MiExcepcion miEx) {
             System.out.println(miEx.getMessage());
            }
        } while (true);
        do {
            System.out.print("password: ");
            pas = inS.nextLine();
            try {
                pas = control.valida_password(password);
                break;
            } catch (MiExcepcion miEx) {
                System.out.println(miEx.getMessage());
            }
        } while (true);
        control.add(usu, pas);
    }
}