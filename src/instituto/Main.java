package instituto;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Alfonso", "Alligator", 12345678, "alfie@example.com", 
                "Palta", 742, "Macondo", "12345", LocalDate.of(1990, 5, 14));
        
        persona1.mostrarInformacion();
    }
    
}
