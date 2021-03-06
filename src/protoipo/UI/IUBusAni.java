/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package protoipo.UI;

import prototipo.Utilitario.Utilitario;
import Fachada.Fachada;
import java.util.Date;
import javax.swing.JTable;
/**
 *
 * @author Usuario
 */
public class IUBusAni extends javax.swing.JInternalFrame {

    /**
     * Creates new form IUBusAni
     */
    private IUMenuPrincipal principal;
    private Fachada fachada = null;
    
    public IUBusAni(IUMenuPrincipal unPrincipal, Fachada pFachada) {
        principal = unPrincipal;
        fachada = pFachada;
        initComponents();
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
        jLbl_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblIngreso = new javax.swing.JTable();
        jlb_fil_Car = new javax.swing.JLabel();
        jtxt_fil_Car = new javax.swing.JTextField();
        jBt_Volver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLbl_titulo.setForeground(new java.awt.Color(51, 0, 204));
        jLbl_titulo.setText("BÚSQUEDA DE ANIMALES");

        jTblIngreso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTblIngreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Evento", "Propietario", "Sexo", "Raza", "Nacimiento", "Campo", "Categoria", "Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTblIngreso);
        jTblIngreso.getColumnModel().getColumn(7).setResizable(false);

        jlb_fil_Car.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlb_fil_Car.setText("Caravana:");

        jBt_Volver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBt_Volver.setText("Cerrar");
        jBt_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_VolverActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlb_fil_Car)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxt_fil_Car, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBt_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jLbl_titulo)
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLbl_titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_fil_Car)
                    .addComponent(jtxt_fil_Car, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBt_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBt_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_VolverActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jBt_VolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.cargaTabla();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBt_Ingresar1;
    private javax.swing.JButton jBt_Ingresar2;
    private javax.swing.JButton jBt_Volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLbl_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblIngreso;
    private javax.swing.JLabel jlb_fil_Car;
    private javax.swing.JTextField jtxt_fil_Car;
    // End of variables declaration//GEN-END:variables

    private Object[][] obtenerDatosParaTabla() {
         Object[][] data = {
            {"17/04/2011", "Ingreso","Pedro","Macho", "Hereford", "20/02/2011", "14", "Ternero", ""},
            {"17/08/2011", "Leído","Pedro","Macho", "Hereford", "20/02/2011", "14", "Ternero", ""},
            {"25/09/2013", "Modificación","Pedro","Macho", "Hereford", "20/02/2011", "14", "Novillo", ""}            
        };
        return data;
    }
    
    private String[] obtenerNombresDeColumnas(){
        String[] nombresColumnas = {"Fecha", "Evento", "Propietario", "Sexo", "Raza","Nacimiento", "Campo","Categoria","Destino"};
        return nombresColumnas;
    }

    public void actualizar() {
        cargaTabla();  
    
    }
    
    public void cargaTabla(){
        Object[][] datos = obtenerDatosParaTabla();
        String[] nomCol = obtenerNombresDeColumnas();     
        
        jTblIngreso = new JTable(datos,nomCol); 
        jScrollPane1.setViewportView(jTblIngreso);
           
    }
    

}
