package newpackage;
import gopher.Customer;
import gopher.Gopher;

public class PaymentPanel extends javax.swing.JPanel {
    MainFrame mainFrame;
    private Integer index;
    Customer []customers;
    Gopher gopher= new Gopher();
    public PaymentPanel() {
        gopher.start();
        initComponents();
    }
    
    public void setMainFrame(MainFrame mainFrame){
        this.mainFrame= mainFrame;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        card1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        card5 = new javax.swing.JTextField();
        card4 = new javax.swing.JTextField();
        card3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        card6 = new javax.swing.JTextField();
        conclusion = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        totalBalance = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        card2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel4.setText("CVV number :");
        add(jLabel4);
        jLabel4.setBounds(40, 240, 80, 30);

        jLabel6.setText("Zip Code :");
        add(jLabel6);
        jLabel6.setBounds(40, 390, 70, 40);
        add(card1);
        card1.setBounds(180, 90, 120, 30);

        jLabel5.setText("Expiry Date :");
        add(jLabel5);
        jLabel5.setBounds(40, 310, 90, 40);
        add(card5);
        card5.setBounds(180, 400, 120, 30);
        add(card4);
        card4.setBounds(180, 320, 120, 30);
        add(card3);
        card3.setBounds(180, 240, 120, 30);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(90, 480, 130, 23);

        jLabel7.setText("First Name :");
        add(jLabel7);
        jLabel7.setBounds(40, 20, 70, 30);
        add(card6);
        card6.setBounds(180, 20, 120, 30);

        conclusion.setBackground(new java.awt.Color(255, 255, 255));
        conclusion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        conclusion.setForeground(new java.awt.Color(255, 102, 102));
        add(conclusion);
        conclusion.setBounds(500, 450, 370, 50);

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(990, 40, 240, 23);

        totalBalance.setBackground(new java.awt.Color(0, 0, 255));
        totalBalance.setForeground(new java.awt.Color(255, 255, 255));
        add(totalBalance);
        totalBalance.setBounds(650, 250, 450, 50);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Show My Balance");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(780, 330, 150, 23);
        add(card2);
        card2.setBounds(180, 160, 120, 30);

        jLabel3.setText("Card Number :");
        add(jLabel3);
        jLabel3.setBounds(40, 160, 90, 30);

        jLabel2.setText("Last Name");
        add(jLabel2);
        jLabel2.setBounds(40, 80, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\13303\\Downloads\\WebDevelopment-\\shopping-dog-29323674.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -60, 1330, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Integer i;
        Integer j=0;
        String firstName= card6.getText();
        String lastName= card1.getText();
        String cardNumber= card2.getText();
        String cvvNumber= card3.getText();
        String expiryDate= card4.getText();
        String zipCode= card5.getText();
        customers=gopher.getCustomers();
        for( i=0;i<customers.length-1;i++){
            if(customers[i].getFirstName().equals(firstName)&&customers[i].getLastName().equals(lastName)
            &&customers[i].getCardNumber().equals(cardNumber)&&customers[i].getCvvNumber().equals(cvvNumber)
            && customers[i].getZipCode().equals(zipCode)&&customers[i].getExpiryDate().equals(expiryDate)){
                this.mainFrame.nextToConclusion();
                j++;
            }
        }
        if(i>=customers.length || j==0){
            conclusion.setText("Sorry! Payment Failed");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.mainFrame.backToHomePanel();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Customer customer=gopher.getSingleCustomer(this.mainFrame.getIndex());
        Integer b= customer.getTotalBalance();
        totalBalance.setText("Your Balance : $ "+String.valueOf(b));
        totalBalance.setEditable(false);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField card1;
    private javax.swing.JTextField card2;
    private javax.swing.JTextField card3;
    private javax.swing.JTextField card4;
    private javax.swing.JTextField card5;
    private javax.swing.JTextField card6;
    private javax.swing.JLabel conclusion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField totalBalance;
    // End of variables declaration//GEN-END:variables
}
