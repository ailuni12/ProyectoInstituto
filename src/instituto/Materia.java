
package instituto;

import java.util.ArrayList;

public class Materia {
    private int comision; //comision (int)
    private final String nombre; //nombre (String)
    private Docente docente;//docente (Docente)
    private ArrayList<Alumno>alumnos; //alumnos (ArrayList<Alumno>)

    public Materia(int comision, String nombre, Docente docente) {
        this.comision = comision;
        this.nombre = nombre;
        this.docente = docente;
        this.alumnos= new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Materia:" + "\nComision: " + comision + 
                "\nNombre=" + nombre + "\nDocente=" + docente + 
                "\nAlumnos=" + alumnos + '}';
    }
    
    public void inscribirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
}


