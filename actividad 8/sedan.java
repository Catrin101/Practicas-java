package modelo;

@author CubiculoB

public class sedan extends Veiculo {

    protected boolean quemacoco;
    protected String transmision;

    public Maestro(int control, String modelo, int anyo, String color, double precio, boolean quemacoco, String transmision) {
        super(control);
        super(modelo);
        super(anyo);
        super(color);
        super(precio);
        this.quemacoco = quemacoco;
        this.transmision = transmision;
    }

    public boolean getQuemacoco() {
        return quemacoco;
    }

    public void setQemacoco(boolean quemacoco) {
        this.quemacoco = quemacoco;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String toString() {
        String texto = "Datos del veiculo\n"
        + "control: " + control  
        + "\nmodelo: " + modelo
        + "\nanyo: " + anyo
        + "\ncolor: " + color
        + "\nprecio: " + precio
        + "\nquemacocos: " + quemacoco
        + "\ntrasmision: " + transmision;
        return texto;
    }  
}