package modelo;
public class Automovil {
	
	private int control;
	private String modelo;
	private int anyo;
	private String color;
	private double precioDia;
	private boolean rentado;
	
	public Automovil(int control, String modelo, int anyo, String color, double precioDia, boolean rentado) {
		this.control = control;
		this.modelo = modelo;
		this.anyo = anyo;
		this.color = color;
		this.precioDia = precioDia;
		this.rentado = rentado;
	}
	
	public int getControl() {
		return control;
	}

	public void setControl(int control) {
		this.control = control;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}

	public boolean getRentado() {
		return rentado;
	}

	public void setRentado(boolean rentado) {
		this.rentado = rentado;
	}

	@Override

	public String toString() {
		String texto = "Datos del Automovil\n"
		+ "\ncontrol. " + control
		+ "\nmodelo. " + modelo
		+ "\nanyo. " + anyo
		+ "\ncolor. " + color
		+ "\nprecioDia. " + precioDia
		+ "\nrentado. " + rentado ;
		return texto;
	}
}