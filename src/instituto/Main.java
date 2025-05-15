package instituto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ArrayList<Alumno> alumnos = new ArrayList();
        
        Alumno alumno1 = new Alumno("Alfonso", "Alligator", 12345678, "alfie@example.com", 
                "Pera", 742, "Yacare, Corrientes", "12345", LocalDate.of(1990, 5, 14));
        Alumno alumno2 = new Alumno("Vivi", "Fox", 87654321, "viv@example.com", 
                "Manzana", 128, "Puesto del Zorro, San Juan", "54321", LocalDate.of(1985, 11, 3));
        Alumno alumno3 = new Alumno("Carlos", "Cat", 11223344, "carlos@example.com", 
                "Naranja", 56, "Campo de los Pumas, Formosa", "67890", LocalDate.of(1992, 7, 27));
        
        
        Docente docente1 = new Docente("Rosa", "Cormoran", 33445566, "rosa.cor@example.com", 
                "Durazno", 89, "Caniada de los Pajaros, Santiago del Estero", "13579", LocalDate.of(1978, 3, 22));
        Docente docente2 = new Docente("Tomas", "Tigre", 99887766, "tomasti@example.com", 
                "Melon", 321, "Paso del Tigre, Corrientes", "24680", LocalDate.of(1969, 9, 10));
        
        Materia materia1 = new Materia(202,"Algebra",docente1);
        Materia materia2 = new Materia(103,"Algoritmos",docente2);
        
        docente1.asignarMateria(materia1);
        docente2.asignarMateria(materia2);
        
        alumno1.inscripcionAsignatura(materia2);
        alumno1.inscripcionAsignatura(materia1);
        alumno2.inscripcionAsignatura(materia2);
        alumno3.inscripcionAsignatura(materia1);
        
        materia1.inscribirAlumno(alumno3);
        materia1.inscribirAlumno(alumno1);
        
        materia2.inscribirAlumno(alumno1);
        materia2.inscribirAlumno(alumno2);
        

        alumno1.mostrarInformacion();
        alumno1.matriculaciones();
        System.out.println("");
        alumno2.mostrarInformacion();
        alumno2.matriculaciones();
        System.out.println("");
        alumno3.mostrarInformacion();
        alumno3.matriculaciones();
        System.out.println("");
        docente1.mostrarInformacion();
        docente1.asignaturasDictadas();
        System.out.println("");
        docente2.mostrarInformacion();
        docente2.asignaturasDictadas();
        System.out.println("");
        materia1.mostrarInformacion();
        materia1.inscriptos();
        System.out.println("");
        materia2.mostrarInformacion();
        materia2.inscriptos();
    }
    
}
