@author Alfredo Abad
public class Estudiante{
    
    private int matricula;
	private String nombre;
    private String[] materia;
	private double[] calMaterias;
    
    public void ingresarDatos(int matricula,String nombre,String[] materia,double[] calMaterias){
    	this.matricula = matricula;
    	this.nombre = nombre;
    	this.materia = materia;
        this.calMaterias = calMaterias;
    }	
    
    public void setCalMaterias(double[] calMaterias){
    	this.calMaterias = calMaterias;
    }	
    
    public void getMaterias() {
        return materia;
    }
    
    public void getCalMaterias() {
        return calMaterias;
    }
    
    public String mostrarDatos(){
        String i;
        String texto = "Datos del estudiante\n" +
               "matricula ="+matricula+
    	       "\nnombre = " + nombre;
        for(i : materia){
            texto+= "\n" + i + calMaterias[i]; 
        }
        return texto; 
    }

}