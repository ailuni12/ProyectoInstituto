
package instituto;

import java.time.LocalDate;

public class Docente extends Persona {
    
    public Docente(String nombre, String apellido, 
            int dni, String email, String calle, int numero, 
            String ciudad, String codigoPostal, 
            LocalDate fechaDeNacimiento) {
        super(nombre, apellido, dni, email, calle, 
                numero, ciudad, codigoPostal, 
                fechaDeNacimiento);
    }
    
}
