package main;

import controlador.Metodos;
import java.util.Scanner;

@author CubiculoB

public class MiWallet {

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
                        switch (submenu_texto_1()) {
                            case 1:
                                mostrar_datos_fidelidad();
                                break;
                            case 2:
                                mostrar_datos_credito();
                                break;
                            case 3:
                                mostrar_datos_debito();
                                break;
                            case 4:
                                submenu = false;
                                break;
                        }
                    } while (submenu);
                    break;
                case 2:
                    break;
                case 3:
                    submenu = true;
                    do {
                        switch (submenu_texto_3()) {
                            case 1:
                                modificar_debito();
                                break;
                            case 2:
                                modificar_credito();
                                break;
                            case 3:
                                submenu = false;
                                break;
                        }
                    } while (submenu);
                    break;
                case 4:
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
        System.out.println("******* Principal ********");
        System.out.println("1. consulta");
        System.out.println("2. compra en linea");
        System.out.println("3. modificar");
        System.out.println("4. salir");
        System.out.print(">> ");
        return inN.nextInt();
    }

    static int submenu_texto_1() {
        System.out.println();
        System.out.println("******* consulta ********");
        System.out.println("1. fidelidad");
        System.out.println("2. credito");
        System.out.println("3. debito");
        System.out.println("4. regresar");
        System.out.print(">> ");
        return inN.nextInt();
    }

    static int submenu_texto_2() {
        System.out.println();
        System.out.println("******* compra en linea ********");
        System.out.println("1. efectivo");
        System.out.println("2. credito");
        System.out.println("3. ountos");
        System.out.println("4. regresar");
        System.out.print(">> ");
        return inN.nextInt();
    }

    static int submenu_texto_3() {
        System.out.println();
        System.out.println("******* modificar ********");
        System.out.println("1. depositar debito");
        System.out.println("2. subir limite credito");
        System.out.println("3. regresar");
        System.out.print(">> ");
        return inN.nextInt();
    }

    static void mostrar_datos_fidelidad() {
        String informacion = control.mostrarFidelidad();
        System.out.println(informacion);
    }

    static void mostrar_datos_credito() {
        String informacion = control.mostrarCredito();
        System.out.println(informacion);
    }

    static void mostrar_datos_debito() {
        String informacion = control.mostrarDebito();
        System.out.println(informacion);
    }

    static void modificar_credito() {
        mostrar_datos_credito();
        System.out.println("");
        System.out.println("de que banco es la tarjeta:");
        String emisor = inS.nextLine();
        System.out.println("cuanto le va a subir el limite:");
        double limite = inN.nextDouble();
        String modcre = control.modificarCredito(emisor, limite);
        if (modcre == null) {
            System.out.println("no existe esta tarjeta");
        } else {
            System.out.println(modcre);
        }
    }

    static void modificar_debito() {
        mostrar_datos_debito();
        System.out.println("");
        System.out.println("cuanto va a depositar:");
        double saldo = inN.nextDouble();
        String modde = control.modificarDebito(saldo);
        if (modde == null) {
            System.out.println("no existe esta tarjeta");
        } else {
            System.out.println(modde);
        }
    }

    static void datos_inicio(){
        control.registrarFidelidad("calimax",2685594736549510,"enrique",200);
        control.registrarFidelidad("ferbys",2056130487950123,"enrique",200);
        control.registrarCredito("santander",5904708603541305,"enrique",0.0,500,15000.0);
        control.registrarCredito("banamex",1103674950269843,"enrique",0.0,500,20000.0);
        control.registrarDebito("banamex",5564870395048620,"enrique",50000.0);
    }
}