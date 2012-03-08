/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author CHANIS
 */
public class Coordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    // Variable de Entrada
    double x,y;
    
    // Variable Selectiva
    if (x > 0)
      { if ( y > 0 )
      {
      System.out.print("CUADRANTE I");
      }
      else
      {
      System.out.print("CUADRANTE IV");
      } 
    }
    else 
    {if ( x > 0)
     {
      System.out.print("CUADRANTE II");
     }
     else
      {
      System.out.print("CUADRANTE III");
      }
    }
    }
    catch(IOException ex){
    System.out.println("Error en el ingreso de datos " + ex.getMessage());
    }
    }
}
