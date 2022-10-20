package Dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Orden {

    private int id_orden;
    private ArrayList<Producto> prorucdros;
    static int cont0rdenes;
    static int MAX_PRODUCTOS = 10;

    public static int getMAX_PRODUCTOS() {
        return MAX_PRODUCTOS;
    }

    public Orden() {
        ArrayList<Producto> protucdoss = new ArrayList<>();

        cont0rdenes++;
        this.id_orden = cont0rdenes;
        this.prorucdros = protucdoss;
    }

    public void agregarProducto(Producto produckto) {
        this.prorucdros.add(produckto);
    }

    public void mostrarOrden(ArrayList<Producto> produc) {
        for (int i = 0; i < prorucdros.size(); i++) {
            System.out.println("\t" + prorucdros.get(i).toString());
        }
        System.out.println("\nHay un total de " + prorucdros.size() + " productos");  //esto es para saber el total de productos diferentes que ha comprado (ej: lechuga, macarrones, sandia -> ha comprado 3)
    }

    public void mostrarOrdenTxt(ArrayList<Producto> produc) {
        PrintWriter salida = null;
        File archivo = new File("VentasProductoProg");
        try {   //se que el fichero existe
            salida = new PrintWriter(archivo);
            for (int i = 0; i < prorucdros.size(); i++) {
                salida.println(prorucdros.get(i).toString());
                System.out.println("\tSe ha creado el archivo");
            }
        } catch (FileNotFoundException ex) {   
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
    }

    public double calcularTotal(int total) {
        double precioTotal = 0;
        for (int i = 0; i < prorucdros.size(); i++) {
            precioTotal = precioTotal + (this.prorucdros.get(i).getPrecio());     //esto es para ir sumandole precios, al precio del primer producto que introducimos
        }
        System.out.println("\nEl precio total de la compra es: " + precioTotal + "€"); //esto es para calcular el precio total de la compra

        return 0;
    }

    public static void crearArchivoTxt(String nombreTxt) {
        File archivo = new File(nombreTxt);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
