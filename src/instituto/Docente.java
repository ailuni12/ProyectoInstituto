
package instituto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Docente extends Persona {
    private ArrayList<Materia> materiasDictadas;
    
    public Docente(String nombre, String apellido, 
            int dni, String email, String calle, int numero, 
            String ciudad, String codigoPostal, 
            LocalDate fechaDeNacimiento) {
        super(nombre, apellido, dni, email, calle, 
                numero, ciudad, codigoPostal, 
                fechaDeNacimiento);
        this.materiasDictadas = new ArrayList<>(); //inicializa la lista en el constructor
    }
    
    public void asignarMateria(Materia materia){
        materiasDictadas.add(materia);
    }
    
    public void asignaturasDictadas(){
        System.out.println("Asignaturas a cargo:");
        for (Materia i : materiasDictadas){
            System.out.println(i.mostrarNombre());
        }
    }
}
