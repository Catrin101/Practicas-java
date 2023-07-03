@author Alfredo Abad
public class Expediente {
    private int id;
    private int numVisitas;
    private String ultimoServicio;
    
    public Expediente(){
        this(0,0,"null");
    }
    
    public void Expediente(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumVisitas() {
        return numVisitas;
    }

    public void setNumVisitas(int numVisitas) {
        this.numVisitas = numVisitas;
    }

    public String getUltimoServicio() {
        return ultimoServicio;
    }

    public void setUltimoServicio(String ultimoServicio) {
        this.ultimoServicio = ultimoServicio;
    }
}