/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import static Controllador.ControladorVelocidad.CalculoVelocidad;
import javax.swing.JOptionPane;

/**
 *
 * @author RJG-SERVER
 */
public class ControladorPeso {
    
     public static void Conversion(double peso, String opcion) {
        
        double relacion;
        
        switch (opcion) {
            case "-De Tonelada a Kilogramo":
                
                relacion = 1000 ;
                Controlador.CalculoUnidadMedida(peso,relacion,
                        "T ", "Kg ");
                
                break;
                
            case "-De Kilogramo a Gramo":
                
                relacion = 1000 ;
                Controlador.CalculoUnidadMedida(peso,relacion,
                        "Kg ", "gr");
                
                break;

            case "-De Gramo a Miligramo":
                
                relacion = 1000 ;
                Controlador.CalculoUnidadMedida(peso,relacion,
                        "gr ", "mg");
                
                break;  
            
            case "-De Miligramo a Gramo":
                
                relacion = 0.001 ;
                Controlador.CalculoUnidadMedida(peso,relacion,
                        "mg ", "gr ");
                
                break; 

            case "-De Gramo a Kilogramo":
                
                relacion = 0.001 ;
                Controlador.CalculoUnidadMedida(peso,relacion,
                        "gr ", "Kg ");
                
                break;

            case "-De Kilogramo a Tonelada":
                
                relacion = 0.001 ;
                Controlador.CalculoUnidadMedida(peso,relacion,
                        "Kg ", "T ");
                
                break;
              
             

        default:
               JOptionPane.showMessageDialog(null, "ERROR!debe ingresar un tipo de conversion" );
        }
        
    }
     
  
}
