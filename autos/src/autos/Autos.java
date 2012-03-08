/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author CHANIS
 */
public class Autos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    
    //Variables de entrada
    double PrecioVenta,porcentajeV,porcentajeCM;
    
    //Variable de salida
    double PrecioCosto, Comision, CasaMatriz;
    
    // Ingreso de Datos
    
    porcentajeV = 0.12;
    porcentajeCM = 0.15;
    
    System.out.print("Ingresar Precio Venta = ");
    PrecioVenta = Double.parseDouble(in.readLine());
    
    // Calcular Datos
    
    Comision = PrecioVenta * porcentajeV;
    CasaMatriz = PrecioVenta * porcentajeCM;
    
    PrecioCosto = PrecioVenta - Comision - CasaMatriz;
    
    // Mostrar en pantalla
    
    System.out.println ("El precio costo es = " + PrecioCosto );
    System.out.println ("La ganancia del vendedor es = " + Comision);
    System.out.println ("La Ganancia de la Casa Matriz es = " + CasaMatriz);
    
    }
    catch(IOException ex){
    System.out.println("Error en el ingreso de datos " + ex.getMessage());
    }
    
    }
}
