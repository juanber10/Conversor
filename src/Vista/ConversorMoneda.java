/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controllador.Controlador;
import Controllador.ControladorMoneda;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author RJG-SERVER
 */
public class ConversorMoneda extends javax.swing.JFrame {

    /**
     * Creates new form ConversorMoneda
     */
    public ConversorMoneda() {
        initComponents();
                       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        cbxSelectorMoneda = new javax.swing.JComboBox<>();
        txtCantidadDinero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione la moneda para convertir");

        btnMenu.setText("Menu");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        cbxSelectorMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ...", "-De Peso ARS a Dólar", "-De Peso ARS a Euros", "-De Peso ARS a Libras Esterlinas", "-De Peso ARS a Yen Japonés", "-De Peso ARS a Won sul-coreano", "-De Dólar a Peso ARS", "-De Euros a Peso ARS", "-De Libras Esterlinas a Peso ARS", "-De Yen Japonés a Peso ARS", "-De Won sul-coreano a Peso ARS" }));

        txtCantidadDinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadDineroKeyTyped(evt);
            }
        });

        jLabel2.setText("Ingrese la cantidad de Dinero");

        jButton1.setText("Convertir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(btnMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantidadDinero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbxSelectorMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidadDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSelectorMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addComponent(btnMenu)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
       Controlador.ocultarConvMonedas();
       Controlador.presentar();
    }//GEN-LAST:event_btnMenuMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

             
        if (!"".equals(txtCantidadDinero.getText())) {
            double cantidad = Double.parseDouble(txtCantidadDinero.getText());
            String seleccion = (String) cbxSelectorMoneda.getSelectedItem();

            ControladorMoneda.Conversion(cantidad, seleccion);

        } else {
            JOptionPane.showMessageDialog(null, "ERROR!debe ingresar un valor en cantidad");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void txtCantidadDineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadDineroKeyTyped

   // se captura el caracter presionado con el evento y se lo almacena en la variable caracter
    char caracter = evt.getKeyChar();
   // Se comprueba que el caracter no sea una letra, espacio en blanco y que solo pueda contener un solo punto
    if (((caracter < '0') || (caracter > '9')) 
        && (caracter != KeyEvent.VK_BACK_SPACE)
        && (caracter != '.' || txtCantidadDinero.getText().contains(".")) ) {
            evt.consume();
            
         JOptionPane.showMessageDialog(null, "ERROR! Solo se aceptan valores numericos positivos" );
        }

    }//GEN-LAST:event_txtCantidadDineroKeyTyped

    /**
     * @param args the command line arguments
     */

    public JComboBox<String> getCbxSelectorMoneda() {
        return cbxSelectorMoneda;
    }

    public void setCbxSelectorMoneda(JComboBox<String> cbxSelectorMoneda) {
        this.cbxSelectorMoneda = cbxSelectorMoneda;
    }

    public JTextField getTxtCantidadDinero() {
        return txtCantidadDinero;
    }

    /**
     * @param args the command line arguments
     */
    public void setTxtCantidadDinero(JTextField txtCantidadDinero) {
        this.txtCantidadDinero = txtCantidadDinero;
    }

  
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cbxSelectorMoneda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCantidadDinero;
    // End of variables declaration//GEN-END:variables
}
