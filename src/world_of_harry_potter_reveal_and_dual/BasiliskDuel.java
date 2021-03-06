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
public class BasiliskDuel extends javax.swing.JFrame {

    /**
     * Creates new form BasiliskDuel
     */
    public BasiliskDuel() {
        initComponents();
        
    }
    
   public BasiliskDuel(int score){
       initComponents();
       ScoreValueDisplayLabel.setText(String.valueOf(score));
        HarryLifeScoreLabel.setText("150");
      RiddleLifeScoreLabel.setText("150");
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
        KillBasiliskButton = new javax.swing.JButton();
        RetrieveDiaryButton = new javax.swing.JButton();
        DestroyDiaryButton = new javax.swing.JButton();
        AvadaKedavraButton = new javax.swing.JButton();
        SpeakParselTongueButton = new javax.swing.JButton();
        RiddleLifeDummyLabel = new javax.swing.JLabel();
        HarryLifeDummyLabel = new javax.swing.JLabel();
        HarryLifeScoreLabel = new javax.swing.JLabel();
        RiddleLifeScoreLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        ScoreDummy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ScoreDummy.setText("Score:");
        jPanel1.add(ScoreDummy);
        ScoreDummy.setBounds(700, 30, 58, 22);

        ScoreValueDisplayLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jPanel1.add(ScoreValueDisplayLabel);
        ScoreValueDisplayLabel.setBounds(770, 20, 100, 40);

        KillBasiliskButton.setBackground(new java.awt.Color(0, 0, 0));
        KillBasiliskButton.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        KillBasiliskButton.setForeground(new java.awt.Color(0, 255, 255));
        KillBasiliskButton.setText("Kill Basilisk");
        KillBasiliskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KillBasiliskButtonActionPerformed(evt);
            }
        });
        jPanel1.add(KillBasiliskButton);
        KillBasiliskButton.setBounds(60, 450, 250, 40);

        RetrieveDiaryButton.setBackground(new java.awt.Color(0, 0, 0));
        RetrieveDiaryButton.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        RetrieveDiaryButton.setForeground(new java.awt.Color(0, 255, 255));
        RetrieveDiaryButton.setText("Retrieve Diary");
        RetrieveDiaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrieveDiaryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RetrieveDiaryButton);
        RetrieveDiaryButton.setBounds(60, 510, 250, 40);

        DestroyDiaryButton.setBackground(new java.awt.Color(0, 0, 0));
        DestroyDiaryButton.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        DestroyDiaryButton.setForeground(new java.awt.Color(0, 255, 255));
        DestroyDiaryButton.setText("Destroy Diary");
        DestroyDiaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestroyDiaryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DestroyDiaryButton);
        DestroyDiaryButton.setBounds(60, 570, 250, 40);

        AvadaKedavraButton.setBackground(new java.awt.Color(0, 0, 0));
        AvadaKedavraButton.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        AvadaKedavraButton.setForeground(new java.awt.Color(0, 255, 255));
        AvadaKedavraButton.setText("Avada Kedavra");
        AvadaKedavraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvadaKedavraButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AvadaKedavraButton);
        AvadaKedavraButton.setBounds(570, 550, 230, 40);

        SpeakParselTongueButton.setBackground(new java.awt.Color(0, 0, 0));
        SpeakParselTongueButton.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        SpeakParselTongueButton.setForeground(new java.awt.Color(0, 255, 255));
        SpeakParselTongueButton.setText("Speak parseltongue");
        SpeakParselTongueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeakParselTongueButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SpeakParselTongueButton);
        SpeakParselTongueButton.setBounds(570, 610, 230, 30);

        RiddleLifeDummyLabel.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        RiddleLifeDummyLabel.setText("Life:");
        jPanel1.add(RiddleLifeDummyLabel);
        RiddleLifeDummyLabel.setBounds(580, 500, 60, 20);

        HarryLifeDummyLabel.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        HarryLifeDummyLabel.setText("Life:");
        jPanel1.add(HarryLifeDummyLabel);
        HarryLifeDummyLabel.setBounds(120, 400, 40, 20);

        HarryLifeScoreLabel.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jPanel1.add(HarryLifeScoreLabel);
        HarryLifeScoreLabel.setBounds(170, 400, 110, 30);
        jPanel1.add(RiddleLifeScoreLabel);
        RiddleLifeScoreLabel.setBounds(630, 500, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_harry_potter_reveal_and_dual/Harry_Duel.PNG"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(71, 80, 260, 300);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_harry_potter_reveal_and_dual/riddle.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(570, 50, 280, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetrieveDiaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrieveDiaryButtonActionPerformed
        // TODO add your handling code here:
        int riddleScore=Integer.parseInt(RiddleLifeScoreLabel.getText());
        riddleScore=riddleScore-10;
         RiddleLifeScoreLabel.setText(String.valueOf(riddleScore));
        if(riddleScore<=0){
            JOptionPane.showMessageDialog(null, "You have successfully defeated Riddle!  Congratulations!");
            int score=Integer.parseInt(ScoreValueDisplayLabel.getText())+200;
              if(score>1200){
            JFrame frame=new Congratulation();
            this.hide();
            frame.show();
        }
            if(score<=1200){
              
            JOptionPane.showMessageDialog(null, " Proceeding to the next reveal level");
              JFrame frame=new RevealL3Q1(score);
            this.hide();
            frame.show();
            }
        }
     String points=String.valueOf(riddleScore);
     RiddleLifeScoreLabel.setText(points);
    }//GEN-LAST:event_RetrieveDiaryButtonActionPerformed

    private void DestroyDiaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestroyDiaryButtonActionPerformed
        // TODO add your handling code here:
         int riddleScore=Integer.parseInt(RiddleLifeScoreLabel.getText());
        riddleScore=riddleScore-100;
         RiddleLifeScoreLabel.setText(String.valueOf(riddleScore));
        if(riddleScore<=0){
            JOptionPane.showMessageDialog(null, "You have successfully defeated Riddle!  Congratulations!");
            int score=Integer.parseInt(ScoreValueDisplayLabel.getText())+200;
              if(score>1200){
            JFrame frame=new Congratulation();
            this.hide();
            frame.show();
        }
            if(score<=1200){
              
            JOptionPane.showMessageDialog(null, " Proceeding to the next reveal level");
              JFrame frame=new RevealL3Q1(score);
            this.hide();
            frame.show();
            }
        }
     String points=String.valueOf(riddleScore);
     RiddleLifeScoreLabel.setText(points);
    }//GEN-LAST:event_DestroyDiaryButtonActionPerformed

    private void KillBasiliskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KillBasiliskButtonActionPerformed
        // TODO add your handling code here:
         int riddleScore=Integer.parseInt(RiddleLifeScoreLabel.getText());
        riddleScore=riddleScore-20;
        RiddleLifeScoreLabel.setText(String.valueOf(riddleScore));
        if(riddleScore<=0){
            JOptionPane.showMessageDialog(null, "You have successfully defeated Riddle!  Congratulations!");
            int score=Integer.parseInt(ScoreValueDisplayLabel.getText())+200;
               if(score>1200){
            JFrame frame=new Congratulation();
            this.hide();
            frame.show();
        }
            if(score<=1200){
              
            JOptionPane.showMessageDialog(null, " Proceeding to the next reveal level");
              JFrame frame=new RevealL3Q1(score);
            this.hide();
            frame.show();
            }
        }
     String points=String.valueOf(riddleScore);
     RiddleLifeScoreLabel.setText(points);
    }//GEN-LAST:event_KillBasiliskButtonActionPerformed

    private void AvadaKedavraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvadaKedavraButtonActionPerformed
        // TODO add your handling code here:
         int harryScore=Integer.parseInt(HarryLifeScoreLabel.getText());
        harryScore=harryScore-100;
        HarryLifeScoreLabel.setText(String.valueOf(harryScore));
        if(harryScore<=0){
            JOptionPane.showMessageDialog(null, "You have lost the battle.  Redirecting you to previous duel round");
            int score=Integer.parseInt(ScoreValueDisplayLabel.getText())-200;
            JFrame frame=new DuelRound1(score);
            this.hide();
            frame.show();
        }
     String points=String.valueOf(harryScore);
     HarryLifeScoreLabel.setText(points);
    }//GEN-LAST:event_AvadaKedavraButtonActionPerformed

    private void SpeakParselTongueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeakParselTongueButtonActionPerformed
        // TODO add your handling code here:
          int harryScore=Integer.parseInt(HarryLifeScoreLabel.getText());
          
        harryScore=harryScore-10;
        HarryLifeScoreLabel.setText(String.valueOf(harryScore));
        if(harryScore<=0){
            JOptionPane.showMessageDialog(null, "You have lost the battle.  Redirecting you to previous duel round");
            int score=Integer.parseInt(ScoreValueDisplayLabel.getText())-200;
            JFrame frame=new DuelRound1(score);
            this.hide();
            frame.show();
        }
     String points=String.valueOf(harryScore);
     HarryLifeScoreLabel.setText(points);
    }//GEN-LAST:event_SpeakParselTongueButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BasiliskDuel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasiliskDuel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasiliskDuel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasiliskDuel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasiliskDuel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvadaKedavraButton;
    private javax.swing.JButton DestroyDiaryButton;
    private javax.swing.JLabel HarryLifeDummyLabel;
    private javax.swing.JLabel HarryLifeScoreLabel;
    private javax.swing.JButton KillBasiliskButton;
    private javax.swing.JButton RetrieveDiaryButton;
    private javax.swing.JLabel RiddleLifeDummyLabel;
    private javax.swing.JLabel RiddleLifeScoreLabel;
    private javax.swing.JLabel ScoreDummy;
    private javax.swing.JLabel ScoreValueDisplayLabel;
    private javax.swing.JButton SpeakParselTongueButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
