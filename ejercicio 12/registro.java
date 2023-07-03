@author Alfredo Abad
import java.util.Scanner;
public class Registro {

    static Estudiante Estudiante;
    static Materia Materia;     
    static Scanner inN;
    static Scanner inC;
    static boolean alta; 
    
    public static void main(String[] args) {
        Estudiante estudiante[] = new Estudiante[10];
        Materi materia[] = new Materi[4];
        materia[0].Materia(001,"matematicas",6);
        materia[1].Materia(002,"ingles",8);
        materia[2].Materia(003,"ficica",7);
        materia[3].Materia(004,"literatura",4);
        inN = new Scanner(System.in);
        inC = new Scanner(System.in);
        int menu;
        do{
        	System.out.println("1. alta de estudiante.");
            System.out.println("2. mastrar datos de un alumno.");
            System.out.println("3. listar estudiantes.");
        	System.out.println("4. salir..");
        	System.out.print(">> ");
        	menu = inN.nextInt();

        	switch(menu){
        		case 1:
        			alta_estudiante();                    
        			break;
                case 2:
                    mostrar_datos_alumno();
                    break;
                case 3:
                    listar_estudiantes();
                    break;
        		case 4:
        		    System.out.println("adios.");
        		    break;
        		default:  
        			System.out.println("Error");
        		    break;       	
        	}
        }while(menu!=4);
    }
    
    static void alta_estudiante(){
        int matri,sem,i,x;
        int car[] = new int[2]
        String nom;
        for (i=0; i<10; i++) {
            matri = i+100;
            System.out.println("ingrese el nombre:");
            nom = snC.nextline();
            System.out.println("ingrese el semestres que este cursando:");
            sem = scN.nextInt();
            for (x=0; x<2; x++) {
                System.out.println("aliga una materia:");
                for (int y=4; y<4; y++) {
                    System.out.println(materia[y].toString());
                }
                System.out.println(">> ");
                car[x] = scN.nextInt();    
            }
            }
            estudiante[i].Estudiante(matri, nom, sem, car[x]);    
        }

    static void mostrar_datos_alumno(){
        String bus;
        System.out.println("que alumno esta buscando:");
        bus = scC.nextline();
        for (int i=0; i<10; i++) {
            if (bus == estudiante[i].getnombre()) {
                System.out.println(estudiante[i].toString());
            }
        }
    }
    
    static void listar_estudiantes(){
        for (int i=0; i<10; i++) {
            System,out.println(estudiante[i].toString());
        }
    }

}