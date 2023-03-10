/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author RJG-SERVER
 */
public class ControladorMoneda {
      
    
    public static void CalculoMoneda(double monto, double cotizacion, String monedaOrigen,
            String monedaDestino) {


        double resultado;
            resultado = monto * cotizacion;
            BigDecimal resultadoredondeado = new BigDecimal(resultado);
            resultadoredondeado = resultadoredondeado.setScale(2, RoundingMode.DOWN);
            JOptionPane.showMessageDialog(null,
                    " " + monto + " " + monedaOrigen + " son : " + resultadoredondeado + " " + monedaDestino,
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
   

    }
    

    public static void Conversion(double cantidad, String opcion) {
        
        double cotizacionActual;
        
        switch (opcion) {
            case "-De Peso ARS a Dólar":
                
                cotizacionActual= 0.0050 ;
                CalculoMoneda(cantidad,cotizacionActual,
                        "Pesos Argentinos", "Dolar Estadounidense");
                
                break;
            case "-De Peso ARS a Euros":
                
                cotizacionActual= 0.0047 ;
                CalculoMoneda(cantidad,cotizacionActual,
                        "Pesos Argentinos", "Euros");
                
                break;

            case "-De Peso ARS a Libras Esterlinas":
                
                cotizacionActual = 0.0042;
                CalculoMoneda(cantidad,cotizacionActual,"Pesos Argentinos", 
                        "Libras Esterlinas");

                break;
                
            case "-De Peso ARS a Yen Japonés":

                cotizacionActual = 0.68;
                CalculoMoneda(cantidad, cotizacionActual, "Pesos Argentinos",
                        "Yen Japonés");

                break;
            case "-De Peso ARS a Won sul-coreano":

                cotizacionActual = 6.62;
                CalculoMoneda(cantidad, cotizacionActual, "Pesos Argentinos",
                        "Won sul-coreano");

                break;                
            case "-De Dólar a Peso ARS":

                cotizacionActual = 199.53;
                CalculoMoneda(cantidad, cotizacionActual, "Dolar Estadounidense",
                        "Pesos Argentinos");

                break;                
            case "-De Euros a Peso ARS":

                cotizacionActual = 212.27;
                CalculoMoneda(cantidad, cotizacionActual, "Euros",
                        "Pesos Argentinos");

                break; 
            case "-De Libras Esterlinas a Peso ARS":

                cotizacionActual = 238.89;
                CalculoMoneda(cantidad, cotizacionActual, "Libras Esterlinas",
                        "Pesos Argentinos");

                break; 
            case "-De Yen Japonés a Peso ARS":

                cotizacionActual = 1.47;
                CalculoMoneda(cantidad, cotizacionActual, "Yen Japonés",
                        "Pesos Argentinos");
                break;           
                
            case "-De Won sul-coreano a Peso ARS":

                cotizacionActual = 0.15;
                CalculoMoneda(cantidad, cotizacionActual, "Won sul-coreano",
                        "Pesos Argentinos");
                break; 
                
            default:
               JOptionPane.showMessageDialog(null, "ERROR!debe ingresar un tipo de conversion" );
        }
        
    }

}
