/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import gopher.Customer;
import gopher.Gopher;

public class signInPanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    Gopher gopher= new Gopher();
    Customer [] customers;
    
    public signInPanel() {
        initComponents();
    }
    public void setMainFrame(MainFrame mainFrame){
        this.mainFrame=mainFrame;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        email = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        add(email);
        email.setBounds(360, 80, 240, 40);

        submit.setBackground(new java.awt.Color(51, 102, 255));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        add(submit);
        submit.setBounds(420, 290, 120, 30);

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Create a new account as a seller");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(300, 450, 410, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create a new account as a customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(300, 380, 410, 40);

        error.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        add(error);
        error.setBounds(650, 210, 410, 20);

        password.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        add(password);
        password.setBounds(360, 200, 240, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Password :");
        add(jLabel4);
        jLabel4.setBounds(240, 200, 120, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Email :");
        add(jLabel2);
        jLabel2.setBounds(240, 80, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\13303\\Downloads\\Homepage-0.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -80, 1360, 950);

        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(230, 204, 50, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_emailActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TOO add your handling code here:
        gopher.start();
        String newText= email.getText();
        char[] Password= password.getPassword();
        String pw1= new String (Password);
        customers= gopher.getCustomers();
        for(Integer n=0;n<customers.length-1;n++){
            if(customers[n].getEmail().equals(newText)&& customers[n].getPassword().equals(pw1)){
                this.mainFrame.HomePanel();
                this.mainFrame.setIndex(n);
            }
         }
        error.setText("Sorry either password or email don't match");
    }//GEN-LAST:event_submitActionPerformed
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       this.mainFrame.nextPanel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.mainFrame.nextToSeller();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
