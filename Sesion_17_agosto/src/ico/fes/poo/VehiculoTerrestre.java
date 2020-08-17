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
public class VehiculoTerrestre extends Vehiculo { //herencia
    private int tipo; //0: neumaticos, 1:vias ferreas, 2: Magnetico
    private String KmPorHora;

    public VehiculoTerrestre() {
    }

    public VehiculoTerrestre(int tipo, String KmPorHora) {
        this.tipo = tipo;
        this.KmPorHora = KmPorHora;
    }

    public VehiculoTerrestre(int tipo, String KmPorHora, String descripsion, String fabricante, String material) {
        super(descripsion, fabricante, material);
        this.tipo = tipo;
        this.KmPorHora = KmPorHora;
    }

    public String getKmPorHora() {
        return KmPorHora;
    }

    public void setKmPorHora(String KmPorHora) {
        this.KmPorHora = KmPorHora;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "VehiculoTerrestre{" + "tipo=" + tipo + ", KmPorHora=" + KmPorHora + '}'+ super.toString();
    }
    
    public int viajar(){
        System.out.println("El vehiculo terretre esta viajando por");
        switch (this.tipo){
            case 0:
                System.out.print("Carretera");
                break;
            case 1:
                System.out.print("Vias ferreas");
                break;
            case 2:
                System.out.print("Vias Magnetias");
                break;
            default:
                System.out.println("No reconocible...");
        }
        return 100;
    }
}
