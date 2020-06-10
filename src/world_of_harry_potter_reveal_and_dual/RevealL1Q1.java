package world_of_harry_potter_reveal_and_dual;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class RevealL1Q1 extends javax.swing.JFrame {
private int score=0;

    public int getScore() {
        return score;
    }
    
    public void setScore(int score){
        this.score=score;
    }

   public RevealL1Q1() {
        initComponents();
    //  score=new GameTest().getScore();
        //JOptionPane.showMessageDialog(null,score);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        ScoreDisplayLabel = new javax.swing.JLabel();
        KreacherButton = new javax.swing.JButton();
        DobbyButton = new javax.swing.JButton();
        WinkyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        ScoreDisplayLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ScoreDisplayLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(ScoreDisplayLabel);
        ScoreDisplayLabel.setBounds(770, 40, 120, 40);

        KreacherButton.setBackground(new java.awt.Color(0, 0, 0));
        KreacherButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        KreacherButton.setForeground(new java.awt.Color(255, 255, 255));
        KreacherButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_harry_potter_reveal_and_dual/Kreacher.jpg"))); // NOI18N
        KreacherButton.setText("Kreacher");
        KreacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KreacherButtonActionPerformed(evt);
            }
        });
        jPanel2.add(KreacherButton);
        KreacherButton.setBounds(60, 170, 280, 260);

        DobbyButton.setBackground(new java.awt.Color(0, 0, 0));
        DobbyButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        DobbyButton.setForeground(new java.awt.Color(255, 255, 255));
        DobbyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_harry_potter_reveal_and_dual/dobby.png"))); // NOI18N
        DobbyButton.setText("Dobby");
        DobbyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DobbyButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DobbyButton);
        DobbyButton.setBounds(360, 330, 290, 260);

        WinkyButton.setBackground(new java.awt.Color(0, 0, 0));
        WinkyButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        WinkyButton.setForeground(new java.awt.Color(255, 255, 255));
        WinkyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_harry_potter_reveal_and_dual/winky.jpg"))); // NOI18N
        WinkyButton.setText("Winky");
        WinkyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WinkyButtonActionPerformed(evt);
            }
        });
        jPanel2.add(WinkyButton);
        WinkyButton.setBounds(660, 170, 280, 250);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Round 1: Reveal");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(440, 20, 140, 40);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("1) The House elf who warned Harry about the Chamber of Secrets is ...");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(200, 110, 650, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("SCORE:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(700, 50, 80, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KreacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KreacherButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Wrong answer");
        score=0;
        ScoreDisplayLabel.setText(String.valueOf(score));
            JFrame newFrame=new RevealL1Q2(score);
            newFrame.show();
            this.dispose();
    }//GEN-LAST:event_KreacherButtonActionPerformed

    private void DobbyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DobbyButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        score=getScore()+50;
          ScoreDisplayLabel.setText(String.valueOf(score));

        JOptionPane.showMessageDialog(null, "You have gained "  + score+" points ");
            JFrame newFrame=new RevealL1Q2(score);
            newFrame.setVisible(true);      
    }//GEN-LAST:event_DobbyButtonActionPerformed

    private void WinkyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WinkyButtonActionPerformed
        // TODO add your handling code here:
        score=0;
          ScoreDisplayLabel.setText(String.valueOf(score));

        JOptionPane.showMessageDialog(null, "Wrong answer");
            JFrame newFrame=new RevealL1Q2(score);
            newFrame.show();
            this.dispose();
    }//GEN-LAST:event_WinkyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RevealL1Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RevealL1Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RevealL1Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RevealL1Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RevealL1Q1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DobbyButton;
    private javax.swing.JButton KreacherButton;
    private javax.swing.JLabel ScoreDisplayLabel;
    private javax.swing.JButton WinkyButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
