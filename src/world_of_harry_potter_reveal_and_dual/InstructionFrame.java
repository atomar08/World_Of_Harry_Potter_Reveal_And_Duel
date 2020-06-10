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
public class InstructionFrame extends javax.swing.JFrame {
    private String character;
    private String weapon;

    /**
     * Creates new form InstructionFrame
     */
    
    
    public InstructionFrame() {
        initComponents();
        Admin admin=new Admin();
        Rule1Label.setText(admin.getRule1());
        Rule2Label.setText(admin.getRule2());
        Rule3Label.setText(admin.getRule3());
        Rule4Label.setText(admin.getRule4());
        Rule5Label.setText(admin.getRule5());
        Rule6Label.setText(admin.getRule6());
        Rule7Label.setText(admin.getRule7());
        character="Harry Potter";
        weapon="Wand";
       
    }
    
    public InstructionFrame(String newInstruction){
         initComponents();
        Admin admin=new Admin();
        Rule1Label.setText(admin.getRule1());
        Rule2Label.setText(admin.getRule2());
        Rule3Label.setText(admin.getRule3());
        Rule4Label.setText(admin.getRule4());
        Rule5Label.setText(admin.getRule5());
        Rule6Label.setText(admin.getRule6());
        Rule7Label.setText(admin.getRule7());
        character="Harry Potter";
        weapon="Wand";
        newLabel.setText(newInstruction);
    }

    public String getCharacter() {
        return character;
    }

    public String getWeapon() {
        return weapon;
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
        jLabel1 = new javax.swing.JLabel();
        MainHeadingLabel = new javax.swing.JLabel();
        SubheadingLabel = new javax.swing.JLabel();
        Rule1Label = new javax.swing.JLabel();
        Rule2Label = new javax.swing.JLabel();
        Rule3Label = new javax.swing.JLabel();
        Rule4Label = new javax.swing.JLabel();
        Rule5Label = new javax.swing.JLabel();
        Rule6Label = new javax.swing.JLabel();
        Rule7Label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        newLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_harry_potter_reveal_and_dual/flag.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(560, 50, 420, 560);

        MainHeadingLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MainHeadingLabel.setForeground(new java.awt.Color(0, 0, 204));
        MainHeadingLabel.setText("WORLD OF HARRY POTTER");
        jPanel1.add(MainHeadingLabel);
        MainHeadingLabel.setBounds(310, 10, 350, 71);

        SubheadingLabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        SubheadingLabel.setText("Reveal & Duel");
        jPanel1.add(SubheadingLabel);
        SubheadingLabel.setBounds(360, 80, 234, 42);

        Rule1Label.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        Rule1Label.setText("jLabel2");
        jPanel1.add(Rule1Label);
        Rule1Label.setBounds(40, 170, 500, 30);

        Rule2Label.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        Rule2Label.setText("jLabel3");
        jPanel1.add(Rule2Label);
        Rule2Label.setBounds(40, 220, 510, 40);

        Rule3Label.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        Rule3Label.setText("jLabel4");
        jPanel1.add(Rule3Label);
        Rule3Label.setBounds(40, 280, 520, 50);

        Rule4Label.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        Rule4Label.setText("jLabel5");
        jPanel1.add(Rule4Label);
        Rule4Label.setBounds(40, 350, 510, 40);

        Rule5Label.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        Rule5Label.setText("jLabel6");
        jPanel1.add(Rule5Label);
        Rule5Label.setBounds(40, 420, 500, 40);

        Rule6Label.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        Rule6Label.setText("jLabel7");
        jPanel1.add(Rule6Label);
        Rule6Label.setBounds(40, 480, 560, 40);

        Rule7Label.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        Rule7Label.setText("jLabel8");
        jPanel1.add(Rule7Label);
        Rule7Label.setBounds(40, 540, 860, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setText("Next >>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(740, 600, 140, 37);

        newLabel.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jPanel1.add(newLabel);
        newLabel.setBounds(40, 591, 520, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "The basic character set for level 1 is :"+this.getCharacter());
        JOptionPane.showMessageDialog(null, "The basic weapon set for level 1 is :"+this.getWeapon());
        JFrame newFrame=new RevealL1Q1();
        newFrame.show();
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
            java.util.logging.Logger.getLogger(InstructionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructionFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainHeadingLabel;
    private javax.swing.JLabel Rule1Label;
    private javax.swing.JLabel Rule2Label;
    private javax.swing.JLabel Rule3Label;
    private javax.swing.JLabel Rule4Label;
    private javax.swing.JLabel Rule5Label;
    private javax.swing.JLabel Rule6Label;
    private javax.swing.JLabel Rule7Label;
    private javax.swing.JLabel SubheadingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newLabel;
    // End of variables declaration//GEN-END:variables
}