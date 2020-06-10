/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world_of_harry_potter_reveal_and_dual;

import javax.swing.JFrame;

/**
 *
 * @author Magical Me
 */
public class SeverusSnape implements EnemySelectionInterface {
     private int score;
    
    public SeverusSnape(){
       // score=this.score;
        createEnemyForDuel();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
       JFrame newFrame =new SnapeDuel(getScore());

       newFrame.show();
       
    }
    

    @Override
    public void createEnemyForDuel() {

        
    }

   
    
}
