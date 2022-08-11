package newpackage;
import java.awt.BorderLayout;

public class MainFrame extends javax.swing.JFrame {
    private signInPanel signInPanel;
    private createAccountCustomer create;
    private createAccountSeller createSeller;
    private HomePanel homePanel;
    PaymentPanel paymentPanel;
    conclusion Conclusion;
    private Integer index;
    
    public MainFrame() {
        initComponents();
        signInPanel = new signInPanel();
        this.signInPanel.setMainFrame(this);
        this.getContentPane().add(this.signInPanel, BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }
    public void setIndex(Integer index){
        this.index=index;
    }
    public Integer getIndex(){
        return this.index;
    }
    public void backToHomePanel(){
        this.getContentPane().remove(this.paymentPanel);
        this.getContentPane().add(this.homePanel,BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }
    public void nextToConclusion(){
        this.getContentPane().add(this.paymentPanel);
        Conclusion= new conclusion();
        Conclusion.setMainFrame(this);
        this.getContentPane().add(this.Conclusion,BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }
    public void paymentPanel(){
        this.getContentPane().remove(this.homePanel);
        paymentPanel= new PaymentPanel();
        paymentPanel.setMainFrame(this);
        this.getContentPane().add(this.paymentPanel,BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }
    public void HomePanel(){
        this.getContentPane().remove(this.signInPanel);
        homePanel= new HomePanel();
        homePanel.setMainFrame(this);
        this.getContentPane().add(this.homePanel,BorderLayout.CENTER);
        this.validate();
        this.repaint();
        
        
    }
    public void nextPanel() {
        this.getContentPane().remove(this.signInPanel);
        create= new createAccountCustomer();
        create.setMainFrame(this);
        this.getContentPane().add(this.create,BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }
    public void back(){
        this.getContentPane().remove(this.create);
        this.getContentPane().add(this.signInPanel,BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }
    public void nextToSeller(){
        this.getContentPane().remove(this.signInPanel);
        createSeller= new createAccountSeller();
        createSeller.setMainFrame(this);
        this.getContentPane().add(this.createSeller,BorderLayout.CENTER);
        this.validate();
        this.repaint();
        
    }
    public void backToMain(){
        this.getContentPane().remove(this.createSeller);
        this.getContentPane().add(this.signInPanel,BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenu3.setText("jMenu3");

        jMenuItem2.setText("jMenuItem2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
