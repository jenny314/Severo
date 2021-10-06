
package vista;

import configuracion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class principal extends javax.swing.JFrame{
   Conexion con = new Conexion();
   Connection cn;
   Statement st;
   ResultSet rs;
   DefaultTableModel modelo;
   //int id;
  //private DefaultTableModel DefaultTableModel;
 // private Object TABLADATOS;
    
    public principal() {
        initComponents();
        //setLocationRelative(null);
        listar();
    }
    private void listar() {
        String sql= "select * from cliente";
         try{
             cn=con.getConnection();
             st=cn.createStatement();
             rs= st.executeQuery(sql);
             
             
             Object[] cliente =new Object[5];
             modelo = (DefaultTableModel) TABLADATOS.getModel();
             while(rs.next()){
                 cliente[0]=rs.getString("id_client");
                 cliente[1]=rs.getString("nombre_client");
                 cliente[2]=rs.getString("apellido_client"); 
                 cliente[3]=rs.getString("celular");
                 cliente[4]=rs.getString("direccion");
                    
                 modelo.addRow(cliente);
             }
         }catch(SQLException e){
             System.out.println("falla "+e.getMessage());
         }

      
    }

   

   //private void initComponents() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
      
//}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBid_client = new javax.swing.JLabel();
        LBnombre_client = new javax.swing.JLabel();
        LBapellido_client = new javax.swing.JLabel();
        LBdireccion = new javax.swing.JLabel();
        LBcelular = new javax.swing.JLabel();
        TXTNOMBRE = new javax.swing.JTextField();
        TXTCLIENTE = new javax.swing.JTextField();
        TXTAPELLIDO = new javax.swing.JTextField();
        TXTCELULAR = new javax.swing.JTextField();
        TXTDIRECCION = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BTAGREGAR = new javax.swing.JButton();
        BTMODIFICAR = new javax.swing.JButton();
        BTBORRAR = new javax.swing.JButton();
        BTNUEVO = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLADATOS = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBid_client.setText("id_client");

        LBnombre_client.setText("nombre_client");

        LBapellido_client.setText("apellido_client");

        LBdireccion.setText("direccion");

        LBcelular.setText("celular ");

        TXTNOMBRE.setText("jTextField1");
        TXTNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNOMBREActionPerformed(evt);
            }
        });

        TXTCLIENTE.setText("jTextField2");

        TXTAPELLIDO.setText("jTextField3");

        TXTCELULAR.setText("jTextField4");

        TXTDIRECCION.setText("jTextField5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LBapellido_client)
                            .addComponent(LBnombre_client)
                            .addComponent(LBcelular, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBdireccion, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBid_client, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTNOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(TXTAPELLIDO)
                    .addComponent(TXTCELULAR)
                    .addComponent(TXTDIRECCION)
                    .addComponent(TXTCLIENTE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LBid_client, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBnombre_client)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBapellido_client)
                            .addComponent(TXTAPELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBcelular)
                            .addComponent(TXTCELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBdireccion)
                            .addComponent(TXTDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TXTCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel6.setText("tabla cliente");

        BTAGREGAR.setText("AGREGAR");
        BTAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAGREGARActionPerformed(evt);
            }
        });

        BTMODIFICAR.setText("MODIFICAR");
        BTMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTMODIFICARActionPerformed(evt);
            }
        });

        BTBORRAR.setText("BORRAR");
        BTBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBORRARActionPerformed(evt);
            }
        });

        BTNUEVO.setText("NUEVO");
        BTNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUEVOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTAGREGAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTMODIFICAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTBORRAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNUEVO)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTAGREGAR)
                    .addComponent(BTMODIFICAR)
                    .addComponent(BTBORRAR)
                    .addComponent(BTNUEVO))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        TABLADATOS.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        TABLADATOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        TABLADATOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLADATOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLADATOS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAGREGARActionPerformed
    Agregar(); 
    listar ();
    nuevo();
        
    }//GEN-LAST:event_BTAGREGARActionPerformed
    private void Agregar() {
        String id_client =TXTCLIENTE.getText();
        String nombre_client=TXTNOMBRE.getText();
        String apellido_client =TXTAPELLIDO.getText();
        String celular =TXTCELULAR.getText();
        String direccion = TXTDIRECCION.getText();
        if(id_client.equals("")|| nombre_client.equals("")|| apellido_client.equals("")|| celular.equals("") || direccion.equals("")){
                  JOptionPane.showMessageDialog(null ,"cajas vacias");
        }else {
         String sql = "insert into cliente (id_client,nombre_client, apellido_client, celular, direccion) values ("+TXTCLIENTE+","+TXTNOMBRE+","+TXTAPELLIDO+","+TXTCELULAR+","+TXTDIRECCION+")";
         try{
             cn = con.getConnection();
             st = cn.createStatement();
             st.executeUpdate(sql);
             JOptionPane.showMessageDialog(null,"usuario agregado");
             LimpiarTabla();
         } catch (Exception e){
             
         }

}
    } 
    private void TABLADATOSMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void BTMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTMODIFICARActionPerformed
        int fila= TABLADATOS.getSelectedRow();
        int id=Integer.parseInt((String)TABLADATOS.getValueAt(fila,0).toString());
        String id_client =TXTCLIENTE.getText();
        String nombre_client=TXTNOMBRE.getText();
        String apellido_client =TXTAPELLIDO.getText();
        String celular =TXTCELULAR.getText();
        String direccion = TXTDIRECCION.getText();
        if (fila==-1){
            JOptionPane.showMessageDialog(null ,"USUARIO NO SELECIONADO");
        }
        if(id_client.equals("")|| nombre_client.equals("")|| apellido_client.equals("")|| celular.equals("") || direccion.equals("")){
                  JOptionPane.showMessageDialog(null ,"cajas vacias");
        }else {
            String sql = "insert into cliente (id_client,nombre_client, apellido_client, celular, direccion) values ("+TXTCLIENTE+","+TXTNOMBRE+","+TXTAPELLIDO+","+TXTCELULAR+","+TXTDIRECCION+")";
         try{
             cn = con.getConnection();
             st = cn.createStatement();
             st.executeUpdate(sql);
             JOptionPane.showMessageDialog(null,"usuario actualizado");
             LimpiarTabla();
         } catch (Exception e){
             
         }
            
        }          
    }//GEN-LAST:event_BTMODIFICARActionPerformed

    private void BTBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBORRARActionPerformed
       int fila= TABLADATOS.getSelectedRow();
       int id=Integer.parseInt((String)TABLADATOS.getValueAt(fila,0).toString());
       String id_client =TXTCLIENTE.getText();
        String nombre_client=TXTNOMBRE.getText();
        String apellido_client =TXTAPELLIDO.getText();
        String celular =TXTCELULAR.getText();
        String direccion = TXTDIRECCION.getText();
        if (fila==-1){
            JOptionPane.showMessageDialog(null ,"USUARIO NO SELECIONADO");
        }
        if(id_client.equals("")|| nombre_client.equals("")|| apellido_client.equals("")|| celular.equals("") || direccion.equals("")){
                  JOptionPane.showMessageDialog(null ,"cajas vacias");
        }else {
            String sql = "delete from cliente where id  ="+id;
         try{
             cn = con.getConnection();
             st = cn.createStatement();
             st.executeUpdate(sql);
             JOptionPane.showMessageDialog(null,"usuario actualizado");
             LimpiarTabla();
         } catch (Exception e){
             
         }
            
        }          
    }//GEN-LAST:event_BTBORRARActionPerformed

    private void BTNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUEVOActionPerformed
      TXTCLIENTE.setText(String: "");
      TXTNOMBRE.setText(String: "");
      TXTAPELLIDO.setText(String: "");
      TXTCELULAR.setText(String: "");
      TXTDIRECCION.getText(String: "");
      TXTCodigoSalidaProdoctos.setText(String: "");
              
    }//GEN-LAST:event_BTNUEVOActionPerformed

    private void TABLADATOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLADATOSMouseClicked
        // TODO add your handling code here:
        int fila= TABLADATOS.getSelectedRow();
        if(fila==1){
             JOptionPane.showMessageDialog(null ,"USUARIO NO SELECIONADO");
        }else {
            id= Integer.parseInt((String)TABLADATOS.getValueAt(fila, 0).toString());
            String id_client= (String)TABLADATOS.getValueAt(fila, fila)
        }
    }//GEN-LAST:event_TABLADATOSMouseClicked

    private void TXTNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNOMBREActionPerformed

public static void main (String args[]){
    java.awt.EventQueue.invokeLater(new Runnable(){
    public void run(){
        new principal().setVisible(true);
        
}
});
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTAGREGAR;
    private javax.swing.JButton BTBORRAR;
    private javax.swing.JButton BTMODIFICAR;
    private javax.swing.JButton BTNUEVO;
    private javax.swing.JLabel LBapellido_client;
    private javax.swing.JLabel LBcelular;
    private javax.swing.JLabel LBdireccion;
    private javax.swing.JLabel LBid_client;
    private javax.swing.JLabel LBnombre_client;
    private javax.swing.JTable TABLADATOS;
    private javax.swing.JTextField TXTAPELLIDO;
    private javax.swing.JTextField TXTCELULAR;
    private javax.swing.JTextField TXTCLIENTE;
    private javax.swing.JTextField TXTDIRECCION;
    private javax.swing.JTextField TXTNOMBRE;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables



    private void LimpiarTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void nuevo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

                 
    

        
       // JOptionpane.showMEssageDialog(null)
       
//To change body of generated methods, choose Tools | Templates.
    //}

   // private void setLocationRelative(Object object) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
//
  
