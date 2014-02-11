/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package protoipo.UI;

import Fachada.Fachada;
import prototipo.Utilitario.Utilitario;

/**
 *
 * @author Usuario
 */
public class IUModDatos extends javax.swing.JInternalFrame {

    /**
     * Creates new form IUModDatos
     */
    
    private IUMenuPrincipal principal;
    private Fachada fachada = null;
    
    public IUModDatos(IUMenuPrincipal unPrincipal, Fachada pFachada) {
        principal = unPrincipal;
        fachada = pFachada;
        initComponents();
        inicializarP();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTF_Nac_Anio = new javax.swing.JTextField();
        jTF_Nac_Mes = new javax.swing.JTextField();
        jLbl_titulo = new javax.swing.JLabel();
        jLb_Caravana = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jtxt_NCar = new javax.swing.JTextField();
        jLb_Raza = new javax.swing.JLabel();
        jLb_Sexo = new javax.swing.JLabel();
        jLb_Nacimiento = new javax.swing.JLabel();
        jCmb_Cat = new javax.swing.JComboBox();
        jTF_Proper = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jrb_camCar = new javax.swing.JRadioButton();
        jrb_camCam = new javax.swing.JRadioButton();
        jrb_camCat = new javax.swing.JRadioButton();
        jtxt_NCam = new javax.swing.JTextField();
        jBt_Ingresar1 = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLbl_titulo.setForeground(new java.awt.Color(51, 0, 204));
        jLbl_titulo.setText("MODIFICACIÓN DE DATOS");

        jLb_Caravana.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLb_Caravana.setText("Caravana");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hereford", "Aberdeen", "Limousine", "Normando", "Holando", "Brackford", "Brangus" }));

        jLb_Raza.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLb_Raza.setText("Raza");

        jLb_Sexo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLb_Sexo.setText("Sexo");

        jLb_Nacimiento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLb_Nacimiento.setText("Nacimiento");

        jCmb_Cat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terneras", "Terneros", "Vaquillona de 1 a 2", "Vaquillona de 2 a 3", "Vaca de Cría", "Vaca de Invernada", "Novillos de 1 a 2", "Novillos de 2 a 3", "Novillos mas de 3", "Toros" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Macho", "Hembra" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jrb_camCar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrb_camCar.setText("Cambio Caravana");
        jrb_camCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_camCarActionPerformed(evt);
            }
        });

        jrb_camCam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrb_camCam.setText("Cambio Campo");
        jrb_camCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_camCamActionPerformed(evt);
            }
        });

        jrb_camCat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrb_camCat.setText("Cambio Categoría");
        jrb_camCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_camCatActionPerformed(evt);
            }
        });

        jBt_Ingresar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBt_Ingresar1.setText("Confirmar");
        jBt_Ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_Ingresar1ActionPerformed(evt);
            }
        });

        btn_Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLbl_titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLb_Caravana)
                            .addComponent(jLb_Sexo)
                            .addComponent(jLb_Raza)
                            .addComponent(jLb_Nacimiento)
                            .addComponent(jrb_camCam)
                            .addComponent(jrb_camCat)
                            .addComponent(jrb_camCar))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_NCar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTF_Proper, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTF_Nac_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTF_Nac_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCmb_Cat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxt_NCam, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBt_Ingresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLbl_titulo)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Caravana)
                    .addComponent(jTF_Proper, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Sexo)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Raza)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_Nacimiento)
                    .addComponent(jTF_Nac_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Nac_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_camCar)
                    .addComponent(jtxt_NCar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_camCam)
                    .addComponent(jtxt_NCam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_camCat)
                    .addComponent(jCmb_Cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBt_Ingresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        this.cargaCombo();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jBt_Ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_Ingresar1ActionPerformed
        // TODO add your handling code here:

        inicializarP();
        Utilitario.mensajeProcedimientoCorrecto("Se realizó la modificación correctamente", "Modificación de Datos");

    }//GEN-LAST:event_jBt_Ingresar1ActionPerformed
    
    public void inicializarP()
    {   
        jTF_Nac_Anio.setText("");
        jTF_Nac_Mes.setText("");
        jTF_Proper.setText("");
        jtxt_NCar.setText("");
        jComboBox2.setSelectedIndex(0);
        this.jtxt_NCam.setVisible(false);
        this.jtxt_NCar.setVisible(false);
        this.jCmb_Cat.setVisible(false);   
    }
    
    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void jrb_camCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_camCarActionPerformed
        // TODO add your handling code here:
        if(jrb_camCar.isSelected())
        {
           this.jtxt_NCar.setText(""); 
           this.jtxt_NCar.setVisible(true);
        }else
        {
            this.jtxt_NCar.setText("");
            this.jtxt_NCar.setVisible(false);
        }
    }//GEN-LAST:event_jrb_camCarActionPerformed

    private void jrb_camCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_camCamActionPerformed
        // TODO add your handling code here:
        if(jrb_camCam.isSelected())
        {
           this.jtxt_NCam.setText(""); 
           this.jtxt_NCam.setVisible(true);
        }else
        {
            this.jtxt_NCam.setText("");
            this.jtxt_NCam.setVisible(false);
        }
    }//GEN-LAST:event_jrb_camCamActionPerformed

    private void jrb_camCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_camCatActionPerformed
        // TODO add your handling code here:
        if(jrb_camCat.isSelected())
        {           
           this.jCmb_Cat.setVisible(true);
        }else
        {            
            this.jCmb_Cat.setVisible(false);
        }
    }//GEN-LAST:event_jrb_camCatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton jBt_Ingresar1;
    private javax.swing.JComboBox jCmb_Cat;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLb_Caravana;
    private javax.swing.JLabel jLb_Nacimiento;
    private javax.swing.JLabel jLb_Raza;
    private javax.swing.JLabel jLb_Sexo;
    private javax.swing.JLabel jLbl_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_Nac_Anio;
    private javax.swing.JTextField jTF_Nac_Mes;
    private javax.swing.JTextField jTF_Proper;
    private javax.swing.JRadioButton jrb_camCam;
    private javax.swing.JRadioButton jrb_camCar;
    private javax.swing.JRadioButton jrb_camCat;
    private javax.swing.JTextField jtxt_NCam;
    private javax.swing.JTextField jtxt_NCar;
    // End of variables declaration//GEN-END:variables

public void cargaCombo()
    {
        this.jCmb_Cat.removeAllItems();
        if(this.jComboBox1.getSelectedIndex() == 0)
        {
            this.jCmb_Cat.addItem("Terneros");
            this.jCmb_Cat.addItem("Novillos de 1 a 2");
            this.jCmb_Cat.addItem("Novillos de 2 a 3");
            this.jCmb_Cat.addItem("Novillos mas de 3");
            this.jCmb_Cat.addItem("Toros");        
        }
        else
        {
            this.jCmb_Cat.addItem("Terneras");
            this.jCmb_Cat.addItem("Vaquillona de 1 a 2");
            this.jCmb_Cat.addItem("Vaquillona de 2 a 3");
            this.jCmb_Cat.addItem("Vaca de Cría");
            this.jCmb_Cat.addItem("Vaca de Invernada");
        }
    }
}