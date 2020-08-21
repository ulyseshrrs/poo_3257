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
public class Cuadrado implements Figura{
    private int base;
    private int altura;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.base;
        hash = 67 * hash + this.altura;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuadrado other = (Cuadrado) obj;
        if (this.base != other.base) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibijando los lados de un cuadado");
        
    }

    @Override
    public void colorear() {
        System.out.println("Coloreando el cuadrado");
       
    }

    @Override
    public int calcularArea() {
        System.out.println("Calculando lado * lado");
        return 20;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
