package instituto;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String email;
    private Direccion direccion;
    private static int legajo = 0;
    
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, String apellido, int dni, String email,String calle, int numero, String ciudad, String codigoPostal, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.fechaDeNacimiento = fechaDeNacimiento;
        
        direccion = new Direccion(calle,numero,ciudad,codigoPostal);
    }
    
    private void ingresarEdad(){
        int edad;
        String aux;
        
        aux = JOptionPane.showInputDialog("Ingrese la edad de la persona: ");
        edad = Integer.parseInt(aux);
        
        while(!esPositivo(edad)){
            aux = JOptionPane.showInputDialog("Valor invalido. Ingrese la edad de la persona: ");
            edad = Integer.parseInt(aux);
        }
        
        this.edad = edad;
    }
    
    private boolean esMayorDeEdad(int edad){
        return edad >= 18;
    }
    
    private boolean esPositivo(int n){
        return n >= 0;
    }
    
    private void mostrarInformacion() {
        //que imprima por consola los datos de la persona.
        System.out.println("DATOS:\nNombre: " + nombre + "\nApellido: "
        + apellido + "\nEdad: " + edad + "\nDNI: " + dni + "\nEmail: " + email);
    }

}
