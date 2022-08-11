package newpackage;
import gopher.Gopher;
import gopher.Lottery;
import static gopher.randomNumber.getRandomNumber;
public class conclusion extends javax.swing.JPanel {
    public MainFrame mainFrame;
    Gopher gopher= new Gopher();
    Lottery lottery= new Lottery();
    
    public conclusion() {
        gopher.start();
        initComponents();
        conclusion1.setText("Congratulation! Payment succeded");
         lottery.setLotteryNumber(getRandomNumber(400,100));
        newLottery.setText(String.valueOf(lottery.getLotteryNumber()));
    }
    public void setMainFrame(MainFrame mainFrame){
        this.mainFrame= mainFrame;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        conclusion1 = new javax.swing.JLabel();
        newLottery = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Your Lottery Number:");
        add(jLabel2);
        jLabel2.setBounds(90, 230, 390, 50);

        conclusion1.setBackground(new java.awt.Color(51, 0, 51));
        conclusion1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        conclusion1.setForeground(new java.awt.Color(255, 0, 0));
        add(conclusion1);
        conclusion1.setBounds(90, 450, 930, 130);

        newLottery.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        newLottery.setForeground(new java.awt.Color(255, 0, 51));
        add(newLottery);
        newLottery.setBounds(500, 230, 220, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\13303\\Downloads\\WebDevelopment-\\zayn.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -90, 1440, 930);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conclusion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel newLottery;
    // End of variables declaration//GEN-END:variables
}
