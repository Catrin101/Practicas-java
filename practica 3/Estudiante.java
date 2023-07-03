@author Alfredo Abad
public class Estudiante{
    
    private int matricula;
	private String nombre;
	private double promedio;
    
    public void ingresarDatos(int matricula,String nombre,double promedio){
    	this.matricula = matricula;
    	this.nombre = nombre;
        this.promedio = promedio;
    }	
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public String mostrarDatos(){
        String texto = "Datos del estudiante\n" +
               "matricula ="+matricula+
    	       "\nnombre = " + nombre+
               "\npromedio ="+promedio;
        return texto; 
    }

}