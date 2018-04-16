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
public class MatchList{
    
    
    private List<Match> matchList;
    
    MatchList(){
            //List of players
            matchList = new ArrayList<>();
        }
    
    void addMatchToList(Match m){
        this.matchList.add(m);
    }
    
    void printMatchListHistory()
    {
        for(int i = 0; i < this.matchList.size(); i++)
        {
            System.out.println("Match: " 
                                + matchList.get(i).getP1().getName()
                                + " "
                                + matchList.get(i).getValueTo()
                                + " vs " 
                                + matchList.get(i).getValueAgainst()
                                + " "
                                + matchList.get(i).getP2().getName());
        }
    }
}
