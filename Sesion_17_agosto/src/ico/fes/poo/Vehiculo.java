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
public class Vehiculo {
    private String descripcion;
    private String fabricante;
    private String material;

    public Vehiculo() {
    }

    public Vehiculo(String descripsion, String fabricante, String material) {
        this.descripcion = descripsion;
        this.fabricante = fabricante;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripsion() {
        return descripcion;
    }

    public void setDescripsion(String descripsion) {
        this.descripcion = descripsion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "descripsion=" + descripcion + ", fabricante=" + fabricante + ", material=" + material + '}';
    }
    
    public void usar(){
        System.out.println("utilizando el vehiculo"+ descripcion);
    }
}
