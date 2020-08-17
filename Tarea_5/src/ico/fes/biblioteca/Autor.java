/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.biblioteca;

/**
 *
 * @author uliw8
 */
public class Autor {
    private String nombre;
    private int año;

    public Autor() {
    }

    public Autor(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", a\u00f1o=" + año + '}';
    }
    
    
}
