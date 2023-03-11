/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;


import javax.swing.JOptionPane;

/**
 *
 * @author RJG-SERVER
 */
public class ControladorVelocidad {
    

            
        
    public static void Conversion(double velocidad, String opcion) {
        
        double relacion;
        
        switch (opcion) {
            case "- De Kilometro/hora a Milla/hora.":
                
                relacion = 0.621371 ;
                Controlador.CalculoUnidadMedida(velocidad,relacion,
                        "Km/h", "M/h");
                
                break;
                
            case "- De Kilometro/hora a Pie/segundo":
                
                relacion = 0.911344 ;
                Controlador.CalculoUnidadMedida(velocidad,relacion,
                        "Km/h", "Pie/s");
                
                break;
                
            case "- De Kilometro/hora a Metro/segundo":
                
                relacion = 0.277778 ;
                Controlador.CalculoUnidadMedida(velocidad,relacion,
                        "Km/h", "Mts/s");
                
                break; 
            case "- De Kilometro/hora a Nudo":
                
                relacion = 0.539957 ;
                Controlador.CalculoUnidadMedida(velocidad,relacion,
                        "Km/h", "Nudos");
                
                break;   
        default:
               JOptionPane.showMessageDialog(null, "ERROR!debe ingresar un tipo de conversion" );
        }
        
    }
    
    
    
    
    
    
}
