@author Alfredo Abad
public class Estudiante {
    private int matricula;
    private String nombre;
    private int semestre;
    private int[] carga[2];
    
    public Estudiante(){
        this(0,"no hay",0,0);
    }
    
    public void Estudiante(int matricula, String nombre, int semestre, int[] carga[2]){
        this.matricula = matricula;
        this.nombre = nombre;
        this.semestre = semestre;
        this.carga = carga;
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(itn semestre) {
        this.semestre = semestre;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int[] carga) {
        this.carga = carga;
    }
    
    public String toString(){
        return "matricula: " + getMatricula() +
               "\nnombre: " + getNombre() +
               "\nsemestre: " + getSemestre() +
               "\ncaarga: " + getCarga(); 
    }
}