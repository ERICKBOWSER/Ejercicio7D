/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

/**
 *
 * @author ERICK
 */
public class Main {
    public static void main(String[] args) {
        
                
        List<Vehiculo> listaTurismo = new ArrayList();        
        List<Vehiculo> listaFurgoneta = new ArrayList();
        List<Vehiculo> listaDeportivo = new ArrayList();
        List<Vehiculo> listaVehiculos = new ArrayList();
        
        listaTurismo = LeerFicheros.guardarVehiculos("turismos.txt");
        listaFurgoneta = LeerFicheros.guardarVehiculos("furgonetas.txt");
        listaDeportivo = LeerFicheros.guardarVehiculos("deportivos.txt");
        
        for (Vehiculo vehiculo : listaTurismo) {
            listaVehiculos.add(vehiculo);
        }
        
        for (Vehiculo vehiculo : listaFurgoneta) {
            listaVehiculos.add(vehiculo);
        }
        
        for (Vehiculo vehiculo : listaDeportivo) {
            listaVehiculos.add(vehiculo);
        }
        
        // Vehiculos guardados en lista
        System.out.println("Vehiculos guardados en lista");
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
        }
        
        // Copiar los ficheros
        LeerFicheros.copiarFicheros("turismos.txt", "./copias/turismos.txt");
        LeerFicheros.copiarFicheros("deportivos.txt", "./copias/deportivos.txt");
        LeerFicheros.copiarFicheros("furgonetas.txt", "./copias/furgonetas.txt");
        
        List<Vehiculo> listaTurismoCopia = new ArrayList();        
        List<Vehiculo> listaFurgonetaCopia = new ArrayList();
        List<Vehiculo> listaDeportivoCopia = new ArrayList();
        List<Vehiculo> listaVehiculosCopia = new ArrayList();
        
        listaTurismoCopia = LeerFicheros.guardarVehiculos("./copias/turismos.txt");
        listaFurgonetaCopia = LeerFicheros.guardarVehiculos("./copias/deportivos.txt");
        listaDeportivoCopia = LeerFicheros.guardarVehiculos("./copias/furgonetas.txt");
        
        for (Vehiculo vehiculo : listaTurismoCopia) {
            listaVehiculosCopia.add(vehiculo);
        }
        
        for (Vehiculo vehiculo : listaFurgonetaCopia) {
            listaVehiculosCopia.add(vehiculo);
        }
        
        for (Vehiculo vehiculo : listaDeportivoCopia) {
            listaVehiculosCopia.add(vehiculo);
        }
        
        // Vehiculos guardados en lista
        System.out.println("Vehiculos guardados en lista copia");
        for (Vehiculo vehiculo : listaVehiculosCopia) {
            System.out.println(vehiculo);
        }
        
        // Comparar por bastidor
        Comparator<Vehiculo> compararBastidor = (v1, v2) -> v1.getBastidor().compareTo(v2.getBastidor());
        
        //Stream
        System.out.println("Comparado por bastidor");
        listaVehiculosCopia.stream()
                .sorted(compararBastidor) // ordenar
                .forEach(System.out :: println); // mostrar por pantalla
        
        
        // Borrar ficheros
        LeerFicheros.eliminarFicheros("turismos.txt");
        LeerFicheros.eliminarFicheros("furgonetas.txt");
        LeerFicheros.eliminarFicheros("deportivos.txt");
        
        //Mostrar directorio
        System.out.println("Carpetas donde estaban los ficheros originales");
        LeerFicheros.mostrarDirectorio(".\\");
        
        System.out.println("Matricula ordenada y filtrado por color de coche");
        listaVehiculosCopia.stream()
                .filter(v -> v.getColor().equalsIgnoreCase("azul"))
                .sorted((v1, v2) -> v1.getMatricula().compareToIgnoreCase(v2.getMatricula()))
                .map(v -> v.getMatricula())// Hace que solo aparezcan las matriculas
                .distinct()
                .forEach(System.out :: println);
        
        System.out.println("Marcas de coches distintos y disponibles");
        listaVehiculosCopia.stream()
                .filter( v -> v.isDisponible())
                .map(v -> v.getMarca())
                .distinct()
                .forEach(System.out :: println);
        
        
        Long contador = listaVehiculosCopia.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase("opel"))
                .count();
                
        System.out.println("Contar cantidad");
        System.out.println(contador);
        
        System.out.println("Marca de coche, color y disponibilidad");
        listaVehiculosCopia.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase("opel"))
                .filter(v -> v.getColor().equalsIgnoreCase("verde"))
                .filter(v -> v.isDisponible())
                .forEach(System.out :: println);
        
        List<Double> tarifaDiferente = listaVehiculosCopia.stream()
                .map(v -> v.getTarifa())
                .distinct()
                .toList();
        
        System.out.println("Vehiculos con tarifas diferentes");
        for (Double double1 : tarifaDiferente) {
            System.out.println(double1);
        }
        
    }
            
}
