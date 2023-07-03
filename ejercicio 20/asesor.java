package modelo;

@author CubiculoB

public class Asesor extends Universitario {

    protected String[] horario 
    
    public Asesor(String horario, String nombre) {
        super(nombre);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }  
}