@author Alfredo Abad
import java.util.Scanner;
public class estetica {

    static Perro perro;
    static Expediente expediente;     
    static Scanner inN;
    static Scanner inC;
    static int i;

    public static void main(String[] args) {
        Perro[] perro = new Perro[100];
        Expediente[] expediente = new Expediente[100];
        inN = new Scanner(System.in);
        inC = new Scanner(System.in);
        int menu;
        do{
        	System.out.println("1.alta de un cliente.");
            System.out.println("2.prestar servicio el cliente.");
            System.out.println("3.listar cliente.");
        	System.out.println("4.mostrar el cliente que mas nos ha visitado.");
            System.out.println("5.mostrar los clientes con corte de pelo.");
            System.out.println("6.salir.");
        	System.out.print(">> ");
        	menu = inN.nextInt();
        	switch(menu){
        		case 1:
                    alta_cliente();
        			break;
                case 2:
                    sevicio_cliente();
                    break;
                case 3:
                    listar_clientes();
                    break;
        		case 4:
                    cliente_visitas();
        		    break;
                case 5:
                    clientes_corte();
                    break;
                case 6:
                    System.out.println("adios.");
                    break;
        		default:  
        			System.out.println("Error");
        		    break;       	
        	}
        }while(menu!=6);
    }
    
    static void alta_cliente(){
        int id,peso,edad;
        String nom,raza;
        id=i+100;
        System.out.println("ingrese el nombre:");
        nom=scC.nextline();
        System.out.println("ingrese la raza:");
        raza=scC.nextline();
        System.out.println("ingrese el peso:");
        peso=scN.nextInt();
        System.out.println("ingrese la edad:");
        edad=scN.nextInt();
        perro[i].Perro(id, nom, raza, peso, edad);
        expediente[i].Expediente(id);    
        }

    static void sevicio_cliente(){
        int x,id,opc;
        System.out.println("cual es su id:");
        id=scN.nextInt();
        for (x=0; x<i; x++) {
            if (id == perro[x].getId()) {
              System.out.println("cual servicio quiere.");
              System.out.println("1.corte de pelo.");
              System.out.println("2.banyo.");
              System.out.println("3.banyo con corte de pelo.");   
              System.out.println(">>");
              opc=scN.nextInt();
              switch(opc){
                case 1:
                expediente[x].setUltimaServicio("corte de pelo");
                break;
                case 2:
                expediente[x].setUltimaServicio("banyo");
                break;
                case 3:
                expediente[x].setUltimaServicio("banyo con corte de pelo");
                break;
                default:
                System.out.println("ERROR");
                break;
              }
              expediente[x].setNumVisitas(expediente[x].getNumVisitas()+1);
            }
        }

    }

    static void listar_clientes(){
        for (int x=0; x<i; x++) {
            System,out.println(perro[x].toString());
            System.out.println("---------------------------------------------");
        }
    }

    static void cliente_visitas(){
        int mas;
        for (int x=0; x<i; x++) {
            expediente[x].getNumVisitas()>expediente[x+1].getNumVisitas();
            mas=x;
        }
        System,out.println(perro[mas].toString());
    }
    
    static void clientes_corte(){
        for (int x=0; x<i; x++) {
             if (expediente[x].getUltimoServicio()=="corte de pelo") {
                 System,out.println(perro[x].toString()); 
             }
         } 
    }

}