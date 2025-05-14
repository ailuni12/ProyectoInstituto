package instituto;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Alfonso", "Alligator", 12345678, "alfie@example.com", 
                "Pera", 742, "Macondo", "12345", LocalDate.of(1990, 5, 14));
        Persona persona2 = new Persona("Vivi", "Barracuda", 87654321, "bea@example.com", 
                "Manzana", 128, "Comala", "54321", LocalDate.of(1985, 11, 3));
        Persona persona3 = new Persona("Charly", "Cat", 11223344, "carlos@example.com", 
                "Naranja", 56, "Realidad", "67890", LocalDate.of(1992, 7, 27));
        
        persona1.mostrarInformacion();
        System.out.println("");
        persona2.mostrarInformacion();
        System.out.println("");
        persona3.mostrarInformacion();
    }
    
}
