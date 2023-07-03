package main;
import controlador.Metodos;
import java.util.Scanner;

public class Main {
	
	static Metodos controller;
	static Scanner scN;
	static Scanner scC;

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
				buscar_auto();
				break;
				case 3:
				renta_auto();
				break;
				case 4:
				devolver_auto();
				break;
				case 5:
				mostrar_inventario()
				break;
				case 6:
				System.out.println("adios.");
				System.exit(0);
				break;
				default:
				System.out.println("ERROR");
				break;
			}
		} while (true);
	}
	
	static int menu() {
		System.out.println("1. alta de auto.");
		System.out.println("2. buacar un auto.");
		System.out.println("3. rentar un auto.");
		System.out.println("4. devolucion de un auto.");
		System.out.println("5. mostrar inventario.");
		System.out.println("6.salir. ");
		System.out.print(">> ");
		return scN.nextInt();
	}

	static void capturar_datos() {
		System.out.println("registro de datos.");
		System.out.print("numero de control: ");
		int con = scN.nextInt();
		System.out.print("modelo: ");
		String mod = scC.nextLine();
		System.out.print("anyo: ");
		int anyo = scN.nextInt();
		System.out.print("color: ");
		String col = scC.nextLine();
		System.out.print("precio dia: ");
		double pre = scN.nextDouble();
		boolean ren = null;
		controller.add(con, mod, anyo, col, pre, ren);
	}

	static void buscar_auto(){
		System.out.println("Introduce el numero de control.");
		System.out.println("control: ");
		int con = scN.nextInt();
		String resp = controller.BuscarAuto(con);
		if (resp == null) {
			System.out.println("no existe este auto");
		} else {
			System.out.println(resp);
		}
	}

	static void renta_auto(){
		String informacion = controller.autos_renta();
		System.out.println(informacion);
		System.out.println("Introduce los datos.");
		System.out.println("numero control: ");
		int con = scN.nextInt();
		System.out.println("dias a rentar: ");
		double dias = scN.nextDouble();
		String resp = controller.Renta(con, dias);
		if (resp == null) {
			System.out.println("no existe este auto");
		} else {
			System.out.println(resp);
		}
	}
	
	static void devolver_auto(){
		System.out.println("Introduce los datos.");
		System.out.println("numero control: ");
		int con = scN.nextInt();
		String resp = controller.Devolver(con);
		if (resp == null) {
			System.out.println("no existe este auto");
		} else {
			System.out.println(resp);
		}
	}

	static void mostrar_inventario(){
		String informacion = controller.show();
		System.out.println(informacion);
	}
}