package main;

import controlador.Metodos;
import java.util.Scanner;

@author CubiculoB

public class menu {

    static Metodos control;
    static Scanner inS;
    static Scanner inN;

    public static void main(String[] args) {
        control = new Metodos();
        inS = new Scanner(System.in);
        inN = new Scanner(System.in);
        boolean submenu;
        datos_inicio();
        do {
            switch (menu_texto()) {
                case 1:
                    submenu = true;
                    do {
                        switch (submenu_texto_alta()) {
                            case 1:
                                registrar_pickup();
                                break;
                            case 2:
                                registrar_van();
                                break;
                            case 3:
                                registrar_sedan();
                                break;
                            case 4:
                                submenu = false;
                                break;
                        }
                    } while (submenu);
                    break;
                case 2:
                    buscar_vehiculo();
                    break;
                case 3:
                    
                    break;
                case 4:
                    submenu = true;
                    do {
                        switch (submenu_texto_inventario()) {
                            case 1:
                                mostrar();
                                break;
                            case 2:
                                mostrar_anyo();
                                break;
                            case 3:
                                mostrar_color();
                                break;
                            case 4:
                                submenu = false;
                                break;
                        }
                    } while (submenu);
                    break;
                case 5:
                    System.out.println("adios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        } while (true);
    }

    static int menu_texto() {
        System.out.println();
        System.out.println("*** Menu principal ***");
        System.out.println("1. Menu alta vehiculo");
        System.out.println("2. buscar un vehiculo");
        System.out.println("3. venta de un vehiculo");
        System.out.println("4. mostrar inventarip");
        System.out.println("5. salir");
        System.out.print(">> ");
        return inN.nextInt();
    }

    static int submenu_texto_alta() {
        System.out.println();
        System.out.println("*** Menu alta vehiculo ***");
        System.out.println("1. pickup.");
        System.out.println("2. van.");
        System.out.println("3. sedan.");
        System.out.println("4. regresar.");
        System.out.println(">>");
        return inN.nextInt();
    }

    static int submenu_texto_inventario() {
        System.out.println();
        System.out.println("*** Menu inventario");
        System.out.println("1. completo.");
        System.out.println("2. de un anyo determinado.");
        System.out.println("3. de un color en especifico.");
        System.out.println("4. regresar.");
        return inN.nextInt();
    }

    static void registrar_pickup() {
        System.out.println();
        System.out.println("control :");
        int control = inN.nextInt();
        if (repetida(control)) {
            System.out.println("control ya existe");
            registrar_pickup();
        } else {
            System.out.println("modelo: ");
            String modelo = inS.nextLine();
            System.out.println("anyo: ");
            int anyo = inN.nextInt();
            System.out.println("color: ");
            String color = inS.nextLine();
            System.out.println("precio: ");
            double precio = inN.nextdouble();
            System.out.println("cabina: ");
            String cabina = inS.nextLine();
            System.out.println("carga: ");
            int carga = inN.nextInt();
            control.registrarPickop(control, modelo, anyo, color, precio, cabina, carga);
        }
    }

    static void registrar_van() {
        System.out.println();
        System.out.println("control :");
        int control = inN.nextInt();
        if (repetida(control)) {
            System.out.println("control ya existe");
            registrar_pickup();
        }
        else{
            System.out.println("modelo: ");
            String modelo = inS.nextLine();
            System.out.println("anyo: ");
            int anyo = inN.nextInt();
            System.out.println("color: ");
            String color = inS.nextLine();
            System.out.println("precio: ");
            double precio = inN.nextdouble();
            System.out.println("pasajeros: ");
            int pasajeros = inN.nextInt();
            control.registrarVan(control, modelo, anyo, color, precio, pasajeros);
        }
    }

    static void registrar_sedan() {
        System.out.println();
        System.out.println("control :");
        int control = inN.nextInt();
        if (repetida(control)) {
            System.out.println("control ya existe");
            registrar_pickup();
        }
        else{
           System.out.println("modelo: ");
           String modelo = inS.nextLine();
           System.out.println("anyo: ");
           int anyo = inN.nextInt();
           System.out.println("color: ");
           String color = inS.nextLine();
           System.out.println("precio: ");
           double precio = inN.nextdouble();
           System.out.println("quemacoco: ");
           boolean quemacoco = inS.nextBoolean();
           System.out.println("trasmision: ");
           String trasmision = inS.nextLine();
           control.registrarSedan(control, modelo, anyo, color, precio, quemacoco, trasmision); 
        }
    }

    static void buscar_vehiculo() {
        String bucar;
        System.out.println();
        System.out.println("que tipo de vehiculo busca");
        System.out.println("1. pickup.")
        System.out.println("2. van.")
        System.out.println("3. sedan.")
        System.out.println(">>")
        int des = inN.nextiInt();
        switch(des){
            case 1:
            System.out.println("cabina: ")
            String cabina = inS.nextiLine();
            System.out.println("carga; ")
            int carga = inN.nextiInt();
            bucar = control.buscarPickup(cabina, carga);
            System.out.println(buscar);
            break;
            case 2:
            System.out.println("pasajeros; ")
            int pasajeros = inN.nextiInt();
            bucar = control.buscarVan(pasajeros);
            System.out.println(buscar);
            break;
            case 3:
            System.out.println("quemacoco 1.true 2.false: ")
            boolean quemacoco = inS.nextiBoolean();
            System.out.println("transmision; ")
            String transmision = inS.nextiLine();
            bucar = control.buscarSedan(quemacoco, transmision);
            System.out.println(buscar);

            break;
            default:
            System.out.println("ERROR")
            break;
        }
    }

    static void mostrar(){
        String carga = control.show();
        System.out.println(carga);
    }

    static void mostrar_anyo(){
        System.out.println();
        System.out.println("anyo a buscar: ");
        int anyo = inN.nextInt();
        String carga = control.anyoDeterminado(anyo);
        System.out.println(carga);
    }

    static void mostrar_color(){
        System.out.println();
        System.out.println("color a buscar: ");
        String color = inS.nextLine();
        String carga = control.colorEspecifico(color);
        System.out.println(carga);
    }

    static boolean repetida(int control) {
        return control.buscar(control);
    }
}