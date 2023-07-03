@author Alfredo Abad
import java.util.Scanner;
public class consulta_empleado {

    static Empleado Empleado;     
    static Scanner inN;
    static Scanner inC;
    static boolean alta; 
    
    public static void main(String[] args) {
        empleado = new Empleado();
        inN = new Scanner(System.in);
        inC = new Scanner(System.in);
        alta = false;
        int menu;
        do{
        	System.out.println("1. dar de alta empleado");
            System.out.println("2. incrementar sueldo");
            System.out.println("3. modificar datos del empleado");
        	System.out.println("4. mostrar datos del empleado");
            System.out.println("5. salir");
        	System.out.print(">> ");
        	menu = inN.nextInt();

        	switch(menu){
        		case 1:
        			alta_empleado();                    
        			break;
                case 2:
                    if(alta){
                        incrementar_sueldo();
                    } 
                    break;
                case 3:
                    if(alta){
                        modificar_datos();
                    } 
                    break;
                case 4:
                    if(alta){
                        mostrar_datos();
                    } 
                    break;
        		case 5:
        		    System.out.println("adios.");
        		    break;
        		default:  
        			System.out.println("Error");
        		    break;       	
        	}
        }while(menu!=5);
    }
    
    static void alta_empleado(){
        alta = true;
        int con = 0,edad = 0,anti = 0;
        double suel,por;
        String nom = " ";

        System.out.println("ingresar datos.");
        do{
            System.out.println("nombre: ");
            nom = scC.nextLine();
            if (nom != " ") {
                con=1;  
            }
        }while(con != 1);
        con=0;
        do{
            System.out.println("edad: ");
            edad = scN.nextInt();
            if (edad >= 18) {
                con=con+1;   
            }
        }while(con != 1);
        con=0;
            System.out.println("sueldo: ");
            suel = scN.nextDouble();
            if (anti < 10) {
                por =5.0*suel;
                por = por/100.0;
                suel =suel+por;
            } 
            else{
              if (anti < 26) {
                por =8.5*suel;
                por = por/100.0;
                suel =suel+por
              }  
              else{
                if (anti > 25) {
                    por =12.0*suel;
                    por = por/100.0;
                    suel =suel+por
                }
              }
            }
        do{
            System.out.println("antiguedad: ");
            anti = scN.nextInt();
            if (anti <= edad) {
                    con=con+1;
            }
        }while(con != 1);
        empleado.Emlpeado(nom, edad, suel, anti);
    }

    static void incrementar_sueldo(){
        String.out.println("ingrese nuevo sueldo: ");
        double mod = scN.nextDouble();
        empleado.setSueldo(mod);
    }

    static void modificar_datos(){
        int con;
        int edada = empleado.getEdad();
        int antia = empleado.getAntiguedad();
        do{
            String.out.println("modificar datos");
            String.out.println("canvie la edad: ");
            int edad = scN.nextInt();
            if (edad > edada) {
                con=1;
            }
        }while(con != 1);
        empleado.setEdad(edad);
        con=0;
        do{
            String.out.println("canvie la antiguedad: ");
            int anti = scN.nextInt();
            if (anti > antia) {
                con=con+1;
            }
        }while(con != 1);
        empleado.setAntiguedad(anti);
    }
    
    static void mostrar_datos(){
        String.out.println("....................................");
        System.out.println(cuenta.toString());
    }
}