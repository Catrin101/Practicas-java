import java.util.Scanner;
public class ejercicio3 {

    public static void main(String args[]) {
        int i,y=0,con=0;
        int []matri = new int[10];
        String []nom = new String[10];
        double []prom = new double[10];
        Scanner caracter=new Scanner(System.in);
        Scanner numero=new Scanner(System.in);
        for(i=0; i < 10; i++){
           if(y == 0){
               y++;
               matri[i]=(int)(100+Math.random()*200);
           }else{
               do{
                   matri[i]=(int)(100+Math.random()*200);
               }while(matri[i] != matri[i-1]);
           } 
        }
        for(i=0; i < 10; i++){
            System.out.println("ingrese el nombre del estudiante:");
            nom[i]=caracter.nextLine();
        }
        for(i=0; i < 10; i++){
            prom[i]=(double)(0.0+Math.random()*10.0);
        }
        do{
            System.out.println("1.-listar a los estudiantes.");
            System.out.println("2.-listar por promedio");
            System.out.println("3.-buscar promedio.");
            System.out.println("4.-eliminar estudiante");
            System.out.println("5,-salir");
            con=numero.nextInt();
            switch(con){
                case 1:
                    for(i=0; i < 10;i++){
                        System.out.println("matricula:"+matri[i]+".");
                        System.out.println("nombre:"+nom[i]+".");
                        System.out.println("promedio:"+prom[i]+".");
                    }
                    break;
                case 2:
                    double com;
                    System.out.println("ingrese un promedio para filtrar");
                    com=numero.nextDouble();
                    for(i=0;i < 10;i++){
                        if(prom[i]>=com){
                            System.out.println("matricula:"+matri[i]+".");
                            System.out.println("nombre:"+nom[i]+".");
                            System.out.println("promedio:"+prom[i]+".");
                        }
                    }
                    break;
                case 3:
                    int bus;
                    System.out.println("ingrese la matricula a buscar");
                    bus=numero.nextInt();
                    for(i=0;i < 10;i++){
                        if(matri[i]==bus){
                            System.out.println("matricula:"+matri[i]+".");
                            System.out.println("nombre:"+nom[i]+".");
                            System.out.println("promedio:"+prom[i]+".");
                        }
                    }
                    break;
                case 4:
                    System.out.println("ingrese la matricula a eliminar");
                    bus=numero.nextInt();
                    for(i=0;i < 10;i++){
                        if(matri[i]==bus){
                            matri[i]=0;
                            nom[i]=" ";
                            prom[i]=0.0;
                            System.out.println("estudiante eliminado.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("adios.");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }while(con!=5);
    }
}