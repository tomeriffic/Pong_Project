/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Tomas
 */
public class Player {
    
    private String name;
    private int seed;
    List<Match> scores;
    
    /**
     * 
     * @param name name of the player created 
     */
    Player(String name) {
        this.name = name;
        this.seed = 0;
        this.scores = new ArrayList<>();
    }
    
    String getName(){
        return this.name;
    }
    
    int getSeed(){
        return this.seed;
    }
    
    
    
    
    
    
}
