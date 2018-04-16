/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Tomas
 */
public class Match{
    
    private int valueTo;
    private int valueAgainst;
    private Player p1;
    private Player p2;
    
    Match(Player p1, int score, Player p2, int score2){
        this.p1 = p1;
        this.valueTo = score;
        this.p2 = p2;
        this.valueAgainst = score2;
    }
    
    void setValueTo(int score){
        this.valueTo = score;
    }
    
    void setValueAgainst(int score){
        this.valueAgainst = score;
    }
    
    int getValueTo(){
        return this.valueTo;
    }
    
    int getValueAgainst(){
        return this.valueAgainst;
    }

    Player getP1(){
        return this.p1;
    }
    
    Player getP2(){
        return this.p2;
    }
}
