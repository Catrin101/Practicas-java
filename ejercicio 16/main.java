package main;
import controlador.Metodos;
import java.util.Scanner;

public class Main {
	
	static Metodos controller;
	static Estudiante con;
	static Scanner scN;
	static Scanner scC;
	static int x;
	
	public static void main(String[] args) {
		scN = new Scanner(System.in);
		scC = new Scanner(System.in);
		controller = new Metodos();
		do {
			switch (menu()) {
				case 1:
				capturar_datos();
				break;
				case 2:
				mostrar_materias_na();
				break;
				case 3:
				modificar_calificacion();
				break;
				case 4:
				mostrar_datos();
				break;
				case 5:
				System.out.println("hasta la vista !!");
				System.exit(0);
				break;
				default:
				System.out.println("opcion no valida");
				break;
			}
		} while (true);
	}
	
	static int menu() {
		System.out.println("\n1. Capturar datos");
		System.out.println("2. Mostrar materias no acreditadas");
		System.out.println("3. Modificar calificacion");
		System.out.println("4. Mostrar datos");
		System.out.println("5. Terminar");
		System.out.print(">> ");
		return scN.nextInt();
	}

	static void capturar_datos() {
		int si=0;
		System.out.println("Introduce informacion del estudiante");
		if(x>0){
			do{
				System.out.print("Matricula: ");
				int matr = scN.nextInt();
				for (i=0; i<x; i++) {
					if (matr == con.getMtricula()) {
						System.out.println("esta matricula ya existe.");
					}
					else{
						si=1;
					}
				}
		    }while(si!=1);
		}
		else{
			System.out.print("Matricula: ");
			int matr = scN.nextInt();
		}
		si=0;
		System.out.print("Nombre: ");
		String nom = scC.nextLine();
		System.out.print("Numero de asignaturas cursadas: ");
		int n = scN.nextInt();
		String[] mat = new String[n];
		int[] calmat = new int[n];
		for (int i = 0; i < n; i++) {
			do{
				System.out.print("Nombre de la materia [" + (i + 1) + "]: ");
			    mat[i] = scC.nextLine();
				for (int j=0; j<n; j++) {
					if (mat[i] == con[i].getMaterias()) {
						System.out.println("esta materia ya existe.");
					}
					else{
						si=1;
					}
				}
		    }while(si!=1);
		    si=0;
		    do{
		    	System.out.print("Calificacion de la materia " + mat[i] + ": ");
			    calmat[i] = scN.nextInt();
			    if (calmat[i] > 0) {
			    	if (calmat[i] < 101) {
			    		si=1;
			    	}
			    	else{
			    		System.out.println("la calificasion es mayor de 100.");
			    	}
			    }
			    else{
			    	System.out.println("la calificasion es menor de 0.");
			    }
		    }while(si!=1);
		}
		controller.add(matr, nom, mat, calmat);
		x=x+1;
	}

	static void mostrar_materias_na() {
		System.out.println("Introduce informacion del estudiante");
		System.out.print("Matricula: ");
		int matr = scN.nextInt();
		String resp = controller.getMaterias(matr);
		if (resp == null) {
			System.out.println("no existe esta matricula");
		} else {
			System.out.println(resp);
		}
	}

	static void modificar_calificacion() {
		System.out.println("Introduce informacion del estudiante");
		System.out.print("Matricula: ");
		int matr = scN.nextInt();
		System.out.println("Que materia modificaras? ");
		System.out.print(">> ");
		String matbuscar = scC.nextLine();
		System.out.print("Nueva calificacion de la materia: ");
		int calnueva = scN.nextInt();
		String resp = controller.changeCalificacion(matr, matbuscar, calnueva);
		if (resp == null) {
			System.out.println("no existe esta matricula");
		} else {
			System.out.println(resp);
		}
	}
	
	static void mostrar_datos() {
		String informacion = controller.show();
		System.out.println(informacion);
	}
}