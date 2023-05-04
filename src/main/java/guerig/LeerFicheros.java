/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class LeerFicheros {
    
    
    // Copiar ficheros
    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);
        try {
            Files.copy(origen, destino);
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        }
    }
    
    public static List<Vehiculo> guardarVehiculos(String nombre){
        // Fichero a leer con datos de ejemplo
        String idFichero = nombre;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        
        List<Vehiculo> listaVehiculos = new ArrayList();

        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(":");
                
                if(nombre.equalsIgnoreCase("turismos.txt") || 
                        nombre.equalsIgnoreCase("./copias/turismos.txt")){
                    Vehiculo vTurismo = new Turismo(
                            Integer.parseInt(tokens[7]), 
                            Boolean.parseBoolean(tokens[8]), 
                            Long.parseLong(tokens[0]), 
                            tokens[1], 
                            tokens[2], 
                            tokens[3], 
                            tokens[4],
                            Double.parseDouble(tokens[5]), 
                            Boolean.parseBoolean(tokens[6]));
                    
                    listaVehiculos.add(vTurismo);
                } else if(nombre.equalsIgnoreCase("deportivos.txt") ||
                        nombre.equalsIgnoreCase("./copias/deportivos.txt")){
                    Vehiculo vDeportivo = new Deportivo(Integer.parseInt(tokens[7]), 
                            Long.parseLong(tokens[0]), 
                            tokens[1], 
                            tokens[2], 
                            tokens[3], 
                            tokens[4],
                            Double.parseDouble(tokens[5]), 
                            Boolean.parseBoolean(tokens[6])
                            );
                    listaVehiculos.add(vDeportivo);
                }else{
                    Vehiculo vFurgoneta = new Furgoneta(Integer.parseInt(tokens[8]), 
                            Integer.parseInt(tokens[7]),
                            Long.parseLong(tokens[0]), 
                            tokens[1], 
                            tokens[2], 
                            tokens[3], 
                            tokens[4],
                            Double.parseDouble(tokens[5]), 
                            Boolean.parseBoolean(tokens[6])
                            );
                    listaVehiculos.add(vFurgoneta);
                }
                
                
                for (String string : tokens) {
                    
                    System.out.print(string + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        return listaVehiculos;
    }
    
    public static void eliminarFicheros(String nombre){
        Path file = Paths.get(nombre);
        try {
            Files.delete(file);
        } catch (NoSuchFileException nsfe) {
            System.out.println("No se puede borrar " + nombre + " porque no existe");
        } catch (DirectoryNotEmptyException dnee) {
            System.out.println("No se puede borrar el directorio porque no está vacío");
        } catch (IOException e) {
            System.out.println("Problema borrando el elemento " + nombre);
        }
    }
    
    public static void mostrarDirectorio(String nombre) {

        File f = new File(nombre);
        if (f.exists()) {
            // Obtiene los ficheros y directorios dentro de f y los 
            // devuelve en un array
            File[] ficheros = f.listFiles();
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }
    
}
