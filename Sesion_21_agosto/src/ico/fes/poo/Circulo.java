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
public class Circulo implements Figura{
    

    @Override
    public void dibujar() {
         System.out.println("Dibujando un circulo");
    }

    @Override
    public void colorear() {
        System.out.println("Coloreando un circulo");
     }

    @Override
    public int calcularArea() {
        System.out.println("Calculando el area p1 3.1416");
      return 15;
    }
}
