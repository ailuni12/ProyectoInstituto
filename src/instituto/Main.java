package instituto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ArrayList<Alumno> alumnos = new ArrayList();
        
        Alumno alumno1 = new Alumno("Alfonso", "Alligator", 12345678, "alfie@example.com", 
                "Pera", 742, "Macondo", "12345", LocalDate.of(1990, 5, 14));
        Alumno alumno2 = new Alumno("Vivi", "Fox", 87654321, "viv@example.com", 
                "Manzana", 128, "Comala", "54321", LocalDate.of(1985, 11, 3));
        Alumno alumno3 = new Alumno("Carlos", "Cat", 11223344, "carlos@example.com", 
                "Naranja", 56, "Realidad", "67890", LocalDate.of(1992, 7, 27));
        
        
        
        alumno1.mostrarInformacion();
        System.out.println("");
        alumno2.mostrarInformacion();
        System.out.println("");
        alumno3.mostrarInformacion();
    }
    
}
