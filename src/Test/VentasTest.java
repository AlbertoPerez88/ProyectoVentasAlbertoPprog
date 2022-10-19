package Test;
import Dominio.Orden;
import Dominio.Producto;
import java.util.ArrayList;
import java.util.Scanner;

public class VentasTest {
    static Scanner ent = new Scanner(System.in);
    
    public static void introducirProductos(Orden or1 , int maxProd , String nombre, double precio) {    //aqui vamos a introducir los productos
        String elegir;
        while (!nombre.equals("0") && maxProd != 0){
            System.out.println("Introduce el NOMBRE del producto: ");
            maxProd--;
            nombre = ent.nextLine();
            if (!nombre.equals("0")) {
                do{
                    System.out.println("Introduce el PRECIO del producto: ");
                    precio = ent.nextFloat();
                }while(precio <= 0);
                 or1.agregarProducto(new Producto(nombre, precio));
            }
            nombre = ent.nextLine();    //LBBSM
            System.out.println("Quiere seguir añadiendo productos a la lista? (S/N)");  //Aqui preguntamos al usuario si quiere seguir comprando o quiere dejar de comprar
            elegir=ent.nextLine();
            if(elegir.toUpperCase().compareTo("S")==0){
                System.out.println("");
            }else{
                System.out.println("Se ha finalizado la compra de productos");
                break;
            }
        }
        
    }

    public static void main(String[] args) {
        Orden or1 = new Orden();
        double precio = 0;
        int maxProd = Orden.getMAX_PRODUCTOS();
        String nombre = "";
        int total=0;
        introducirProductos(or1 , maxProd , nombre, precio);
        or1.mostrarOrden(null);
        or1.calcularTotal(total);
        
        //A partir de aqui vamos a almacenar los productos en un archivo ".txt"         EN CONSTRUCCION      
        String nombreArchivo = "ventasProductos.txt";
        Orden.crearArchivoTxt(nombreArchivo);       
        
        
    }
}
