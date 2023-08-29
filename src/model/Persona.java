
package model;

import java.io.Serializable;


public class Persona implements Serializable{
    
    private int clave;
    private String nombre;
    private String correo;
    private String crago;
    private String sueldo;

    public Persona(int clave, String nombre, String correo, String crago, String sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.correo = correo;
        this.crago = crago;
        this.sueldo = sueldo;
    }

    public int getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

     public String getCorreo() {
        return correo;
    }


    public String getCrago() {
        return crago;
    }


 
    public String getSueldo() {
        return sueldo;
    }

    
    
    
}
