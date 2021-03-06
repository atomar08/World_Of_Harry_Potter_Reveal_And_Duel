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
public class RevealL3Q1 extends javax.swing.JFrame {
    private int score;

    /**
     * Creates new form RevealL3Q1
     */
    public RevealL3Q1() {
        initComponents();
    }
    
    public RevealL3Q1(int score){
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
        HundredButton = new javax.swing.JButton();
        TenButton = new javax.swing.JButton();
        AnswerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        ScoreDisplayLabel.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        ScoreDisplayLabel.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(ScoreDisplayLabel);
        ScoreDisplayLabel.setBounds(770, 40, 120, 40);

        HundredButton.setBackground(new java.awt.Color(0, 0, 0));
        HundredButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        HundredButton.setForeground(new java.awt.Color(255, 255, 255));
        HundredButton.setText("100");
        HundredButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HundredButtonActionPerformed(evt);
            }
        });
        jPanel2.add(HundredButton);
        HundredButton.setBounds(280, 310, 350, 100);

        TenButton.setBackground(new java.awt.Color(0, 0, 0));
        TenButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        TenButton.setForeground(new java.awt.Color(255, 255, 255));
        TenButton.setText("10");
        TenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenButtonActionPerformed(evt);
            }
        });
        jPanel2.add(TenButton);
        TenButton.setBounds(10, 180, 300, 90);

        AnswerButton.setBackground(new java.awt.Color(0, 0, 0));
        AnswerButton.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        AnswerButton.setForeground(new java.awt.Color(255, 255, 255));
        AnswerButton.setText("150");
        AnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AnswerButton);
        AnswerButton.setBounds(590, 460, 320, 90);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Round 3 : Reveal");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(400, 10, 210, 40);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("1) How many points do you earn if you catch the golden snitch?");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(100, 120, 760, 29);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("SCORE:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(670, 50, 110, 29);

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

    private void HundredButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HundredButtonActionPerformed
        // TODO add your handling code here:
        int score=Integer.parseInt(ScoreDisplayLabel.getText());
        JOptionPane.showMessageDialog(null, "Wrong answer");
        JFrame newFrame=new RevealL3Q2(score);
        newFrame.show();
        this.dispose();
    }//GEN-LAST:event_HundredButtonActionPerformed

    private void TenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        score=Integer.parseInt(ScoreDisplayLabel.getText());
        JOptionPane.showMessageDialog(null, "Wrong Answer!");
        JFrame newFrame=new RevealL3Q2(score);
        newFrame.setVisible(true);
    }//GEN-LAST:event_TenButtonActionPerformed

    private void AnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerButtonActionPerformed
        // TODO add your handling code here:
        score=Integer.parseInt(ScoreDisplayLabel.getText())+100;
        JOptionPane.showMessageDialog(null, "Correct");
        JFrame newFrame=new RevealL3Q2(score);
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
            java.util.logging.Logger.getLogger(RevealL3Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RevealL3Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RevealL3Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RevealL3Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RevealL3Q1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnswerButton;
    private javax.swing.JButton HundredButton;
    private javax.swing.JLabel ScoreDisplayLabel;
    private javax.swing.JButton TenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
