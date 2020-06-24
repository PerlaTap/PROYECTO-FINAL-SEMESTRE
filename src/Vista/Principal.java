package Vista;
import javax.swing.ImageIcon;
import modelos.conectate;
/** @author perla */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();              
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        MenuConteo = new javax.swing.JMenu();
        op1 = new javax.swing.JMenuItem();
        MenuEntidades = new javax.swing.JMenu();
        op2 = new javax.swing.JMenuItem();
        MenuHab = new javax.swing.JMenu();
        op3 = new javax.swing.JMenuItem();
        MenuLoc = new javax.swing.JMenu();
        op4 = new javax.swing.JMenuItem();
        MenuMuni = new javax.swing.JMenu();
        op5 = new javax.swing.JMenuItem();
        MenuSmedico = new javax.swing.JMenu();
        op6 = new javax.swing.JMenuItem();
        menuEdad = new javax.swing.JMenu();
        op7 = new javax.swing.JMenuItem();
        menuconsultas = new javax.swing.JMenu();
        op8 = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto BD INEGI - Tapia Mojica Perla");
        setBackground(new java.awt.Color(102, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(153, 255, 153));
        jTextField2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jTextField2.setText("BIENVENIDOS");
        jTextField2.setBorder(null);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(153, 255, 153));
        jTextField6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField6.setText("BD INEGI");
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(547, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 491, Short.MAX_VALUE))
        );

        MenuConteo.setText("Conteo 2005 ");
        MenuConteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConteoActionPerformed(evt);
            }
        });

        op1.setText("Conteo2005");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        MenuConteo.add(op1);

        jMenuBar2.add(MenuConteo);

        MenuEntidades.setText("Entidades");

        op2.setText("Entidades");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        MenuEntidades.add(op2);

        jMenuBar2.add(MenuEntidades);

        MenuHab.setText("Habitantes");

        op3.setText("Habitantes");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });
        MenuHab.add(op3);

        jMenuBar2.add(MenuHab);

        MenuLoc.setText("Localidades  ");

        op4.setText("Localidades");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });
        MenuLoc.add(op4);

        jMenuBar2.add(MenuLoc);

        MenuMuni.setText("Municipios ");

        op5.setText("Municipios");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });
        MenuMuni.add(op5);

        jMenuBar2.add(MenuMuni);

        MenuSmedico.setText("Smedico ");

        op6.setText("Servicio Medico");
        op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op6ActionPerformed(evt);
            }
        });
        MenuSmedico.add(op6);

        jMenuBar2.add(MenuSmedico);

        menuEdad.setText("Edades");

        op7.setText("Edades");
        op7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op7ActionPerformed(evt);
            }
        });
        menuEdad.add(op7);

        jMenuBar2.add(menuEdad);

        menuconsultas.setText("Consultas");

        op8.setText("Consultas");
        op8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op8ActionPerformed(evt);
            }
        });
        menuconsultas.add(op8);

        jMenuBar2.add(menuconsultas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuConteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConteoActionPerformed
             
    }//GEN-LAST:event_MenuConteoActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        Conteo2005 pruebita = new Conteo2005();
        jPanel1.add(pruebita);
        pruebita.show();
        jPanel2.setVisible(false);
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        Entidadess enty = new Entidadess();
        jPanel1.add(enty);
        enty.show();
        jPanel2.setVisible(false);
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        Habitantess hab= new Habitantess();
        jPanel1.add(hab);
        hab.show();
        jPanel2.setVisible(false);
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        Localidadess loc= new Localidadess();
        jPanel1.add(loc);
        loc.show();
        jPanel2.setVisible(false);
    }//GEN-LAST:event_op4ActionPerformed

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        Municipio mun= new Municipio();
        jPanel1.add(mun);
        mun.show();
        jPanel2.setVisible(false);
    }//GEN-LAST:event_op5ActionPerformed

    private void op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op6ActionPerformed
        Smedicoo sm= new Smedicoo();
        jPanel1.add(sm);
        sm.show();
        jPanel2.setVisible(false);
    }//GEN-LAST:event_op6ActionPerformed

    private void op7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op7ActionPerformed
        Edades ed= new Edades();
        jPanel1.add(ed);
        ed.show();
        jPanel2.setVisible(false);
    }//GEN-LAST:event_op7ActionPerformed

    private void op8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op8ActionPerformed
        Consultas consul= new Consultas();
        jPanel1.add(consul);
        consul.show();
        jPanel2.setVisible(false);
    }//GEN-LAST:event_op8ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                conectate con= new conectate();
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuConteo;
    private javax.swing.JMenu MenuEntidades;
    private javax.swing.JMenu MenuHab;
    private javax.swing.JMenu MenuLoc;
    private javax.swing.JMenu MenuMuni;
    private javax.swing.JMenu MenuSmedico;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JMenu menuEdad;
    private javax.swing.JMenu menuconsultas;
    private javax.swing.JMenuItem op1;
    private javax.swing.JMenuItem op2;
    private javax.swing.JMenuItem op3;
    private javax.swing.JMenuItem op4;
    private javax.swing.JMenuItem op5;
    private javax.swing.JMenuItem op6;
    private javax.swing.JMenuItem op7;
    private javax.swing.JMenuItem op8;
    // End of variables declaration//GEN-END:variables
}