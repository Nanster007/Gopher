package newpackage;
import gopher.Customer;
import gopher.Gopher;



public class createAccountCustomer extends javax.swing.JPanel {
    private MainFrame mainFrame;
    Customer customer = new Customer();
    Gopher gopher= new Gopher();
    public createAccountCustomer() {
        initComponents();
    }
    public void setMainFrame(MainFrame mainFrame){
        this.mainFrame=mainFrame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        testing = new javax.swing.JCheckBox();
        show1 = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(1133, 70, 110, 30);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(40, 540, 90, 31);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        add(password);
        password.setBounds(150, 460, 240, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Password :");
        add(jLabel7);
        jLabel7.setBounds(30, 460, 90, 40);

        address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(address);
        address.setBounds(150, 340, 240, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Address :");
        add(jLabel6);
        jLabel6.setBounds(30, 340, 80, 40);

        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(email);
        email.setBounds(150, 260, 240, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Email :");
        add(jLabel4);
        jLabel4.setBounds(30, 270, 100, 30);

        testing.setBackground(new java.awt.Color(51, 51, 51));
        testing.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        testing.setForeground(new java.awt.Color(51, 102, 255));
        testing.setText("Click");
        testing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testingActionPerformed(evt);
            }
        });
        add(testing);
        testing.setBounds(150, 400, 73, 23);

        show1.setBackground(new java.awt.Color(0, 0, 255));
        show1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        show1.setForeground(new java.awt.Color(255, 255, 255));
        add(show1);
        show1.setBounds(650, 440, 590, 40);

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        add(lastName);
        lastName.setBounds(150, 180, 240, 40);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Enter Here");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(860, 510, 110, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Last Name :");
        add(jLabel3);
        jLabel3.setBounds(30, 180, 100, 30);

        firstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        add(firstName);
        firstName.setBounds(150, 90, 240, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("First Name :");
        add(jLabel2);
        jLabel2.setBounds(30, 90, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\13303\\Downloads\\WebDevelopment-\\hello.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-10, -100, 1400, 970);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.mainFrame.back();   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Customer [] customers= gopher.getCustomers();
        Integer index=customers.length-1;
        char [] Password= password.getPassword();
        String pw= new String(Password);
        customer.setPassword(pw);
        customers[index]=customer;
        gopher.setCustomers(customers);   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwordActionPerformed

    private void testingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testingActionPerformed
        // TODO add your handling code here:
        String FirstName= firstName.getText();
        customer.setFirstName(FirstName);
        String LastName= lastName.getText();
        customer.setLastName(LastName);
        String Email= email.getText();
        customer.setEmail(Email);
        String Address= address.getText();
        customer.setHomeAddress(Address);
    }//GEN-LAST:event_testingActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Customer customer= gopher.getSingleCustomer(5);
        String s= customer.getFirstName();
        show1.setText(s+", Congratulation! Your account has been created");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastName;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField show1;
    private javax.swing.JCheckBox testing;
    // End of variables declaration//GEN-END:variables
}
