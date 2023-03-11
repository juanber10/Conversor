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
public class ControladorMoneda {
      
    

    public static void Conversion(double cantidad, String opcion) {
        
        double cotizacionActual;
        
        switch (opcion) {
            case "-De Peso ARS a Dólar":
                
                cotizacionActual= 0.0050 ;
                Controlador.CalculoUnidadMedida(cantidad,cotizacionActual,
                        "Pesos Argentinos", "Dolar Estadounidense");
                
                break;
            case "-De Peso ARS a Euros":
                
                cotizacionActual= 0.0047 ;
                Controlador.CalculoUnidadMedida(cantidad,cotizacionActual,
                        "Pesos Argentinos", "Euros");
                
                break;

            case "-De Peso ARS a Libras Esterlinas":
                
                cotizacionActual = 0.0042;
                Controlador.CalculoUnidadMedida(cantidad,cotizacionActual,"Pesos Argentinos", 
                        "Libras Esterlinas");

                break;
                
            case "-De Peso ARS a Yen Japonés":

                cotizacionActual = 0.68;
                Controlador.CalculoUnidadMedida(cantidad, cotizacionActual, "Pesos Argentinos",
                        "Yen Japonés");

                break;
            case "-De Peso ARS a Won sul-coreano":

                cotizacionActual = 6.62;
                Controlador.CalculoUnidadMedida(cantidad, cotizacionActual, "Pesos Argentinos",
                        "Won sul-coreano");

                break;                
            case "-De Dólar a Peso ARS":

                cotizacionActual = 199.53;
                Controlador.CalculoUnidadMedida(cantidad, cotizacionActual, "Dolar Estadounidense",
                        "Pesos Argentinos");

                break;                
            case "-De Euros a Peso ARS":

                cotizacionActual = 212.27;
                Controlador.CalculoUnidadMedida(cantidad, cotizacionActual, "Euros",
                        "Pesos Argentinos");

                break; 
            case "-De Libras Esterlinas a Peso ARS":

                cotizacionActual = 238.89;
                Controlador.CalculoUnidadMedida(cantidad, cotizacionActual, "Libras Esterlinas",
                        "Pesos Argentinos");

                break; 
            case "-De Yen Japonés a Peso ARS":

                cotizacionActual = 1.47;
                Controlador.CalculoUnidadMedida(cantidad, cotizacionActual, "Yen Japonés",
                        "Pesos Argentinos");
                break;           
                
            case "-De Won sul-coreano a Peso ARS":

                cotizacionActual = 0.15;
                Controlador.CalculoUnidadMedida(cantidad, cotizacionActual, "Won sul-coreano",
                        "Pesos Argentinos");
                break; 
                
            default:
               JOptionPane.showMessageDialog(null, "ERROR!debe ingresar un tipo de conversion" );
        }
        
    }

}
