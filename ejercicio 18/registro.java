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
                    mostrar();
                break;
                case 3:
                    System.exit(0);
                break;
                default:
                    System.out.println("Opcion no valida");
                break;
            }
        } while (true);
    }

    static int menu() {
        System.out.println("*** Agenda ***");
        System.out.println("1. Guardar");
        System.out.println("2. Mostrar");
        System.out.println("3. Terminar");
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
        int edad;
        String direccion;
        String telefono;
        String eMail;
        System.out.println("captura de datos (*obligatorio)");
        do {
            System.out.print("*Nombre: ");
            nombre = inS.nextLine();
            try {
                nombre = control.valida_nombre(nombre);
                break;
            } catch (MiExcepcion miEx) {
                System.out.println(miEx.getMessage());
            }
        } while (true);
        do {
            System.out.print("*Edad: ");
            String ed = inS.nextLine();
            try {
                edad = control.valida_edad(ed);
                break;
            } catch (MiExcepcion miEx) {
                System.out.println(miEx.getMessage());
            }
        } while (true);
        System.out.print("Direccion: ");
        direccion = inS.nextLine();
        do {
            System.out.print("*Telefono: ");
            telefono = inS.nextLine();
            try {
                telefono = control.valida_telefono(telefono);
                break;
            } catch (MiExcepcion miEx) {
             System.out.println(miEx.getMessage());
            }
        } while (true);
        do {
            System.out.print("*Email: ");
            eMail = inS.nextLine();
            try {
                eMail = control.valida_eMail(eMail);
                break;
            } catch (MiExcepcion miEx) {
                System.out.println(miEx.getMessage());
            }
        } while (true);
        control.add(nombre, edad, direccion, telefono, eMail);
    }
    
    static void mostrar() {
        System.out.println();
        control.show();
        System.out.println("***********************************");
        System.out.println();
    }
}