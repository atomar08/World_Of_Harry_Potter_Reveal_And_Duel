/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world_of_harry_potter_reveal_and_dual;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Magical Me
 */
public class FirstPage extends javax.swing.JFrame {
    String player_name;
    List<String> playerList=new ArrayList<>();

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public List<String> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<String> playerList) {
        this.playerList = playerList;
    }
    

    /**
     * Creates new form FirstPage
     */
    public FirstPage() {
        initComponents();
        this.setSize(850, 600);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MainHeadingLabel = new javax.swing.JLabel();
        SubheadingLabel = new javax.swing.JLabel();
        NewGameButton = new javax.swing.JButton();
        AdminLoginButton = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(254, 254, 223));
        jPanel1.setLayout(null);

        MainHeadingLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MainHeadingLabel.setForeground(new java.awt.Color(0, 0, 204));
        MainHeadingLabel.setText("WORLD OF HARRY POTTER");
        jPanel1.add(MainHeadingLabel);
        MainHeadingLabel.setBounds(490, 80, 350, 71);

        SubheadingLabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        SubheadingLabel.setText("Reveal & Duel");
        jPanel1.add(SubheadingLabel);
        SubheadingLabel.setBounds(550, 160, 234, 42);

        NewGameButton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        NewGameButton.setText("NEW GAME");
        NewGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NewGameButton);
        NewGameButton.setBounds(580, 320, 175, 27);

        AdminLoginButton.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        AdminLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_harry_potter_reveal_and_dual/bgrnd.gif"))); // NOI18N
        jPanel1.add(AdminLoginButton);
        AdminLoginButton.setBounds(10, -10, 840, 590);

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton1.setText("ADMIN LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 370, 170, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameButtonActionPerformed
        // TODO add your handling code here:
       String name= JOptionPane.showInputDialog("Welcome!  Please enter your name to start");
       this.setPlayer_name(name);
       JFrame nextGameFrame=new InstructionFrame();
       nextGameFrame.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_NewGameButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JFrame nextGameFrame=new  AdminLogin();
            nextGameFrame.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPage().setVisible(true);
  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLoginButton;
    private javax.swing.JLabel MainHeadingLabel;
    private javax.swing.JButton NewGameButton;
    private javax.swing.JLabel SubheadingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
