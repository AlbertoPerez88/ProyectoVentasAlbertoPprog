/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejo;

import Dominio.Producto;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public interface Interfaz {
    public void leerArchivo(String nombre);
    public void escribirArchivo(String nombre, ArrayList<Producto> produc);
    
}
