package Vista;
import ModeloBD.LocalidadesBD;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import modelos.LocalidadesM;
import modelos.conectate;

/**@author perla */
public class Localidadess extends javax.swing.JInternalFrame {

    LocalidadesBD contro;
    LocalidadesM contt;
    conectate con;
    Object[][] dtPer;
        int fila = -1;
    /*Creates new form Localidades*/
        
    public Localidadess() {
        initComponents();
        con=new conectate();
        contro=new LocalidadesBD();
        updateTabla();
    }
    
    public void limpia_localidades(){
        this.jTextField_IdEntid.setText(null);
        this.jTextFieldID_MUNI.setText(null);    
        this.jTextField_IdLoc.setText(null);
        this.jTextField_NomLoc.setText(null);
        this.jTextField_Ambito.setText(null);
        this.jTextField_PobTotal.setText(null);
        this.jTextField_PobM.setText(null);
        this.jTextField_PobF.setText(null);
        this.jTextField_VivT.setText(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_IdLoc = new javax.swing.JTextField();
        jTextFieldID_MUNI = new javax.swing.JTextField();
        jTextField_IdEntid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_NomLoc = new javax.swing.JTextField();
        jTextField_Ambito = new javax.swing.JTextField();
        jTextField_PobTotal = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_PobM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_PobF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_VivT = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldId_entidad1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldI_idmuni = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldI_idloc = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Localidades");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Entidad", "Id_Municipio", "Id_Localidad", "Nom_Localidad", "Ambito", "Pob_Total", "Pob_Masculina", "Pob_Femenina", "Viv_Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane2.setViewportView(jTable2);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel7.setText("ID");

        jLabel8.setText("ID Municipio");

        jLabel9.setText("Id Localidad");

        jLabel1.setText("Nombre Localidad");

        jLabel2.setText("Ambito");

        jLabel3.setText("Población Total");

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jLabel4.setText("Población Masculina");

        jLabel5.setText("Población Femenina");

        jLabel6.setText("Vivienda Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAgregar)
                        .addGap(145, 145, 145)
                        .addComponent(jButtonModificar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_IdEntid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_IdLoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(jTextFieldID_MUNI)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_NomLoc, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jTextField_Ambito)
                            .addComponent(jTextField_PobTotal))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_VivT)
                                    .addComponent(jTextField_PobF)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_PobM, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)))
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_IdEntid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_NomLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_PobM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Ambito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_PobF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_IdLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_PobTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_VivT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldID_MUNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonAgregar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Registro"));
        jPanel1.setName("Buscar"); // NOI18N

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel22.setText("Id Entidad");

        jLabel23.setText("Id Municipio");

        jLabel24.setText("Id Localidad");

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldId_entidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(2, 2, 2)
                .addComponent(jTextFieldI_idmuni, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldI_idloc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBuscar)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldId_entidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldI_idmuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jButtonBuscar)
                    .addComponent(jTextFieldI_idloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        int id = Integer.parseInt(jTextFieldId_entidad1.getText());
        int idm = Integer.parseInt(jTextFieldI_idmuni.getText());
        int idl = Integer.parseInt(jTextFieldI_idloc.getText());
        contro.Buscar(id,idm, idl);
        System.out.print(id +""+ idm +""+ idl);
        updateTabla();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int id = Integer.parseInt(jTextFieldId_entidad1.getText());
        int idmun=Integer.parseInt(jTextFieldI_idmuni.getText());
        int idl = Integer.parseInt(jTextFieldI_idloc.getText());
        int res=JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el registro?");
        if(res==JOptionPane.YES_OPTION){
            contro.deleteLocalidades(id, idmun, idl);
            updateTabla();
        } 
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        
            int cc=Integer.parseInt(jTextField_IdEntid.getText());            
            int v=Integer.parseInt(jTextFieldID_MUNI.getText());            
            int nom=Integer.parseInt(jTextField_IdLoc.getText()); 
            String noml=jTextField_NomLoc.getText(); 
            String am=jTextField_Ambito.getText(); 
            int nomp=Integer.parseInt(jTextField_PobTotal.getText()); 
            int pm=Integer.parseInt(jTextField_PobM.getText()); 
            int pf=Integer.parseInt(jTextField_PobF.getText()); 
            int vt=Integer.parseInt(jTextField_VivT.getText()); 
                       
            contt=new LocalidadesM(cc,v,nom,noml,am,nomp,pm,pf,vt);
            contro.ingresaDatosLocalidades(cc,v,nom,noml,am,nomp,pm,pf,vt);
            updateTabla();
            
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
          try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("update localidades " +
            "set id_entidad = ? ," +
            "id_municipio = ? ," +
            "id_localidad = ? ," +                    
            "nom_localidad = ? ," +   
            "ambito = ? ," +   
            "pob_total = ? , " +
            "pob_masculina = ? ,"+
            "pob_femenina = ? ,"+
            "viv_total = ? ,"+
            "where id_entidad = ?; ");            
            pstm.setInt(1,Integer.parseInt(jTextField_IdEntid.getText()));
            pstm.setInt(2, Integer.parseInt(jTextFieldID_MUNI.getText()));
            pstm.setInt(3, Integer.parseInt(jTextField_IdLoc.getText()));
            pstm.setString(4, jTextField_NomLoc.getText());
            pstm.setString(5, jTextField_Ambito.getText());
            pstm.setInt(6,Integer.parseInt(jTextField_PobTotal.getText())); 
            pstm.setInt(7, Integer.parseInt(jTextField_PobM.getText()));
            pstm.setInt(8, Integer.parseInt(jTextField_PobF.getText()));
            pstm.setInt(9,  Integer.parseInt(jTextField_VivT.getText()));          
            pstm.setInt(10, Integer.parseInt(jTextFieldId_entidad1.getText()));
            pstm.setInt(11,Integer.parseInt(jTextFieldI_idmuni.getText()));
            pstm.setInt(12,Integer.parseInt(jTextFieldI_idloc.getText()));
            int res=pstm.executeUpdate();
                    if(res>0){
                        JOptionPane.showMessageDialog(null,"Registro modificado");
                        System.out.print("Modificado!");
                        limpia_localidades();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                    limpia_localidades();
                    updateTabla();
         }catch(SQLException e){
         System.out.println(e);         
         } 
            
    }//GEN-LAST:event_jButtonModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldID_MUNI;
    private javax.swing.JTextField jTextFieldI_idloc;
    private javax.swing.JTextField jTextFieldI_idmuni;
    private javax.swing.JTextField jTextFieldId_entidad1;
    private javax.swing.JTextField jTextField_Ambito;
    private javax.swing.JTextField jTextField_IdEntid;
    private javax.swing.JTextField jTextField_IdLoc;
    private javax.swing.JTextField jTextField_NomLoc;
    private javax.swing.JTextField jTextField_PobF;
    private javax.swing.JTextField jTextField_PobM;
    private javax.swing.JTextField jTextField_PobTotal;
    private javax.swing.JTextField jTextField_VivT;
    // End of variables declaration//GEN-END:variables
private void updateTabla(){    
    Vector<Object> fil;
    Object[][] dtPer={};
    String[] columNames = {"Id Entidad","Id Municipio","Id Localidad","Nom Localidad","Ambito","Poblacion Total", "Poblacion Masculina", "Poblacion Femenina", "vivienda total"};  
    DefaultTableModel datos = new DefaultTableModel(dtPer,columNames);                        
    jTable2.setModel(datos);       
        for(int x=datos.getRowCount();x>0;x--){
            datos.removeRow(x);         
        }
        List<LocalidadesM> ji=contro.getDatos();
        
        for (LocalidadesM fila1 : ji) {
            
        fil=new Vector<Object>();
        fil.add(fila1.getId_entidad());
        fil.add(fila1.getId_municipio());
        fil.add(fila1.getId_localidad());
        fil.add(fila1.getNom_localidad());
        fil.add(fila1.getAmbito());
        fil.add(fila1.getPob_total());
        fil.add(fila1.getPob_masculina());
        fil.add(fila1.getPob_femenina());
        fil.add(fila1.getViv_total());
        
        datos.addRow(fil);
                
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
               try {
           Properties props = new Properties();
            FastLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        } catch (Exception e){
            
        }        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Localidadess().setVisible(true);
            }
        });
    }
}
