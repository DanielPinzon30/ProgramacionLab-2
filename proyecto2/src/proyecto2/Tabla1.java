package proyecto2;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Tabla1 extends javax.swing.JFrame {
    DefaultTableModel modelo;
    String cant;
    int aux;
    String espacio[]=new String[1];   

    public Tabla1() {
        initComponents();
        modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        okbt = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        enviarbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        okbt.setText("OK");
        okbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtActionPerformed(evt);
            }
        });

        enviarbt.setText("Enviar");
        enviarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarbtActionPerformed(evt);
            }
        });

        jLabel1.setText("Numeros Ingresados");

        jLabel2.setText("Orenados Menor-Mayor");

        jLabel3.setText("Orenados Mayor-Menor");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPane1);

        jScrollPane3.setViewportView(jTextPane2);

        jScrollPane4.setViewportView(jTextPane3);

        jScrollPane5.setViewportView(jTextPane4);

        jLabel4.setText("Numero a Buscar: ");

        jLabel5.setText("Cantidad de Numeros: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enviarbt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okbt)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okbt)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviarbt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtActionPerformed
       cant = cantidad.getText();
       if(Integer.parseInt(cant)<=1){do{
          cant= JOptionPane.showInputDialog("Ingrese un dato valido Mayor a 1");
       }while(Integer.parseInt(cant)<=1);
          for(int i=0;i<Integer.parseInt(cant);i++){
         modelo.addColumn("No. "+(i+1));
    }}else{
            for(int i=0;i<Integer.parseInt(cant);i++){
         modelo.addColumn("No. "+(i+1));
       }}
         modelo.addRow(espacio);
         modelo.addRow(espacio);
         modelo.addRow(espacio);
    }//GEN-LAST:event_okbtActionPerformed
 private String num1[]=new String[20];
  private String num2[]=new String[20];
   private String num3[]=new String[20];
  
    private void enviarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarbtActionPerformed
        
    
   String []num =new String[Integer.parseInt(cant)];
    
   for(int i=0;i<Integer.parseInt(cant);i++){
      
              num[i]=(String) modelo.getValueAt(0, i);
              num1[i]=num[i];//******
            }                     
            for(int i=0;i<Integer.parseInt(cant)-1;i++){                  
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);                     
                 }  
             }    
            } 
            for(int i=0;i<Integer.parseInt(cant);i++){
                num2[i]=num[i];
              modelo.setValueAt(num[i], 1, i);
              System.out.println(num[i]);
          }
          for(int i=0;i<Integer.parseInt(cant)-1;i++){                  
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);                     
                 }                
             }  
            } 
          for(int i=0;i<Integer.parseInt(cant);i++){
              num3[i]=num[i];
              modelo.setValueAt(num[i], 2, i);
              System.out.println(num[i]);
          }
    }//GEN-LAST:event_enviarbtActionPerformed
private String x;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       x= jTextPane1.getText();
   
       for(int i=0;i<Integer.parseInt(cant);i++){
           if(x.equals(num1[i])){
               jTextPane2.setText("Posicion Ingresada: "+(i+1));
           }
       }
       for(int i=0;i<Integer.parseInt(cant);i++){
           if(x.equals(num2[i])){
               jTextPane3.setText("Posicion Menor-Mayor: "+(i+1));
           }
       }
       for(int i=0;i<Integer.parseInt(cant);i++){
           if(x.equals(num3[i])){
               jTextPane4.setText("Posicion Mayor-Menor: "+(i+1));
           }
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton enviarbt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JButton okbt;
    // End of variables declaration//GEN-END:variables
}
