/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author uliw8
 */
public class Smartphone {
    String marca;
    int modelo;
    int resolucion;
    float precio;
    
public void marca(){

}

    public Smartphone(String marca, int modelo, int resolucion, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.precio = precio;
    }

    public Smartphone() {
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

}
