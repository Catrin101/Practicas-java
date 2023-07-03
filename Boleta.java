@author Alfredo Abad
import java.util.Scanner;
public class Boleta{

	static Estudiante Estudiente;
	static Scanner scN;
	static Scanner scC;
    static int n;

	public static void main(String[] args) {
		estudiante = new Estudiante();
	    scN = new Scanner(System.in);
		scC = new Scanner(System.in);
        boolean uno = false;
        int opc;
        
        do{
        	System.out.println("1. alta de datos.");
        	System.out.println("2. mostrar las no aprobadas.");
            System.out.println("3. modificar calificasion.");
            System.out.println("4. informacion del estudiante.");
        	System.out.println("5. salir");
        	System.out.print(">> ");
        	ocp = scN.nextInt();

        	switch(opc){
        		case 1:
        			alta(); 
                    uno = true;
        			break;
        		case 2: 
                    if(uno){
                        reprobadas();
                    } else {
                        System.out.println("No has captudo");
                    }
        			break;
                case 3:
                    if(uno){
                        control_peso();
                    } else {
                        System.out.println("No has captudo");
                    }
                    break;
                case 4:
                    if(uno){
                        mostrar_datos();
                    } else {
                        System.out.println("No has captudo");
                    }
                    break;
                case 5:
                    System.out.println("adios");
                    break;  
                default:      
        			System.out.println("ERROR");
        		    break;       	
        	}
        }while(opc!=5);
	}

	static void alta(){
		System.out.println("introduse la matricula");
		String matr = scN.nextLine();
		System.out.println("introduse el nombre");
		double nom = scC.nextDouble();
		System.out.println("cuantas materias tiene.");
		n = scN.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("ingrese la materia"+i+":");
            String mate = scC.nextLine();
            System.out.println("ingrese la calificasion:");
            double cal = scC.nextLine();
        }
		estudiante.ingresarDatos(matr, nom, mate,cal);
	}

	static void reprobadas(){
              String[] materi = estudiante.getMaterias();
              double[] cali = estudiante.getCalMaterias();
              for (int i=0; i<n; i++) {
                  if (cali < 5.0) {
                      String.out.println(materi+":"+cali+". repobada");
                  }
              }
        }
        
        static void control_peso(){
            int x;
            System.out.print("cual es la materia que quiere canviar:");
            double con = scN.nextDouble();
            String[] mat = estudiante.getMaterias();
            double[] mod = estudiante.getCalMaterias();
            for (int i=0; i<n; i++) {
                if (mat[i] == con) {
                    String.out.println("ingrese la nueva calificasion:");
                    mad[i] =scC.nextDouble();
                    x=i;
                }
            }
            estudiante.setCalMateriaa(mod[x]);
        }
        
	static void mostrar_datos() {
		String datos = estudiante.mostrarDatos();
		System.out.println(datos);
	}
}