@author Alfredo Abad
public class Perro {
    private int id;
    private String nombre;
    private String raza;
    private int peso;
    private int edad;
    
    public Perro(){
        this(0,,"null","null",0,0);
    }
    
    public void Perro(int id, String nombre, String raza, int peso, int edad){
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
        ;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String toString(){
        return "control: " + getId() +
               "\nmodelo: " + getNombre() +
               "\nanyo: " + getRaza() +
               "\ncolores: " + getPeso() +
               "\nprecio: " + getEdad(); 
    }
}