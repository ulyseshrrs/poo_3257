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
public class Editorial {
    private String genero;
    private int año;
    private String tipodeTexto;

    public Editorial() {
    }

    public Editorial(String genero, int año, String tipodeTexto) {
        this.genero = genero;
        this.año = año;
        this.tipodeTexto = tipodeTexto;
    }

    public String getTipodeTexto() {
        return tipodeTexto;
    }

    public void setTipodeTexto(String tipodeTexto) {
        this.tipodeTexto = tipodeTexto;
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

    @Override
    public String toString() {
        return "Editorial{" + "genero=" + genero + ", a\u00f1o=" + año + ", tipodeTexto=" + tipodeTexto + '}';
    }
    
    
}
