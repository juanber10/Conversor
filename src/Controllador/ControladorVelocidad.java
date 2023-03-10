/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @author RJG-SERVER
 */
public class ControladorVelocidad {
    
    
        public static void CalculoVelocidad(double velocidad, double relacion, String velocidadOrigen,
            String velocidadDestino) {


        double resultado;
            resultado = velocidad * relacion;
            BigDecimal resultadoredondeado = new BigDecimal(resultado);
            resultadoredondeado = resultadoredondeado.setScale(2, RoundingMode.DOWN);
            JOptionPane.showMessageDialog(null,
                    " " + velocidad + " " + velocidadOrigen + " son : " + resultadoredondeado + " " + velocidadDestino,
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
   

    }
    
//- De Kilometro/hora a Milla/hora.
//- De Kilometro/hora a Pie/segundo
//- De Kilometro/hora a Metro/segundo
//- De Kilometro/hora a Nudo
        
        
    public static void Conversion(double velocidad, String opcion) {
        
        double relacion;
        
        switch (opcion) {
            case "- De Kilometro/hora a Milla/hora.":
                
                relacion = 0.621371 ;
                CalculoVelocidad(velocidad,relacion,
                        "Km/h", "M/h");
                
                break;
                
            case "- De Kilometro/hora a Pie/segundo":
                
                relacion = 0.911344 ;
                CalculoVelocidad(velocidad,relacion,
                        "Km/h", "Pie/s");
                
                break;
                
            case "- De Kilometro/hora a Metro/segundo":
                
                relacion = 0.277778 ;
                CalculoVelocidad(velocidad,relacion,
                        "Km/h", "Mts/s");
                
                break; 
            case "- De Kilometro/hora a Nudo":
                
                relacion = 0.539957 ;
                CalculoVelocidad(velocidad,relacion,
                        "Km/h", "Nudos");
                
                break;   
        default:
               JOptionPane.showMessageDialog(null, "ERROR!debe ingresar un tipo de conversion" );
        }
        
    }
    
    
    
    
    
    
}
