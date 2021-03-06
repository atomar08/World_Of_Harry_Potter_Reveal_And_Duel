/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world_of_harry_potter_reveal_and_dual;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Magical Me
 */
public class RevealL3Q3 extends javax.swing.JFrame {
    private int score;

    /**
     * Creates new form RevealL3Q3
     */
    public RevealL3Q3() {
        initComponents();
    }
   
    public RevealL3Q3(int score){
        initComponents();
        ScoreDisplayLabel.setText(String.valueOf(score));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ScoreDisplayLabel = new javax.swing.JLabel();
        UnicornButton = new javax.swing.JButton();
        NaginiButton = new javax.swing.JButton();
        AnswerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        ScoreDisplayLabel.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jPanel2.add(ScoreDisplayLabel);
        ScoreDisplayLabel.setBounds(720, 50, 200, 40);

        UnicornButton.setBackground(new java.awt.Color(0, 0, 0));
        UnicornButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        UnicornButton.setForeground(new java.awt.Color(255, 255, 255));
        UnicornButton.setText("Unicorn");
        UnicornButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnicornButtonActionPerformed(evt);
            }
        });
        jPanel2.add(UnicornButton);
        UnicornButton.setBounds(610, 460, 350, 100);

        NaginiButton.setBackground(new java.awt.Color(0, 0, 0));
        NaginiButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        NaginiButton.setForeground(new java.awt.Color(255, 255, 255));
        NaginiButton.setText("Nagini");
        NaginiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaginiButtonActionPerformed(evt);
            }
        });
        jPanel2.add(NaginiButton);
        NaginiButton.setBounds(10, 180, 300, 90);

        AnswerButton.setBackground(new java.awt.Color(0, 0, 0));
        AnswerButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        AnswerButton.setForeground(new java.awt.Color(255, 255, 255));
        AnswerButton.setText("Thestral");
        AnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AnswerButton);
        AnswerButton.setBounds(340, 300, 320, 90);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Round 3 : Reveal");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(360, 20, 220, 40);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("3) Which one of these magical creatures is invisible?");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(150, 120, 640, 50);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("SCORE:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(620, 50, 110, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnicornButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnicornButtonActionPerformed
        // TODO add your handling code here:
        int score=Integer.parseInt(ScoreDisplayLabel.getText());
        JOptionPane.showMessageDialog(null, "Wrong answer");
        JFrame newFrame=new RevealL3Q4(score);
        newFrame.show();
        this.dispose();
    }//GEN-LAST:event_UnicornButtonActionPerformed

    private void NaginiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaginiButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        score=Integer.parseInt(ScoreDisplayLabel.getText());
        JOptionPane.showMessageDialog(null, "Wrong Answer!");
        JFrame newFrame=new RevealL3Q4(score);
        newFrame.setVisible(true);
    }//GEN-LAST:event_NaginiButtonActionPerformed

    private void AnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerButtonActionPerformed
        // TODO add your handling code here:
        score=Integer.parseInt(ScoreDisplayLabel.getText())+100;
        JOptionPane.showMessageDialog(null, "Correct");
        JFrame newFrame=new RevealL3Q4(score);
        newFrame.show();
        this.dispose();
    }//GEN-LAST:event_AnswerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RevealL3Q3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RevealL3Q3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RevealL3Q3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RevealL3Q3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RevealL3Q3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnswerButton;
    private javax.swing.JButton NaginiButton;
    private javax.swing.JLabel ScoreDisplayLabel;
    private javax.swing.JButton UnicornButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
