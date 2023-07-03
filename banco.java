import java.util.Scanner;

public class Banco {

    static Cuenta cuenta;
    static Cuenta cuenta2;
    static int nmov;     //contador de movimientos
    static Scanner inN;
    static Scanner inC;
    static boolean alta; //bandera para cuenta creada
    
    public static void main(String[] args) {
        cuenta = new Cuenta();
        cuenta2 = new Cuenta();  //instancia de la cuenta
        inN = new Scanner(System.in);
        inC = new Scanner(System.in);
        
        alta = false;
        double retiro;
        int menu;
        do{
        	System.out.println("1. Alta de la cuenta");
        	System.out.println("2. Baja de la cuenta");
            System.out.println("3. Depositos");
            System.out.println("4. Retiros");
        	System.out.println("5. Estado de cuenta");
            System.out.println("6. trasferir dinero");
        	System.out.println("7. Terminar");
        	System.out.print(">> ");
        	menu = inN.nextInt();

        	switch(menu){
        		case 1:
        			alta_cuenta();                    
        			break;
        		case 2: 
                    if(alta){
                        baja_cuenta();
                    }
                    break;
        		case 3:
                    if(alta){
                        deposito_cuenta();
                    } 
        		    break;
                case 4:
                    if(alta){
                        retiro = retiro_cuenta();
                        System.out.println("Cantidad retirada $" + retiro);
                    } 
                    break;
                case 5:
                    if(alta){
                        estado_cuenta();
                    } 
                    break;
                case 6:
                    if(alta){
                        trasferir();
                    }
                    break;
        		case 7:
        		    System.out.println("hasta la vista !!");
        		    break;
        		default:  
        			System.out.println("opcion no valida");
        		    break;       	
        	}
        }while(menu!=7);
        

    }
    
    static void alta_cuenta(){
        alta = true;
        nmov = 0;
        System.out.print("fecha: ");
        String movimiento = inC.nextLine();
        movimiento += "   alta    ";
        System.out.println("Datos de la cuenta");
        System.out.print("Nombre del titular: ");
        String titular = inC.nextLine();
	    System.out.print("Numero de cuenta: ");
	    int numero = inN.nextInt();
	    System.out.print("Deposito inicial s/n: ");
        char sino = inC.nextLine().toLowerCase().charAt(0);
        if(sino == 's') {
            System.out.println("Cantidad: ");
            double cantidad = inN.nextDouble();
            cuenta.inicializar(titular, numero, cantidad);
            movimiento+= " " + cantidad;
        } else {
            cuenta.inicializar(titular, numero);
            movimiento+= "          ";
        }
        movimiento+= " " + cuenta.getCantidad();
        cuenta.setMovimientos(movimiento, nmov++);
        System.out.println("dar de alta la segunda cuenta");
        System.out.print("fecha: ");
        String movimiento = inC.nextLine();
        movimiento += "   alta    ";
        System.out.println("Datos de la cuenta");
        System.out.print("Nombre del titular: ");
        String titular = inC.nextLine();
        System.out.print("Numero de cuenta: ");
        int numero = inN.nextInt();
        System.out.print("Deposito inicial s/n: ");
        char sino = inC.nextLine().toLowerCase().charAt(0);
        if(sino == 's') {
            System.out.println("Cantidad: ");
            double cantidad = inN.nextDouble();
            cuenta2.inicializar(titular, numero, cantidad);
            movimiento+= " " + cantidad;
        } else {
            cuenta2.inicializar(titular, numero);
            movimiento+= "          ";
        }
        movimiento+= " " + cuenta.getCantidad();
        cuenta2.setMovimientos(movimiento, nmov++);
    }
    
    static void baja_cuenta(){
        alta = false;
        System.out.print("fecha: ");
        String movimiento = inC.nextLine();
        movimiento += "   cancelacion        -" + cuenta.getCantidad() + "        0.0";
        if(nmov == 10){
           actualizar_mov();
        } 
        cuenta.setMovimientos(movimiento, nmov++);
        estado_cuenta();
        cuenta.inicializar("", 0);
        nmov = 0;
        System.out.println("dar de baja la segunda cuenta");
        System.out.print("fecha: ");
        String movimiento = inC.nextLine();
        movimiento += "   cancelacion        -" + cuenta2.getCantidad() + "        0.0";
        if(nmov == 10){
           actualizar_mov();
        } 
        cuenta2.setMovimientos(movimiento, nmov++);
        estado_cuenta();
        cuenta2.inicializar("", 0);
        nmov = 0;
    }
    
    static void deposito_cuenta(){
        System.out.println("a que cuenta quiere depocitar 1 o 2:");
        int opc =inN.nextInt();
        if (opc == 1) {
            System.out.print("fecha: ");
            String movimiento = inC.nextLine();
            movimiento += "   deposito    "; 
            System.out.print("Cantidad: ");
            double cantidad = inN.nextDouble();
            cuenta.setCantidad(cuenta.getCantidad() + cantidad);
            movimiento+= " " + cantidad + "      " + cuenta.getCantidad();
            if(nmov == 10){
             actualizar_mov();
            } 
            cuenta.setMovimientos(movimiento, nmov++);
        }
        else{
            System.out.print("fecha: ");
            String movimiento = inC.nextLine();
            movimiento += "   deposito    "; 
            System.out.print("Cantidad: ");
            double cantidad = inN.nextDouble();
            cuenta2.setCantidad(cuenta2.getCantidad() + cantidad);
            movimiento+= " " + cantidad + "      " + cuenta2.getCantidad();
            if(nmov == 10){
             actualizar_mov();
            } 
            cuenta2.setMovimientos(movimiento, nmov++);
        }   
    }
    
    static double retiro_cuenta(){
        System.out.println("a que cuenta quiere retirar 1 o 2:");
        int opc = inN.nextInt();
        if (opc ==1) {
            System.out.print("fecha: ");
            String movimiento = inC.nextLine();
            movimiento += "   retiro    "; 
            System.out.print("Cantidad: ");
            double cantidad = inN.nextDouble();
            if(cuenta.getCantidad() >= cantidad){
             cuenta.setCantidad(cuenta.getCantidad() - cantidad);
             movimiento+= " -" + cantidad + "      " + cuenta.getCantidad();
            if(nmov == 10){
                actualizar_mov();
            } 
            cuenta.setMovimientos(movimiento, nmov++);
            } else {
                System.out.println("Retiro rechazado: saldo insuficiente");
                return 0.0;
            }
            return cantidad;
        }
        else{
            System.out.print("fecha: ");
            String movimiento = inC.nextLine();
            movimiento += "   retiro    "; 
            System.out.print("Cantidad: ");
            double cantidad = inN.nextDouble();
            if(cuenta2.getCantidad() >= cantidad){
             cuenta2.setCantidad(cuenta2.getCantidad() - cantidad);
             movimiento+= " -" + cantidad + "      " + cuenta2.getCantidad();
            if(nmov == 10){
                actualizar_mov();
            } 
            cuenta2.setMovimientos(movimiento, nmov++);
            } else {
                System.out.println("Retiro rechazado: saldo insuficiente");
                return 0.0;
            }
            return cantidad;
        }
    }
    
    static void estado_cuenta(){
        System.out.println("que cuenta quiere ver 1 o 2:");
        int opc = inN.nextInt();
        if (opc == 1) {
            System.out.println(cuenta.mostrar());
            System.out.println("\nFecha      tipo de movimiento        monto          saldo");
            System.out.println("----------------------------------------------------------");
            String[] movimientos = cuenta.getMovimientos();
            for(int i=0; i<nmov; i++){
                System.out.println(movimientos[i]);
            }
        }
        else{
            System.out.println(cuenta2.mostrar());
            System.out.println("\nFecha      tipo de movimiento        monto          saldo");
            System.out.println("----------------------------------------------------------");
            String[] movimientos = cuenta2.getMovimientos();
            for(int i=0; i<nmov; i++){
                System.out.println(movimientos[i]);
            }
        }  
    }
    
    static void actualizar_mov(){
        System.out.println("que cuenta quiere actualizar 1 o 2:");
        int opc = inN.nextInt();
        if (opc == 1) {
            String[] movimientos = cuenta.getMovimientos();
            for(int i=0; i<(movimientos.length - 1); i++){
             movimientos[i] = movimientos[i+1];
            }
            cuenta.setMovimientos(movimientos);
            nmov = 9;
        }
        else{
            String[] movimientos = cuenta2.getMovimientos();
            for(int i=0; i<(movimientos.length - 1); i++){
             movimientos[i] = movimientos[i+1];
            }
            cuenta2.setMovimientos(movimientos);
            nmov = 9;
        } 
    }

    static void trasferir(){
        System.out.println("que cuenta va a depocitar 1 o 2:");
        int opc =inN.nextInt();
        if (opc == 1) {
            System.out.print("fecha: ");
            String movimiento = inC.nextLine();
            movimiento += "   deposito    "; 
            System.out.print("Cantidad: ");
            double cantidad = inN.nextDouble();
            cuenta2.setCantidad(cuenta2.getCantidad() + cantidad);
            movimiento+= " " + cantidad + "      " + cuenta2.getCantidad();
            if(nmov == 10){
             actualizar_mov();
            } 
            cuenta2.setMovimientos(movimiento, nmov++);

            if(cuenta.getCantidad() >= cantidad){
             cuenta.setCantidad(cuenta.getCantidad() - cantidad);
             movimiento+= " -" + cantidad + "      " + cuenta.getCantidad();
            if(nmov == 10){
                actualizar_mov();
            } 
            cuenta.setMovimientos(movimiento, nmov++);
            } else {
                System.out.println("trasferencia rechazado: saldo insuficiente");
                return 0.0;
            }
            return cantidad;
        }
        else{
            System.out.print("fecha: ");
            String movimiento = inC.nextLine();
            movimiento += "   deposito    "; 
            System.out.print("Cantidad: ");
            double cantidad = inN.nextDouble();
            cuenta.setCantidad(cuenta.getCantidad() + cantidad);
            movimiento+= " " + cantidad + "      " + cuenta.getCantidad();
            if(nmov == 10){
             actualizar_mov();
            } 
            cuenta.setMovimientos(movimiento, nmov++);

            if(cuenta2.getCantidad() >= cantidad){
             cuenta2.setCantidad(cuenta2.getCantidad() - cantidad);
             movimiento+= " -" + cantidad + "      " + cuenta2.getCantidad();
            if(nmov == 10){
                actualizar_mov();
            } 
            cuenta2.setMovimientos(movimiento, nmov++);
            } else {
                System.out.println("trasferir rechazado: saldo insuficiente");
                return 0.0;
            }
            return cantidad;
        } 
    }
}