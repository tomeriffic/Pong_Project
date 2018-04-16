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
public class JavaApplication1{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //while isExitCode is true program will run
        boolean isExitCode = true;
        //Interface
        Interface intr = new Interface();
        PlayerList pl = new PlayerList();
        MatchList ml = new MatchList();
        
        //
        pl.initialiseList();

//Will need to add function to Read from file initially to initialise list
        
        while(isExitCode){
            intr.printWelcome();
            switch(intr.getIntegerFromConsole()){
                //Create Player Entry
                case 1: 
                        //turn username into player
                        Player newPlayer = new Player(intr.getPlayerFromConsole());
                        //Add Player to list
                        pl.addPlayerToList(newPlayer);
                        //Print username
                        System.out.println("Your username is " + newPlayer.getName());
                        break;
                //Create Score Entry
                case 2: 
                        int playerIndex1 = -1;
                        String pName1;
                        Player p1 = null;
                        
                        int playerIndex2 = -1;
                        String pName2;
                        Player p2 = null;
                        
                        //Enter Player Name Message
                        pName1 = intr.enterPlayer(pl);
                        if (!(pName1.equals("Error"))) {
                            playerIndex1 = pl.getPlayerNameIndexNumber(pName1);
                            if (playerIndex1 == -1){System.out.println("User is Not in Player List");}
                            p1 = pl.getPlayerFromList(playerIndex1);
                        }
                        else {
                            System.out.println("User Does Not Exist");
                        }
                        
                        //Enter Player Name Message
                        pName2 = intr.enterPlayer(pl);
                        if (!(pName2.equals("Error"))) {
                            playerIndex2 = pl.getPlayerNameIndexNumber(pName2);
                            if (playerIndex2 == -1){System.out.println("User is Not in Player List");}
                            p2 = pl.getPlayerFromList(playerIndex2);
                        }
                        else {
                            System.out.println("User Does Not Exist");
                        }
                        
                        
                        int p1score = intr.enterScore(p1);
                        int p2score = intr.enterScore(p2);
                        
                        // Success Both Players are legal values
                        Match match = new Match(p1, p1score, p2, p2score);
                        ml.addMatchToList(match);
                            
                        break;
                        
                //Exit Program
                case 3: isExitCode = false;
                        break;
                //Dev Print List of Players         
                case 4:
                    for(int i = 0; i < pl.getPlayerListSize(); i++) {
                        System.out.println(pl.getPlayerFromList(i).getName());
                    }
                    break;
                case 5: ml.printMatchListHistory();
                        break;
                    
            }
            System.out.print("\n\n");
            
        }
    } 
}

