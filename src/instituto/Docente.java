
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
    }
    
    public void asignarMateria(Materia materia){
        materiasDictadas.add(materia);
    }
}
