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
public class ImplementarEjemplo implements EjemploAbstractas{

    @Override
    public void saludar(int veces) {
        System.out.println("Hola");
    }

    @Override
    public void despedir() {
        System.out.println("Adios");
    }
    
}
