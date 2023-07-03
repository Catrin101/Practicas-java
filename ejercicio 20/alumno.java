package modelo;

@author CubiculoB

public class Alumno extends Universitario {

    private String matricula;
    private int semestre;
  
    public Alumno(String matricula, String nombre, int semestre) {
        super(nombre); 
        this.matricula = matricula;
        this.semestre = semestre;
        //super.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
        
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
  

}