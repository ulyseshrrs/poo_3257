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
public interface Figura {
    public static final int CIRCULO = 0;
    public static final int CUADRADO = 1;
    public static final int TRIANGULO = 2;
    
    
    public  abstract void dibujar ();
    public void colorear();
    public int calcularArea();
    
}
