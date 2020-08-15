/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author uliw8
 */
public class Monitor {
    private String marca;
    private int pulgada;

    public Monitor() {
    }

    public Monitor(String marca, int pulgada) {
        this.marca = marca;
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", pulgada=" + pulgada + '}';
    }
    
    
    
}
