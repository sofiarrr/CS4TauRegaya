/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02tauregaya;

import java.util.Scanner;

/**
 *
 * @author Hershey
 */
public class Ex02TauRegaya {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         // receive input from user
        String input;
        Scanner sc = new Scanner (System.in); 
        int min = 1;
        int range = 10;
        int remaining;
        int guesses = 3;
        int random = (int) Math.floor(Math.random()*range) + min;
        String repeatGame;
        do { System.out.print("""
                         \n Welcome to Higher or Lower! What will you do?
                         - Start game
                         - Change settings
                         - End application
                         """);
            input = sc.nextLine();
            
        
        switch (input) {
            // start game
            case "start game":
            case "Start game":               
                do {
                   for(remaining = guesses; remaining > 0; remaining--) {
                   System.out.printf("You have %d guess(es) left. What is your guess?", remaining);
                    int userGuess = Integer.parseInt(sc.nextLine());
                    if (userGuess == random) {
                        System.out.print("You got it! ");
                        break;
                    } else if (remaining > 1 && userGuess < random ) {
                        System.out.print("Guess higher! ");
                    } else if (remaining > 1 && userGuess > random ) {
                        System.out.print("Guess lower! ");
                    } else {
                        System.out.print("You lost... ");
                    }
                } 
                System.out.println("Play again (y/n)?");
                repeatGame = sc.nextLine();  
                int newNumber = (int) Math.floor(Math.random()*range) + min;
                random = newNumber;
                
                } while(repeatGame.equalsIgnoreCase("y"));
                  break;                               
            // change settings
            case "change settings":
            case "Change settings":
                System.out.println("""
                                   \nWhat is the lower limit of the random number?
                                   What is the upper limit of the random number?
                                   How many guesses are allowed?""");
                min = Integer.parseInt(sc.nextLine());
                range = Integer.parseInt(sc.nextLine());
                guesses = Integer.parseInt(sc.nextLine());
                 
                //print out new values
                System.out.println("Lower limit: " + min);
                System.out.println("Upper limit: " + range);
                System.out.println("# of Guesses: " + guesses);
                break;
        } 
        // end application
        } while(!input.equalsIgnoreCase("End application"));
    System.out.println("\nThank you for playing! (o^-^o)/");       
    }
    
}
