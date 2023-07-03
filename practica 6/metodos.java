package controlador;
import java.util.ArrayList;
import modelo.Automovil;

public class Metodos {
	
	ArrayList<Automovil> array;
	
	public Metodos() {
		array = new ArrayList<>();
	}

	public void add(int control, String modelo, int anyo, String color, double precioDia, boolean rentado) {
		Automovil est = new Automovil(control, modelo, anyo, color, precioDia, rentado);
		array.add(est);
	}

	public String getBuscarAuto(int control) {
		String auto = null;
		for (Automovil a : array) {
			if (a.getControl() == control) {
				System.out.println(a.toString());
			}
		}
		return auto;
	}

	public String getRenta(int control, double precioDia) {
		String auto = null;
		for (Automovil a : array) {
			if (a.getControl() == control) {
				a.rentado() = true;
				System.out.println("el auto se rento.");
			}
		}
		return auto;
	}

	public String autos_renta() {
		String info = "";
		for (Automovil est : array) {
			if (est.rentado() == null) {
				info += est.toString() + '\n';
			}	
		}
		return info;
	}

	public String getDevolver(int control) {
		String auto = null;
		for (Automovil a : array) {
			if (a.getControl() == control) {
				a.rentado() = null;
				System.out.println("el auto fue devuelto.");
			}
		}
		return auto;
	}

	public String show() {
		String info = "";
		for (Automovil est : array) {
			info += est.toString() + '\n';
		}
		return info;
	}
}