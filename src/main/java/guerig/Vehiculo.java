/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

/**
 *
 * @author ERICK
 */
public class Vehiculo implements Comparable<Vehiculo>{
    private Long bastidor;
    private String matricula; 
    private String marca; 
    private String modelo; 
    private String color; 
    private double tarifa; 
    private boolean disponible;

    public Vehiculo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    public Long getBastidor() {
        return bastidor;
    }

    public void setBastidor(Long bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("Bastidor = ").append(bastidor).append(":");
        sb.append("Matricula = ").append(matricula).append(":");
        sb.append("Marca = ").append(marca).append(":");
        sb.append("Modelo = ").append(modelo).append(":");
        sb.append("Color = ").append(color).append(":");
        sb.append("Tarifa = ").append(tarifa).append(":");
        sb.append("Disponible = ").append(disponible).append(":");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Vehiculo v) {
        return this.bastidor.compareTo(v.getBastidor());
    }
    
    

    

}
