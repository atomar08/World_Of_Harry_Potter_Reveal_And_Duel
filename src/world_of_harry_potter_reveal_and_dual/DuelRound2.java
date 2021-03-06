/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world_of_harry_potter_reveal_and_dual;

import javax.swing.JOptionPane;

/**
 *
 * @author Magical Me
 */
public class DuelRound2 extends javax.swing.JFrame {

    /**
     * Creates new form DuelRound2
     */
    public DuelRound2() {
        initComponents();
    }
    public DuelRound2(int score){
       initComponents();
   //   String[] enemies={"Tom Marvolo Riddle", " Hungarian Horntail", " Lucius Malfoy"," Draco Malfoy"," Severus Snape"};
      ScoreValueDisplayLabel.setText(String.valueOf(score));

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
        ScoreDummy = new javax.swing.JLabel();
        ScoreValueDisplayLabel = new javax.swing.JLabel();
        EnemyFactory = new javax.swing.JComboBox<>();
        DuelEnemyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        ScoreDummy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ScoreDummy.setText("Score:");
        jPanel1.add(ScoreDummy);
        ScoreDummy.setBounds(620, 100, 71, 22);

        ScoreValueDisplayLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jPanel1.add(ScoreValueDisplayLabel);
        ScoreValueDisplayLabel.setBounds(690, 90, 110, 30);

        EnemyFactory.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        EnemyFactory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Tom Morvolo Riddle", "Severus Snape", "Hungarian Horntail" }));
        EnemyFactory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnemyFactoryActionPerformed(evt);
            }
        });
        jPanel1.add(EnemyFactory);
        EnemyFactory.setBounds(210, 250, 340, 60);

        DuelEnemyButton.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        DuelEnemyButton.setText("Duel Enemy");
        DuelEnemyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuelEnemyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DuelEnemyButton);
        DuelEnemyButton.setBounds(290, 370, 170, 29);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Choose your enemy for Duel round 2...");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 150, 560, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnemyFactoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnemyFactoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnemyFactoryActionPerformed

    private void DuelEnemyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuelEnemyButtonActionPerformed
        // TODO add your handling code here:
        int score=Integer.parseInt(ScoreValueDisplayLabel.getText());
        JOptionPane.showMessageDialog(null, score);
       int enemyIndex=EnemyFactory.getSelectedIndex();
       if(enemyIndex==0)
           JOptionPane.showMessageDialog(null, "Select an enemy");
       else if (enemyIndex==1)
          new Basilisk().setScore(score);
       else if(enemyIndex==2)
           new SeverusSnape().setScore(score);
       else if(enemyIndex==3)
         new Horntail().setScore(score);
       else
           System.out.println("Error");
          
    }//GEN-LAST:event_DuelEnemyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DuelRound2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DuelRound2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DuelRound2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DuelRound2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DuelRound2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DuelEnemyButton;
    private javax.swing.JComboBox<String> EnemyFactory;
    private javax.swing.JLabel ScoreDummy;
    private javax.swing.JLabel ScoreValueDisplayLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
