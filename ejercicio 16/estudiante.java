package modelo;
public class Estudiante {
	
	private int matricula;
	private String nombre;
	private String[] materias;
	private int[] calMaterias;
	
	public Estudiante(int matricula, String nombre, String[] materias, int[] calMaterias) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.materias = materias;
		this.calMaterias = calMaterias;
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

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	public int[] getCalMaterias() {
		return calMaterias;
	}

	public void setCalMaterias(int[] calMaterias) {
		this.calMaterias = calMaterias;
	}

	@Override

	public String toString() {
		String texto = "Datos del estudiante\n"
		+ "matricula = " + matricula
		+ "\nnombre = " + nombre 
		+ "\nmateria\tcalificacion\n";
		for (int i = 0; i < materias.length; i++) {
			texto += materias[i] + "\t" + calMaterias[i] + '\n';;
		}
		return texto;
	}
}
