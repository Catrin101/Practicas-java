package controlador;
import java.util.ArrayList;
import modelo.Estudiante;

public class Metodos {
	
	ArrayList<Estudiante> array;
	
	public Metodos() {
		array = new ArrayList<>();
	}

	public void add(int matricula, String nombre, String[] materias, int[] calMaterias) {
		Estudiante est = new Estudiante(matricula, nombre, materias, calMaterias);
		array.add(est);
	}

	public String getMaterias(int matricula) {
		String materias = null;
		for (Estudiante est : array) {
			if (est.getMatricula() == matricula) {
				int[] calmat = est.getCalMaterias();
				String[] mat = est.getMaterias();
				materias = "Materias no aprobadas\n";
				boolean na = false;
				for (int i = 0; i < calmat.length; i++) {
					if (calmat[i] < 60) {
						na = true;
						materias += mat[i] + '\n';
					}
				}
				if (!na) {
					materias = "Todas sus materias estan aprobadas";
				}
			}
		}
		return materias;
	}

	public String changeCalificacion(int matricula, String matbuscar, int calificacion) {
		String info = null;
		for (Estudiante est : array) {
			if (est.getMatricula() == matricula) {
				int[] calmat = est.getCalMaterias();
				String[] mat = est.getMaterias();
				boolean enc = false;
				for (int i = 0; i < calmat.length; i++) {
					if (mat[i].equalsIgnoreCase(matbuscar)) {
						enc = true;
						calmat[i] = calificacion;
						break;
					}
				}
				if (enc) {
					est.setCalMaterias(calmat);
					info = "calificacion modificada";
				} else {
					info = "no tiene esa materia";
				}
			}
		}
		return info;
	} 

	public String show() {
		String info = "";
		for (Estudiante est : array) {
			info += est.toString() + '\n';
		}
		return info;
	}
}