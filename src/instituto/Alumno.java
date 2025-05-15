
package instituto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private ArrayList<Materia> materiasCursadas;
    
    public Alumno(String nombre, String apellido, 
            int dni, String email, String calle, int numero, 
            String ciudad, String codigoPostal, 
            LocalDate fechaDeNacimiento) {
        super(nombre, apellido, dni, email, calle, 
                numero, ciudad, codigoPostal, 
                fechaDeNacimiento);
        this.materiasCursadas = new ArrayList<>(); //inicializa la lista en el constructor
    }
    
    public void inscripcionAsignatura(Materia materia){
        materiasCursadas.add(materia);
    }
    
    public void matriculaciones(){
        System.out.println("Matriculaciones:");
        for (Materia i : materiasCursadas){
            System.out.println(i.mostrarNombre());
        }
    }
    
}
