package controlador;

import java.util.ArrayList;
import modelo.Alumno;
import modelo.Curso;
import modelo.Grupo;
import modelo.Maestro;
import modelo.Universitario;

@author CubiculoB

public class Metodos {

    private ArrayList<Universitario> universitarioArray;
    private ArrayList<Curso> cursoArray;
    private ArrayList<Grupo> grupoArray;
    
    public Metodos(){
        universitarioArray = new ArrayList<>();
        cursoArray = new ArrayList<>();
        grupoArray= new ArrayList<>();
    }

    public void registrarAlumno(String matricula, String nombre, int semestre) {
        //Creamos un objeto y lo agregamos a la lista
        Alumno a = new Alumno(matricula, nombre, semestre);
        universitarioArray.add(a);
    }

    public void registrarMaestro(int noEmpleado, String nombre) {
        //Agregamos un objeto sin nombre a la lista
        universitarioArray.add(new Maestro(noEmpleado, nombre));
    }

    public void registrarAsesor(String horario, String nombre) {
        //Agregamos un objeto sin nombre a la lista
        universitarioArray.add(new Asesor(horario, nombre));
    }

    public void registrarCurso(int clave, String nombre, int creditos, int[] grupos, int[] capacidades) {
        cursoArray.add(new Curso(clave, nombre, creditos));
        for (int i = 0; i < grupos.length; i++) {
            grupoArray.add(new Grupo(grupos[i], clave, capacidades[i]));
        }
    }

    public boolean agregarCarga(String matricula, int clave, int grupo) {
        //Haciendo una copia del elemento de la lista a traves de una estructura for each
        for (Universitario universitario : universitarioArray) {
            if (universitario instanceof Alumno && ((Alumno) universitario).getMatricula().equals(matricula)) {
                for (Grupo g : grupoArray) {
                    if (g.getClave() == clave && g.getNum() == grupo && g.getCapacidad() > 0) {
                        universitario.addCarga(g);
                        g.setCapacidad(g.getCapacidad() - 1);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean agregarCursos(int noEmpleado, int clave, int grupo) {
        //Inicializamos el indice de la posicion de los elementos en el maestroArray
        for (Universitario universitario : universitarioArray) {
            if (universitario instanceof Maestro && ((Maestro) universitario).getNoEmpleado() == noEmpleado) {
                for (Grupo g : grupoArray) {
                    if (g.getClave() == clave && g.getNum() == grupo) {
                        universitario.addCarga(g);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean agregarAsesoria(String horario, int clave) {
        for (Universitario universitario : universitarioArray) {
            if (universitario instanceof Asesor && ((Asesor) universitario).getHorario() == horario) {
                for (Clave c : claveArray) {
                    if (c.getClave() == clave && c.getClave() == clave) {
                        universitario.addCarga(c);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String mostrarCarga(String matricula) {
        String carga = "";
        for (Universitario universitario : universitarioArray) {
            if (universitario instanceof Alumno && ((Alumno) universitario).getMatricula().equals(matricula)) {
                ArrayList<Grupo> grupos = ((Alumno) universitario).getCarga();
                for (Grupo g : grupos) {
                    for (Curso curso : cursoArray) {
                        if (g.getClave() == curso.getClave()) {
                            carga += curso + " grupo: " + g.getNum() + '\n';
                        }
                    }
                }
            }
        }
        return carga;
    }

    public String mostrarCursos(int noEmpleado) {
        String cursos_maestro = "";
        for (Universitario universitario : universitarioArray) {
             if (universitario instanceof Maestro && ((Maestro) universitario).getNoEmpleado() == noEmpleado) {
                ArrayList<Grupo> grupos = ((Maestro) universitario).getCarga();
                for (Grupo g : grupos) {
                    for (Curso curso : cursoArray) {
                        if (g.getClave() == curso.getClave()) {
                            cursos_maestro += curso + " grupo: " + g.getNum() + '\n';
                        }
                    }
                }
            }
        }
        return cursos_maestro;
    }

    public String mostrarAsesorias(String horario) {
        String asesorias_asesor = "";
        for (Universitario universitario : universitarioArray) {
             if (universitario instanceof Asesor && ((Asesor) universitario).getHorario() == horario) {
                ArrayList<Clave> clave = ((Asesor) universitario).getCarga();
                for (Clave c : clave) {
                    for (Curso curso : cursoArray) {
                        if (c.getClave() == curso.getClave()) {
                            asesorias_asesor += curso + c.getClave() + '\n';
                        }
                    }
                }
            }
        }
        return asesorias_asesor;
    }

    public String mostrarHorasios(){
        ArrayList<Asesor> horario = ((Asesor) universitario).getHorario();
        for (Asesor h : horario) {
            System.out.println(getHorario());
        }
    }

    public String mostrarListaAsistencia(int clave, int grupo) {
        //Datos del maestro
        String maestro = "";
        for (Universitario universitario : universitarioArray) {
            if (universitario instanceof Maestro) {
                ArrayList<Grupo> grupos = ((Maestro) universitario).getCarga();
                for (Grupo g : grupos) {
                    if (g.getClave() == clave && g.getNum() == grupo) {
                        maestro = ((Maestro) universitario).toString();
                        break;
                    }
                }
            }
        }
        maestro = maestro.equals("") ? "Num. Empleado: ------  Nombre del maestro: Vacante\n" : maestro + "\n";
        String materia = "";
        for (Curso curso : cursoArray) {
            if (curso.getClave() == clave) {
                materia = curso.toString() + "\n";
            }
        }
        String encabezado = "\nNo. Matricula     Nombre\n";
        String lista = "";
        int c = 1;
        for (Universitario universitario : universitarioArray) {
            if (universitario instanceof Alumno) {
                ArrayList<Grupo> grupos = ((Alumno) universitario).getCarga();
                for (Grupo g : grupos) {
                    if (g.getClave() == clave && g.getNum() == grupo) {
                        lista += c + ".  " + ((Alumno) universitario).getMatricula() + "       " + universitario.getNombre() + "\n";
                        c++;
                        break;
                    }
                }
            }
        }
        return maestro + materia + encabezado + lista;
    }

    public boolean buscar(String matricula) {
        for (Universitario universitario : universitarioArray) {
            if (universitario instanceof Alumno && ((Alumno) universitario).getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    public boolean buscar(int noEmpleado) {
        for (Universitario universitario : universitarioArray) {
            if (universitario instanceof Maestro && ((Maestro) universitario).getNoEmpleado() == noEmpleado) {
                return true;
            }
        }
        return false;
    }

    public boolean existe(int clave) {
        for (Curso curso : cursoArray) {
            if (curso.getClave() == clave) {
                return true;
            }
        }
        return false;
    }

}