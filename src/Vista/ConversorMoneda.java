/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controllador.Controlador;
import Controllador.ControladorMoneda;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadDinero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxSelectorMoneda = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(833, 417));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(821, 405));

        jLabel2.setText("Ingrese la cantidad de Dinero");

        txtCantidadDinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadDineroKeyTyped(evt);
            }
        });

        jLabel1.setText("Seleccione la moneda para convertir");

        cbxSelectorMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ...", "-De Peso ARS a Dólar", "-De Peso ARS a Euros", "-De Peso ARS a Libras Esterlinas", "-De Peso ARS a Yen Japonés", "-De Peso ARS a Won sul-coreano", "-De Dólar a Peso ARS", "-De Euros a Peso ARS", "-De Libras Esterlinas a Peso ARS", "-De Yen Japonés a Peso ARS", "-De Won sul-coreano a Peso ARS" }));

        jButton1.setText("Convertir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Conversor de monedas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCantidadDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxSelectorMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(261, 261, 261))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(279, 279, 279))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadDinero)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxSelectorMoneda)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantidadDinero;
    // End of variables declaration//GEN-END:variables
}
