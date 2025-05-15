
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
        this.alumnos= new ArrayList<>(); //inicializa la lista en el constructor
    }

    public void mostrarInformacion() {
        System.out.println("Materia:" + "\nComision: " + comision + 
                "\nNombre: " + nombre + "\nDocente: " + docente.mostrarNombre());
    }
    
    public void inscribirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public void inscriptos(){
        System.out.println("Alumnos incriptos:");
        for (Alumno i : alumnos){
            System.out.println(i.mostrarNombre());
        }
    }
    
    public String mostrarNombre() {
        return nombre;
    }
}


