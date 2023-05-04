/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

/**
 *
 * @author ERICK
 */
public class Furgoneta extends Vehiculo {
    private int carga;
    private int volumen;

    public Furgoneta(int carga, int volumen, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public int getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Furgoneta{");
        sb.append("Carga = ").append(carga).append(":");
        sb.append("Volumen = ").append(volumen).append(":");
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
