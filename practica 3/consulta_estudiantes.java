@author Alfredo Abad
import java.util.Scanner;
public class Boleta{

	static Estudiante estudiente1;
    static Estudiante estudiente2;
    static Estudiante estudiente3;
	static Scanner scN;
	static Scanner scC;
    static int n;

	public static void main(String[] args) {
		estudiante1 = new Estudiante(101,"jose gonsales",7.4);
        estudiante2 = new Estudiante(102,"maria ernandes",8.9);
        estudiante3 = new Estudiante(103,"joselito martines",5.1);
	    scN = new Scanner(System.in);
		scC = new Scanner(System.in);
        int opc;
        
        do{
        	System.out.println("1. listar por matriculas.");
        	System.out.println("2. listar por promedio dado.");
            System.out.println("3. listar por matricula dada");
        	System.out.println("4. salir");
        	System.out.print(">> ");
        	ocp = scN.nextInt();

        	switch(opc){
        		case 1:
                    listar_alumnos();
        			break;
        		case 2: 
                    listar_alumnos(promedio);
        			break;
                case 3:
                    listar_alumnos(matricula);
                    break;
                case 4:
                    System.out.println("adios");
                    break;  
                default:      
        			System.out.println("ERROR");
        		    break;       	
        	}
        }while(opc!=4);
	}

	static void listar_alumnos(){
        String datos1 = estudiante1.mostrarDatos();
        String datos2 = estudiante2.mostrarDatos();
        String datos3 = estudiante3.mostrarDatos();
        System.out.println(dotos1);
        System.out.println(dotos2);
        System.out.println(dotos2);
    }

    static void listar_alumnos(double promedio){
        int opc,i;
        String datos1 = estudiante1.mostrarDatos();
        String datos2 = estudiante2.mostrarDatos();
        String datos3 = estudiante3.mostrarDatos();
        double prom1 = estudiante1.getPromedio();
        double prom1 = estudiante1.getPromedio();
        double prom2 = estudiante2.getPromedio();
        double prom3 = estudiante3.getPromedio();
        System.out.println("ingrese el promedio buscado:");
        opc = snN.nextdouble();
        if (prom1 > opc) {
            System.out.println(dotos1);
        }
        if (prom2 > opc) {
            System.out.println(dotos2);
        }
        if (prom3 > opc) {
            System.out.println(dotos3);
        }
    }

    static void listar_alumnos(int matricula){
        int opc,i;
        String datos1 = estudiante1.mostrarDatos();
        String datos2 = estudiante2.mostrarDatos();
        String datos3 = estudiante3.mostrarDatos();
        double matr1 = estudiante1.getMatricula();
        double matr1 = estudiante1.getMatricula();
        double matr2 = estudiante2.getMatricula();
        double matr3 = estudiante3.getMatricula();
        System.out.println("ingrese el promedio buscado:");
        opc = snN.nextint();
        if (matr1 == opc) {
            System.out.println(dotos1);
        }
        if (matr2 == opc) {
            System.out.println(dotos2);
        }
        if (matr3 == opc) {
            System.out.println(dotos3);
        }   
    }
}