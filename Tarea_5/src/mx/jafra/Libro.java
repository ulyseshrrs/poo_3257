/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.jafra;
import ico.fes.biblioteca.Autor;
import ico.fes.biblioteca.Editorial;

/**
 *
 * @author uliw8
 */
public class Libro {
    private String titulo; 
    private String genero;
    private int año; 
    private Editorial p_edito;
    private Autor p_autor;

    public Libro() {
    }

    public Libro(String titulo, String genero, int año, Editorial p_edito, Autor p_autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.p_edito = p_edito;
        this.p_autor = p_autor;
    }

    public Autor getP_autor() {
        return p_autor;
    }

    public void setP_autor(Autor p_autor) {
        this.p_autor = p_autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Editorial getP_edito() {
        return p_edito;
    }

    public void setP_edito(Editorial p_edito) {
        this.p_edito = p_edito;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", genero=" + genero + ", a\u00f1o=" + año + ", p_edito=" + p_edito + ", p_autor=" + p_autor + '}';
    }
    
    
}
