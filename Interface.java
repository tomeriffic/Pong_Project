/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Interface 
{
    
        //Scanner object to read from console
        Scanner scanner = new Scanner(System.in);
    
    Interface(){}
    
    void printWelcome(){
            System.out.println("Welcome to Pong Buddy");
            System.out.println("Enter 1 to create player");
            System.out.println("Enter 2 to enter score");
            System.out.println("Enter 3 to exit");
    }
   
    int getIntegerFromConsole(){
        
        //Input Values
        String inputDecision = null;
        
        try{
                inputDecision = scanner.nextLine();
            }
            catch(Exception e){
                System.out.println("Wrong Input, Enter Numeric!");
            }
            //parse the string into a integer value
            int value = Integer.parseInt(inputDecision);
        return value;
    }

    String getPlayerFromConsole(){
        
        //print message 
        System.out.println("Enter your username: ");
        //store input into username variable
        String username = scanner.nextLine();
        
        return username;
    }

    String enterPlayer(PlayerList pl){
        //Message
        System.out.println("Enter Player: ");
        //Obtain input
        String p = scanner.nextLine();
        //Process Entry
        p = processPlayerString(p);
        //Check if p1 Exists in List
        if (pl.doesPlayerNameExist(p))
        {
            //if true will return string name of player
            return p;
        }
        else
        {
            p = "Error";
            return p;
        }
    }
    
    String processPlayerString(String p){
        p = p.toLowerCase();
        char[]p1char = p.toCharArray();
        char firstLetter = p1char[0];
        firstLetter = Character.toUpperCase(firstLetter);
        p1char[0] = firstLetter;
        p = String.valueOf(p1char);
        
       return p;
       }

    int enterScore(Player p){
        System.out.println(p.getName() + ":");
        String inputDecision = scanner.nextLine();
        return Integer.parseInt(inputDecision);
    }
    
    
}





