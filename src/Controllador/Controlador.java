/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import Vista.MenuPrincipal;

public class Controlador {

    static MenuPrincipal view = new MenuPrincipal();

    static public void presentar() {
        view.setVisible(true);
    }

    static public void ocultar() {
        view.setVisible(false);
    }

    static public void evnSalir() {

        ocultar();
        System.exit(0);
    }

}
