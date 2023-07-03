package main;

import controlador.Metodos;
import java.util.Scanner;

@author CubiculoB

public class Facultad {

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
                        switch (submenu_texto("alumno")) {
                            case 1:
                                registrar_alumno();
                                break;
                            case 2:
                                asignar_carga_alumno();
                                break;
                            case 3:
                                mostrar_carga_alumno();
                                break;
                            case 4:
                                submenu = false;
                                break;
                        }
                    } while (submenu);
                    break;
                case 2:
                    submenu = true;
                    do {
                        switch (submenu_texto("maestro")) {
                            case 1:
                                registrar_maestro();
                                break;
                            case 2:
                                asignar_carga_maestro();
                                break;
                            case 3:
                                mostrar_carga_maestro();
                                break;
                            case 4:
                                submenu = false;
                                break;
                        }
                    } while (submenu);
                    break;
                case 3:
                    submenu = true;
                    do {
                        switch (submenu_texto_asesor("asesor")) {
                            case 1:
                                registrar_asesor();
                                break;
                            case 2:
                                asignar_carga_asesor();
                                break;
                            case 3:
                                mostrar_carga_asesor();
                                break;
                            case 4:
                                mostrar_horarios_asesor();
                                break;
                            case 5:
                                submenu = false;
                                break;
                        }
                    } while (submenu);
                    break;
                case 4:
                    registrar_curso();
                    break;
                case 5:
                    generar_lista();
                    break;
                case 6:
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
        System.out.println("1. Menu estudiantes");
        System.out.println("2. Menu maestros");
        System.out.println("3. Menu asesor");
        System.out.println("4. Registrar un curso");
        System.out.println("5. Generar listas");
        System.out.println("6. Terminar");
        System.out.print(">> ");
        return inN.nextInt();
    }

    static int submenu_texto(String texto) {
        System.out.println();
        System.out.println("******* " + texto + " ********");
        System.out.println("1. Registrar un " + texto);
        System.out.println("2. Asignar carga al " + texto);
        System.out.println("3. Mostrar carga del " + texto);
        System.out.println("4. regresar");
        System.out.print(">> ");
        return inN.nextInt();
    }

    static int submenu_texto_asesor(String texto) {
        System.out.println();
        System.out.println("******* " + texto + " ********");
        System.out.println("1. Registrar un " + texto);
        System.out.println("2. Asignar carga al " + texto);
        System.out.println("3. Mostrar carga del " + texto);
        System.out.println("4. Mostrar horarios del "+ texto);
        System.out.println("5. regresar");
        System.out.print(">> ");
        return inN.nextInt();
    }

    static void registrar_alumno() {
        System.out.println();
        System.out.print("Matricula :");
        String matricula = inS.nextLine();
        if (repetida(matricula)) {
            System.out.println("Matricula ya existente ...");
            registrar_alumno();
        } else {
            System.out.print("Nombre del alumno: ");
            String nombre = inS.nextLine();
            System.out.print("Semestre: ");
            int semestre = inN.nextInt();
            control.registrarAlumno(matricula, nombre, semestre);
        }
    }

    static void asignar_carga_alumno() {
        System.out.println();
        System.out.print("Matricula: ");
        String matricula = inS.nextLine();
        if (repetida(matricula)) {
            do {
                System.out.print("Clave de la materia: ");
                int clave = inN.nextInt();
                if (clave == 0) {
                    return;
                }
                if (existe(clave)) {
                    System.out.print("Grupo de la materia: ");
                    int grupo = inN.nextInt();
                    if (control.agregarCarga(matricula, clave, grupo)) {
                        System.out.println("Materia asignada con exito ...");
                    } else {
                        System.out.println("No se te pudo asignar ...");
                    }
                } else {
                    System.out.println("Clave no existente ...");
                }
            } while (true);
        } else {
            System.out.println("Matricula no existente ...");
        }
    }

    static void mostrar_carga_alumno() {
        System.out.println();
        System.out.print("Matricula: ");
        String matricula = inS.nextLine();
        if (repetida(matricula)) {
            System.out.println("\nCarga actual del estudiante");
            String carga = control.mostrarCarga(matricula);
            if (carga.equals("")) {
                System.out.println("\nSin carga este semestre");
            } else {
                System.out.println(carga);
            }
        } else {
            System.out.println("Matricula no existente ...");
        }
    }

    static void registrar_maestro() {
        System.out.println();
        System.out.print("Numero de empleado :");
        int noEmpleado = inN.nextInt();
        if (repetida(noEmpleado)) {
            System.out.println("Numero de empleado ya existente ...");
            registrar_maestro();
        } else {
            System.out.print("Nombre del maestro: ");
            String nombre = inS.nextLine();
            control.registrarMaestro(noEmpleado, nombre);
        }
    }

    static void asignar_carga_maestro() {
        System.out.println();
        System.out.print("Numero de empleado :");
        int noEmpleado = inN.nextInt();
        if (repetida(noEmpleado)) {
            do {
                System.out.print("Clave de la materia: ");
                int clave = inN.nextInt();
                if (clave == 0) {
                    return;
                }
                if (existe(clave)) {
                    System.out.print("Grupo de la materia: ");
                    int grupo = inN.nextInt();
                    if (control.agregarCursos(noEmpleado, clave, grupo)) {
                        System.out.println("Materia asignada con exito ...");
                    } else {
                        System.out.println("No se le pudo asignar ...");
                    }
                } else {
                    System.out.println("Clave no existente ...");
                }
            } while (true);
        } else {
            System.out.println("Numero de empleado no existente ...");
        }
    }

    static void mostrar_carga_maestro() {
        System.out.println();
        System.out.print("Numero de empleado :");
        int noEmpleado = inN.nextInt();
        if (repetida(noEmpleado)) {
            System.out.println("\nCursos impartidos por el maestro");
            String carga = control.mostrarCursos(noEmpleado);
            if (carga.equals("")) {
                System.out.println("\nSin cursos este semestre");
            } else {
                System.out.println(carga);
            }
        } else {
            System.out.println("Numero de empleado no existente ...");
        }
    }

    static void registrar_asesor() {
        System.out.println();
        System.out.print("horario del asesor:");
        String horario = inS.nextLine();
        if (repetida(horario)) {
            System.out.println("este horario ya existe ...");
            registrar_asesor();
        } else {
            System.out.print("Nombre del acesor: ");
            String nombre = inS.nextLine();
            control.registrarAsesor(horario, nombre);
        }
    }

    static void asignar_carga_asesor() {
        System.out.println();
        System.out.print("horario del asesor :");
        String horario = inS.nextLine();
        if (repetida(horario)) {
            do {
                System.out.print("Clave de la materia: ");
                int clave = inN.nextInt();
                if (clave == 0) {
                    return;
                }
                if (existe(clave)) {
                    control.agregarAsesoria(horario, clave)
                } else {
                    System.out.println("Clave no existente ...");
                }
            } while (true);
        } else {
            System.out.println("horario no existente ...");
        }
    }

    static void mostrar_carga_asesor() {
        System.out.println();
        System.out.print("horario del asesor :");
        String horario = inS.nextLine();
        if (repetida(horario)) {
            System.out.println("\nasesorias impartidad por el asesor");
            String carga = control.mostrarAsesorias(horario);
            if (carga.equals("")) {
                System.out.println("\nSin assesorias este semestre");
            } else {
                System.out.println(carga);
            }
        } else {
            System.out.println("horario del asesor no existente ...");
        }
    }

    static void mostrar_horarios_asesor(){
        control.mostrarHorarios();
    }

    static void registrar_curso() {
        System.out.println();
        System.out.print("Clave del curso: ");
        int clave = inN.nextInt();
        if (existe(clave)) {
            System.out.println("Clave ya existente ...");
            registrar_curso();
        } else {
            System.out.print("Nombre de la materia: ");
            String nombre = inS.nextLine();
            System.out.print("Creditos: ");
            int creditos = inN.nextInt();
            System.out.print("Numero de grupos: ");
            int n = inN.nextInt();
            int[] grupos = new int[n];
            int[] capacidad = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Grupo: ");
                grupos[i] = inN.nextInt();
                System.out.print("Capacidad del grupo " + grupos[i] + ": ");
                capacidad[i] = inN.nextInt();
            }
            control.registrarCurso(clave, nombre, creditos, grupos, capacidad);
        }
    }

    static void generar_lista() {
        System.out.println();
        System.out.print("Clave de la materia: ");
        int clave = inN.nextInt();
        if (existe(clave)) {
            System.out.print("Grupo de la materia: ");
            int grupo = inN.nextInt();
            String lista = control.mostrarListaAsistencia(clave, grupo);
            System.out.println();
            System.out.println(lista);
        } else {
            System.out.println("Clave no existente ...");
        }
    }

    static boolean repetida(String matricula) {
        return control.buscar(matricula);
    }

    static boolean repetida(int noEmpleado) {
        return control.buscar(noEmpleado);
    }

    static boolean existe(int clave) {
        return control.existe(clave);
    }
    
    static void datos_inicio(){
        control.registrarCurso(11210, "Calculo Diferencial", 7, new int[]{101, 102}, new int[]{2, 10});
        control.registrarCurso(11290, "Introduccion a la programacion", 6, new int[]{101, 102, 103}, new int[]{2, 10, 5});
        control.registrarCurso(11207, "Comunicacion oral y escrita", 5, new int[]{101, 102}, new int[]{2, 10});
        control.registrarCurso(11291, "Introduccion a los sistemas computacionales", 6, new int[]{101}, new int[]{20});
        control.registrarCurso(11292, "Contabilidad", 8, new int[]{101, 102}, new int[]{2, 10});
        control.registrarCurso(11206, "Desarrollo humano", 5, new int[]{101}, new int[]{20});
        control.registrarCurso(11293, "Taller de Linux", 4, new int[]{101, 102, 103}, new int[]{2, 10, 5});
        control.registrarAlumno("11/71753", "Alcantar Lopez Jesus Ramon", 1);
        control.registrarAlumno("11/70859", "Campista Castro Pedro Axel", 1);
        control.registrarAlumno("11/71108", "Casarez Palafox Jorge Alfonso", 1);
        control.registrarAlumno("11/72196", "Casas Qinonez Ivan Rafael", 1);
        control.registrarAlumno("11/71590", "Cruz Arce Leonardo", 1);
        control.registrarAlumno("11/71945", "Cruz Terrazas Marco Antonio", 1);
        control.registrarMaestro(15080, "Abad Padilla Jose Alfredo");
        control.registrarMaestro(10001, "Corona Guzman Antonio ");
        control.registrarMaestro(10002, "Rios Natera Martha Veronica");
        control.registrarMaestro(10003, "Valadez Lopez Guadalupe");
        control.registrarMaestro(10004, "Corrales Espinoza Julia");
        control.registrarMaestro(100051, "Cota Rivera Elia Ivette");
        control.registrarMaestro(10006, "Zazueta Apodaca Juan Francisco");
        control.registrarMaestro(10007, "Martinez Castillo Laura Elena");
        control.registrarMaestro(10008, "Madrigal Lizarraga Yohana");
    }
    

}