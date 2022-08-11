package newpackage;
import gopher.Seller;
import gopher.Gopher;


public class createAccountSeller extends javax.swing.JPanel {
    private MainFrame mainFrame;
    Seller seller= new Seller(null,null,null,null,null);
    Gopher gopher= new Gopher();
    public createAccountSeller() {
        gopher.start();
        initComponents();
    }

    public void setMainFrame(MainFrame mainFrame){
        this.mainFrame=mainFrame;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        sellerPassword = new javax.swing.JPasswordField();
        sellerLast = new javax.swing.JTextField();
        sellerEmail = new javax.swing.JTextField();
        sellerPhone = new javax.swing.JTextField();
        sellerAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        result = new javax.swing.JTextField();
        sellerFirst = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(1140, 20, 140, 30);

        sellerPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(sellerPassword);
        sellerPassword.setBounds(220, 430, 230, 40);

        sellerLast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(sellerLast);
        sellerLast.setBounds(220, 120, 230, 40);

        sellerEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(sellerEmail);
        sellerEmail.setBounds(220, 190, 230, 40);

        sellerPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(sellerPhone);
        sellerPhone.setBounds(220, 260, 230, 40);

        sellerAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(sellerAddress);
        sellerAddress.setBounds(220, 340, 230, 40);

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(90, 530, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");
        add(jLabel6);
        jLabel6.setBounds(90, 330, 90, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone:");
        add(jLabel5);
        jLabel5.setBounds(90, 250, 90, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password :");
        add(jLabel7);
        jLabel7.setBounds(90, 420, 100, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name :");
        add(jLabel3);
        jLabel3.setBounds(90, 110, 120, 40);

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 102, 255));
        jCheckBox1.setText("Click");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(220, 380, 57, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email :");
        add(jLabel4);
        jLabel4.setBounds(90, 180, 130, 40);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Enter Here");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(880, 540, 110, 20);

        result.setBackground(new java.awt.Color(0, 0, 0));
        result.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        add(result);
        result.setBounds(700, 500, 490, 30);

        sellerFirst.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(sellerFirst);
        sellerFirst.setBounds(220, 50, 230, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name :");
        add(jLabel2);
        jLabel2.setBounds(90, 40, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\13303\\Downloads\\WebDevelopment-\\zayn.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1380, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.mainFrame.backToMain();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        String FirstName= sellerFirst.getText();
        seller.setSellerFirstName(FirstName);
        String LastName= sellerLast.getText();
        seller.setSellerLastName(LastName);
        String Email= sellerEmail.getText();
        seller.setSellerEmail(Email);
        String Address= sellerAddress.getText();
        seller.setSellerCompanyName(Address);
        String Phone= sellerPhone.getText();
        Integer p= Integer.parseInt(Phone);
        seller.setSellerPhoneNumber(p);
        
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Seller [] sellers= gopher.getSellers();
        Integer index= sellers.length-1;
        char [] Password= sellerPassword.getPassword();
        String pw= new String(Password);
        seller.setSellerPassword(pw);
        sellers[index]=seller;
        gopher.setSellers(sellers);
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Seller seller= gopher.getSeller(5);
        String s=seller.getSellerFirstName();
        result.setText(s+" Congratulation! Your account has been created");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField result;
    private javax.swing.JTextField sellerAddress;
    private javax.swing.JTextField sellerEmail;
    private javax.swing.JTextField sellerFirst;
    private javax.swing.JTextField sellerLast;
    private javax.swing.JPasswordField sellerPassword;
    private javax.swing.JTextField sellerPhone;
    // End of variables declaration//GEN-END:variables
}
