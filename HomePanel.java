/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import gopher.Customer;
import gopher.Gopher;
import gopher.Items;
import gopher.Seller;




public class HomePanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    Items item;
    Integer numberOfItem1=0;
    Integer numberOfItems2=0;
    Seller seller;
    Gopher gopher= new Gopher();
    public HomePanel() {
         gopher.start();
        initComponents();
     }
    
    public void setMainFrame(MainFrame mainFrame){
        this.mainFrame= mainFrame;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feature1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        selected1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        field2 = new javax.swing.JTextPane();
        jButton5 = new javax.swing.JButton();
        selected2 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        addToCart2 = new javax.swing.JButton();
        price1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        price2 = new javax.swing.JLabel();
        numberOfItem = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        paymentResult = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newBalance = new javax.swing.JLabel();
        numberOfItems = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        field1 = new javax.swing.JTextPane();
        priceAfterDiscount = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addToCard1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        feature1.setBackground(new java.awt.Color(0, 51, 255));
        feature1.setForeground(new java.awt.Color(255, 255, 255));
        feature1.setText("Show features");
        feature1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feature1ActionPerformed(evt);
            }
        });
        add(feature1);
        feature1.setBounds(20, 400, 120, 23);

        jButton4.setText("Mac Book Air");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(490, 170, 130, 30);

        jButton3.setBackground(new java.awt.Color(0, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Buy with one click");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(970, 530, 150, 23);

        selected1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        selected1.setForeground(new java.awt.Color(51, 51, 255));
        add(selected1);
        selected1.setBounds(1130, 80, 150, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\13303\\Downloads\\WebDevelopment-\\MacBook.png")); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(500, 0, 200, 140);

        jScrollPane1.setViewportView(field2);

        add(jScrollPane1);
        jScrollPane1.setBounds(460, 230, 330, 150);

        jButton5.setBackground(new java.awt.Color(51, 0, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Show Features");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(460, 410, 120, 23);

        selected2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        selected2.setForeground(new java.awt.Color(0, 51, 255));
        add(selected2);
        selected2.setBounds(1120, 180, 160, 50);

        balance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        balance.setForeground(new java.awt.Color(51, 51, 255));
        add(balance);
        balance.setBounds(1120, 330, 130, 40);

        addToCart2.setBackground(new java.awt.Color(0, 0, 255));
        addToCart2.setForeground(new java.awt.Color(255, 255, 255));
        addToCart2.setText("Add to Cart");
        addToCart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCart2ActionPerformed(evt);
            }
        });
        add(addToCart2);
        addToCart2.setBounds(660, 170, 100, 30);

        price1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(price1);
        price1.setBounds(180, 90, 100, 40);

        jButton1.setText("Jeans");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(30, 170, 80, 30);

        price2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(price2);
        price2.setBounds(730, 100, 100, 40);

        numberOfItem.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        numberOfItem.setForeground(new java.awt.Color(0, 0, 255));
        add(numberOfItem);
        numberOfItem.setBounds(990, 80, 60, 50);

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Remove");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(1170, 530, 100, 23);

        button6.setBackground(new java.awt.Color(51, 0, 255));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("Click here to SeeYour new Balance if you make this purchase");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        add(button6);
        button6.setBounds(320, 510, 420, 30);

        paymentResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentResult.setForeground(new java.awt.Color(255, 0, 0));
        add(paymentResult);
        paymentResult.setBounds(900, 590, 380, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Original Price :");
        add(jLabel5);
        jLabel5.setBounds(850, 330, 160, 50);

        newBalance.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add(newBalance);
        newBalance.setBounds(120, 490, 180, 60);

        numberOfItems.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        numberOfItems.setForeground(new java.awt.Color(0, 0, 255));
        add(numberOfItems);
        numberOfItems.setBounds(990, 180, 60, 50);

        jScrollPane2.setViewportView(field1);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 230, 330, 150);

        priceAfterDiscount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        priceAfterDiscount.setForeground(new java.awt.Color(51, 51, 255));
        add(priceAfterDiscount);
        priceAfterDiscount.setBounds(1120, 420, 150, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("NUMBER OF ITEMS");
        add(jLabel6);
        jLabel6.setBounds(920, 20, 180, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("New price after Discount :");
        add(jLabel7);
        jLabel7.setBounds(850, 420, 230, 50);

        addToCard1.setBackground(new java.awt.Color(0, 0, 204));
        addToCard1.setForeground(new java.awt.Color(255, 255, 255));
        addToCard1.setText("Add to Cart");
        addToCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCard1ActionPerformed(evt);
            }
        });
        add(addToCard1);
        addToCard1.setBounds(130, 170, 110, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("SELECTED ITEMS");
        add(jLabel4);
        jLabel4.setBounds(1120, 10, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\13303\\Downloads\\WebDevelopment-\\jeans.jpg")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(20, 0, 160, 130);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\13303\\Downloads\\WebDevelopment-\\plain.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -100, 1440, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void feature1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feature1ActionPerformed
        // TODO add your handling code here:
       
         seller= gopher.getSeller(0);
         String item1= seller.getSingleFeature(0);
         field1.setText(item1);
         field1.setEditable(false);
        
    }//GEN-LAST:event_feature1ActionPerformed

    private void addToCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCard1ActionPerformed
        // TODO add your handling code here:
          Customer customer= gopher.getSingleCustomer(this.mainFrame.getIndex());
          seller= gopher.getSeller(0);
          String s= seller.getSingleItem(0);
          Integer i=seller.getSinglePrice(0);
          seller.setSelectedItems(s,0);
          customer.setSelectedTotalPrice(i);
          customer.setSelectedCustomerItems(s,0);
          String [] items=customer.getSelectedCustomerItems();
          selected1.setText(items[0]);
          ++numberOfItem1;
          numberOfItem.setText(String.valueOf(numberOfItem1));
          Integer total= customer.getSelectedTotalPrice();
          balance.setText("$ "+String.valueOf(total));
          Integer []discount= seller.getDiscount();
          customer.setPriceAfterDiscount(discount[0]);
          Integer newPrice= customer.getPriceAfterDiscount();
          priceAfterDiscount.setText("$ "+String.valueOf(newPrice));
          
       
          
         
          
    }//GEN-LAST:event_addToCard1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Customer customer= gopher.getSingleCustomer(this.mainFrame.getIndex());
        Integer i=0;
        if(customer.getSelectedTotalPrice()<=customer.getTotalBalance()){
        this.mainFrame.paymentPanel();
        i++;
        }
        if(i==0){
            paymentResult.setText("Sorry! You don't have enough balance");
        }
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addToCart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCart2ActionPerformed
        // TODO add your handling code here:
          seller= gopher.getSeller(1);
          String s= seller.getSingleItem(0);
          seller.setSelectedItems(s,0);
          Integer i=seller.getSinglePrice(0);
          Customer customer= gopher.getSingleCustomer(this.mainFrame.getIndex());
          customer.setSelectedTotalPrice(i);
          customer.setSelectedCustomerItems(s,1);
          String [] items1=customer.getSelectedCustomerItems();
          selected2.setText(items1[1]);
          ++numberOfItems2;
          numberOfItems.setText(String.valueOf(numberOfItems2));
          Integer total= customer.getSelectedTotalPrice();
          balance.setText("$ "+String.valueOf(total));
          Integer []discount= seller.getDiscount();
          customer.setPriceAfterDiscount(discount[0]);
          Integer newPrice= customer.getPriceAfterDiscount();
          priceAfterDiscount.setText("$ "+String.valueOf(newPrice));
         
          
          
    }//GEN-LAST:event_addToCart2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        seller= gopher.getSeller(1);
         String item1= seller.getSingleFeature(0);
         field2.setText(item1);
         field2.setEditable(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        seller=gopher.getSeller(0);
        Integer price= seller.getSinglePrice(0);
        price1.setText("$"+String.valueOf(price));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         seller=gopher.getSeller(1);
        Integer price= seller.getSinglePrice(0);
        price2.setText("$"+String.valueOf(price));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        Customer customer= gopher.getSingleCustomer(this.mainFrame.getIndex());
        customer.setRemainingBalance();
        Integer i= customer.getRemainingBalance();
        newBalance.setText(String.valueOf("$ "+i));
        
     
    }//GEN-LAST:event_button6ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Customer customers[]= gopher.getCustomers();
        Customer customer= customers[this.mainFrame.getIndex()];
        String items[]= customer.getSelectedCustomerItems();
        for(Integer i=0;i<items.length;i++){
            items[i]=null;
        }
        selected1.setText(items[0]);
        selected2.setText(items[1]);
        Integer b= customer.getRemainingBalance()+customer.getPriceAfterDiscount() ;
        customer.setTotalBalance(b);
        newBalance.setText("$ "+String.valueOf(b));
        customer.makeSelectedToNull(0);
        customer.setPriceAfterDiscountForNoSelection(0);
        priceAfterDiscount.setText("");
        balance.setText("");
        numberOfItem1=0;
        numberOfItems2=0;
        numberOfItem.setText("");
        numberOfItems.setText(String.valueOf(""));
        
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCard1;
    private javax.swing.JButton addToCart2;
    private javax.swing.JLabel balance;
    private javax.swing.JButton button6;
    private javax.swing.JButton feature1;
    private javax.swing.JTextPane field1;
    private javax.swing.JTextPane field2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel newBalance;
    private javax.swing.JLabel numberOfItem;
    private javax.swing.JLabel numberOfItems;
    private javax.swing.JLabel paymentResult;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel priceAfterDiscount;
    private javax.swing.JLabel selected1;
    private javax.swing.JLabel selected2;
    // End of variables declaration//GEN-END:variables
}
