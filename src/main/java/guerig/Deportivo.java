/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

/**
 *
 * @author ERICK
 */
public class Deportivo extends Vehiculo {
    
    private int cilindrada;

    public Deportivo(int cilindrada, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.cilindrada = cilindrada;
    }



    public int getCilindrada() {
        return cilindrada;
    }   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deportivo{");
        sb.append("Cilindrada = ").append(cilindrada).append(":");
        sb.append("Bastidor = ").append(super.getBastidor()).append(":");
        sb.append("Matricula = ").append(super.getMatricula()).append(":");
        sb.append("Marca = ").append(super.getMarca()).append(":");
        sb.append("Modelo = ").append(super.getModelo()).append(":");
        sb.append("Color = ").append(super.getColor()).append(":");
        sb.append("Tarifa = ").append(super.getTarifa()).append(":");
        sb.append("Disponible = ").append(super.isDisponible()).append(":");
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
