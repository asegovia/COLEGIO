/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author operador
 */
public class Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    // Ingreso de Entrada
    double a,b;
    // Ingreso Salida
    double suma,producto;
    // Ingreso de Datos
    System.out.print("Ingrese el valor de a: ");
    a = Double.parseDouble(in.readLine());
    
    System.out.print("Ingrese el valor de b: ");
    b = Double.parseDouble(in.readLine());
    
    // Calculo de Datos
    suma = a + b;
    producto = a * b;
    
    // Mostrar Resultados
            
    System.out.println("La suma de a + b = " + suma);
    System.out.println("El producto de a * b es = " + producto);
    
    }
    catch(IOException ex){
    System.out.println("Error en el ingreso de datos " + ex.getMessage());
    }
    }
}
