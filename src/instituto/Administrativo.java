
package instituto;

import java.time.LocalDate;

public class Administrativo extends Persona {
    
    public Administrativo(String nombre, String apellido, int dni, 
            String email, String calle, int numero, String ciudad, 
            String codigoPostal, LocalDate fechaDeNacimiento) {
        super(nombre, apellido, dni, email, calle, 
                numero, ciudad, codigoPostal, 
                fechaDeNacimiento);
    }
    
    public void inscribirAlumno(Alumno alumno, Materia materia){
        alumno.inscribirseMateria(materia);
    }
    
}
