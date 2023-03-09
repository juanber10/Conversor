/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import Vista.ConversorMoneda;
import Vista.ConversorVelocidad;
import Vista.ConversorZonaHoraria;
import Vista.MenuPrincipal;

public class Controlador {

    static MenuPrincipal view = new MenuPrincipal();
    static ConversorMoneda conversorMoneda = new ConversorMoneda();
    static ConversorVelocidad conversorVelocidad = new ConversorVelocidad();
    static ConversorZonaHoraria conversorZona = new ConversorZonaHoraria();
    static public void presentar() {
        view.setVisible(true);
    }

    static public void ocultar() {
        view.setVisible(false);
    }

    
    static public void verConvMonedas() {
        conversorMoneda.setVisible(true);
    }

    static public void ocultarConvMonedas() {
        conversorMoneda.setVisible(false);
    }
    
    static public void verConvVelocidad() {
        conversorVelocidad.setVisible(true);
    }

    static public void ocultarConvVelocidad() {
        conversorVelocidad.setVisible(false);
    }
    
    static public void verConvZonaHoraria() {
        conversorZona.setVisible(true);
    }

    static public void ocultarConvZonaHoraria() {
        conversorZona.setVisible(false);
    }    
    
    
    static public void evnSalir() {

        ocultar();
        System.exit(0);
    }

}
