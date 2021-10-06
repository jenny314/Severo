
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
  //private Object tabla;
    
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
        LBCLIENTE = new javax.swing.JLabel();
        LBNOMBRE = new javax.swing.JLabel();
        LBAPELLIDO = new javax.swing.JLabel();
        LBDIRECCION = new javax.swing.JLabel();
        LBCELULAR = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
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

        LBCLIENTE.setText("id_client");

        LBNOMBRE.setText("nombre_client");

        LBAPELLIDO.setText("apellido_client");

        LBDIRECCION.setText("direccion");

        LBCELULAR.setText("celular ");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBAPELLIDO)
                    .addComponent(LBNOMBRE)
                    .addComponent(LBCLIENTE, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBCELULAR, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBDIRECCION, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LBCLIENTE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBNOMBRE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBAPELLIDO)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBCELULAR)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBDIRECCION)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void BTMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTMODIFICARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTMODIFICARActionPerformed

    private void BTBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBORRARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTBORRARActionPerformed

    private void BTNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUEVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNUEVOActionPerformed

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
    private javax.swing.JLabel LBAPELLIDO;
    private javax.swing.JLabel LBCELULAR;
    private javax.swing.JLabel LBCLIENTE;
    private javax.swing.JLabel LBDIRECCION;
    private javax.swing.JLabel LBNOMBRE;
    private javax.swing.JTable TABLADATOS;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void Agregar() {
        String id_client= id_client.getText;
        String nombre_client= txtnombre_client.getText;
        String apellido_client = txtapellido_client.getText;
        String celular = txtcelular.getText;
        String direccion = txtdireccion.getText;
        if(id_client.equals("")|| nombre_client.equals("")|| apellido_client.equals("")|| celular.equals("") || direccion.equals("")){
                        JOptionPane.showMessageDialog(null "cajas vacias");
        }else {
         String sql = "insert into cliente (id_client,nombre_client, apellido_client, celular, direccion) values ("+id_client+","+nombre_client","+apellido_client+","+celular+","+direccion+")";
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

    private void LimpiarTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

                 
    

        
        JOptionpane.showMEssageDialog(null)
       
//To change body of generated methods, choose Tools | Templates.
    }

   // private void setLocationRelative(Object object) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}
  
