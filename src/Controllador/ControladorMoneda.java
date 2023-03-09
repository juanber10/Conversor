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

        switch (opcion) {
            case "-De Peso ARS a Dólar":
                System.out.println("La opcion fue de peso a dolar");
                System.out.println(cantidad);
                break;
            case "-De Peso ARS a Euros":
                System.out.println("La opcion fue de peso a Euro");
                System.out.println(cantidad);
                break;

            case "-De Peso ARS a Libras Esterlinas":
                System.out.println("La opcion fue de peso a Libras Esterlinas");
                System.out.println(cantidad);
                break;
            default:
               JOptionPane.showMessageDialog(null, "ERROR!debe ingresar un tipo de conversion" );
        }
        
//         ...
//-De Peso ARS a Dólar
//-De Peso ARS a Euros
//-De Peso ARS a Libras Esterlinas
//-De Peso ARS a Yen Japonés
//-De Peso ARS a Won sul-coreano
//-De Dólar a Peso ARS
//-De Euros a Peso ARS
//-De Libras Esterlinas a Peso ARS
//-De Yen Japonés a Peso ARS
//-De Won sul-coreano a Peso ARS

    }

}
