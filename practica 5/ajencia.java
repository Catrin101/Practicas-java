@author Alfredo Abad
import java.util.Scanner;
public class Ajencia {

    static Automovil Automovil;     
    static Scanner inN;
    static Scanner inC;
    static boolean alta; 
    static int i=4;
    
    public static void main(String[] args) {
        Automovil automovil[] = new Automovil[100];
        automovil[0].Automovil(1,"fort fiesta",2004,"negro",12,3500.0);
        automovil[1].Automovil(2,"jeep",2006,"blanco",20,6800.0);
        automovil[2].Automovil(3,"honda city",2012,"rojo",7,4400.0);
        automovil[3].Automovil(4,"toyota corolla",2002,"gris",22,2600.0);
        automovil[4].Automovil(5,"fort scape",2008,"naranja",4,3200.0);
        inN = new Scanner(System.in);
        inC = new Scanner(System.in);
        int menu,menu2;
        do{
        	System.out.println("1. alta de un auto.");
            System.out.println("2. venta de un auto.");
            System.out.println("3. mostrar inventario.");
        	System.out.println("4. salir.");
        	System.out.print(">> ");
        	menu = inN.nextInt();

        	switch(menu){
        		case 1:
        			alta_auto();                    
        			break;
                case 2:
                    venta_auto();
                    break;
                case 3:
                    do{
                        switch(menu2){
                            case 1:
                            Completa();
                            break;
                            case 2:
                            anyo();
                            break;
                            case 3:
                            color();
                            break;
                            case 4:
                            System.out.println("adios.");
                            break;
                            default:
                            System.out.println("ERROR.");
                            break;
                        }
                    }while(menu2!=4);
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
    
    static void alta_auto(){
        i=i+;
        int con,anyo,can;
        String mod,col;
        double pre;
        con=i+1;
        System.out.println("ingrese el modelo:");
        mod=scC.nextline();
        System.out.println("ingrese el anyo:");
        anyo=scN.nextInt();
        System.out.println("ingrese el color:");
        col=scC.nextline();
        System.out.println("ingrese la cantidad:");
        can=scN.nextInt();
        System.out.println("ingrese el precio:");
        pre=scN.nextdouble();
        automovil[i].Automovil(con, mod, anyo, col, can, pre);    
        }

    static void venta_auto(){
        int x;
        for (x=0; x<i; x++) {
            System.out.println(automovil[x].toString());
        }
        System.out.println("diga el control del altu que quiere comprar:");
        int po=scN.nextInt();
        for (x=po; x<i; x++) {
            automovil[x].Automovil()=automovil[x+1].Automovil();
        }
    }

    static void Completa(){
        for (int x=0; x<i; x++) {
            System,out.println(estudiante[x].toString());
        }
    }

    static void anyo(){
        int bus;
        System.out.println("que anyo esta buscando:");
        bus = scN.nextInt();
        for (int x=0; x<i; x++) {
            if (bus == automovil[x].getAnyo()) {
                System.out.println(automovil[x].toString());
            }
        }
    }
    
    static void color(){
        String bus;
        System.out.println("que color esta buscando:");
        bus = scC.nextline();
        for (int x=0; x<i; x++) {
            if (bus == automovil[x].getColores()) {
                System.out.println(automovil[x].toString());
            }
        }   
    }

}