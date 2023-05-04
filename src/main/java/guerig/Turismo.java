/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

/**
 *
 * @author ERICK
 */
public class Turismo extends Vehiculo {
    private int puertas;
    private boolean marchaAutomatica;
    
    // No implementa métodos pero hereda los de Vehiculo.

    // Si no tiene constructor da error 

    public Turismo(int puertas, boolean marchaAutomatica, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    
    public int getPuertas() {
        return puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turismo{");
        sb.append("Puertas = ").append(puertas).append(":");
        sb.append("Marcha = ").append(marchaAutomatica).append(":");
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
