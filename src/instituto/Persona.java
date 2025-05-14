package instituto;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

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
        calcularEdad();
        
        direccion = new Direccion(calle,numero,ciudad,codigoPostal);
    }
    
    private void calcularEdad(){
        int edad = Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
        this.edad = edad;
    }
    
    private boolean esMayorDeEdad(int edad){
        return edad >= 18;
    }
    
    public void mostrarInformacion() {
        //que imprima por consola los datos de la persona.
        System.out.println("DATOS:\nNombre: " + nombre + "\nApellido: "
        + apellido + "\nEdad: " + edad + "\nDNI: " + dni + "\nEmail: " + email
        + "\nDireccion: " + direccion.toString());
    }

}
