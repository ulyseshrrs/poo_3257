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

public class Automovil {
   private String marca;
   private String subMarca;
   private int modelo;
   private String color;
    
   //métodos de acceso
   public void setModelo (int mod){
       if(mod >= 1914 && mod <= 2020){
           this.modelo=mod;
       }else{
           System.out.println("Ese modelo esta duera de rango");
       }
   }
   
   public int getModelo(){
       return this.modelo;
   }
   public void setMarca (String mar){
       if(mar>=Golf){
           this.modelo=mar;
       }else{
           System.out.println("Ese modelo esta duera de rango");
       }
   }
   
    public void encender(){
        System.out.println("Encender el auto");
    }
    
    public void acelerar (){
        System.out.println("Acelerando");
    }
    public float avanzar (int metros){
        float reales=0.0f;
        reales=(float)Math.random()*(float)metros;
        System.out.println("Avanzando el auto"+this.marca);
        return reales;
    }

    @Override
    public String toString() { //To change body of generated methods, choose Tools | Templates.
       return this.marca+ "," + this.subMarca + ","
               + this.modelo + "," + this.color;
    }
    
    
    
}
