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
public class EnemyFactory implements EnemyFactoryIF{
    private int score;
    private String name;

    EnemyFactory(String name,int score) {
       this.name=name;
       this.score=score;
        buildEnemyObject(name);
         }
    
         
          
        
    public int getScore(){
        return score;
    }

   

    @Override
    public EnemySelectionInterface buildEnemyObject(String name) {
          EnemySelectionInterface enemyObj;
          
        if(name.equalsIgnoreCase("Tom Riddle")){
            enemyObj=new Basilisk();
            }
        else if(name.equalsIgnoreCase("Snape"))
            enemyObj=new SeverusSnape();
        else
            enemyObj=new Horntail();
        
    
       return enemyObj;
}
}
