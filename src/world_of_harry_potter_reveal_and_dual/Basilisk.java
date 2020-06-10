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
public class Basilisk implements EnemySelectionInterface {
    private int score;
    JFrame newFrame;
   
    
    public Basilisk(){
    
        createEnemyForDuel();
    }

    Basilisk(int score) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        newFrame=new BasiliskDuel(getScore());       
        newFrame.show();
        
       
    }
    

    @Override
    public void createEnemyForDuel() {
        JOptionPane.showMessageDialog(null, " Face Enemy: TomRiddle");
    }
    
}
