@author Alfredo Abad
public class Materia {
    private int codigo;
    private String nombre;
    private int creditos;
    
    public Materia(){
        this(0,"no hay",0);
    }
    
    public void Materia(int codigo, String nombre, int creditos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public String toString(){
        return "codigo: " + getCodigo() +
               "\nnombre: " + getNombre() +
               "\ncreditos: " + getCreditos(); 
    }
}