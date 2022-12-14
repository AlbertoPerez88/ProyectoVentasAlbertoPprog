/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejo;

import Dominio.Producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class AccesoaDatos implements Interfaz{

    @Override
    public void leerArchivo(String nombre) {
        System.out.println("\tAPARTADO leerArchivo");
        BufferedReader entrada = null;
        File archivo = new File(nombre);
        try {
            entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println("lectura -> " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void escribirArchivo(String nombre, ArrayList<Producto> produc) {
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {  
            salida = new PrintWriter(archivo);
            salida.println(produc);
            System.out.println("\tSe ha creado el archivo");
        } catch (FileNotFoundException ex) {    
            ex.printStackTrace(System.out);
        } finally { 
            salida.close();
        }
    }
    
}
