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
public class PlayerList {
    
        private List<Player> playerList;
        
        PlayerList(){
            //List of players
            playerList = new ArrayList<>();
        }
        
        void addPlayerToList(Player p){
            this.playerList.add(p);
        }
        
        int getPlayerListSize(){
            return this.playerList.size();
        }
        
        Player getPlayerFromList(int index){
            return this.playerList.get(index);
        }
        
        int getPlayerNameIndexNumber(String p){
            int i;
            for (i = 0; i < getPlayerListSize(); i++){
                
                if(p.equals(this.playerList.get(i).getName()))
                {
                    return i;
                }
            }
            return -1;
        }
        
        boolean doesPlayerNameExist(String p){
            for (int i = 0; i < getPlayerListSize(); i++)
            {
                
                if (p.equals(this.playerList.get(i).getName()))
                {
                    return true;
                }
            }
            return false;
        }
        
        void initialiseList(){
            Player Tom = new Player("Tom");
            this.playerList.add(Tom);
            Player Ram = new Player("Ram");
            this.playerList.add(Ram);
            Player Elvin = new Player("Elvin");
            this.playerList.add(Elvin);
            Player Martin = new Player("Martin");
            this.playerList.add(Martin);
        }
}
