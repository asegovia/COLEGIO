/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aspirantes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author alumnos
 */
public class Aspirantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    // Datos de Entrada
    double C1,C2;
    
    // Datos de Salida
    String condicion;
    
    //Ingreso de Datos
    System.out.print("Ingrese la calificación A = ");
    C1 = Double.parseDouble(in.readLine());
    
    System.out.print("Ingrese la calificación B = ");
    C2 = Double.parseDouble(in.readLine());
    
    
    // Calculo Selectivo
    if (C1 >= 80 && C2 >= 80)
    {
    condicion = "ACEPTADO";
    } 
    else
    {
    condicion = "DENEGADO";
    }
    // Mostrar resultado
    System.out.println("El aspirante debe ser : " + condicion );
    }
    catch(IOException ex){
    System.out.println("Error en el ingreso de datos " + ex.getMessage());
    }
    }
}
