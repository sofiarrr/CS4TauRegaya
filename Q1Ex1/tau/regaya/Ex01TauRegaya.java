/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.tau.regaya;

/**
 *
 * @author TAU
 */
public class Ex01TauRegaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //person 1
        String name1 = "Sofia";
        int age1 = 16;
        int favNumber1 = 43;
        String likes1 = "sleeping slay";
        
        System.out.printf("Person 1 %n Name: " + name1 + "%n Age: " + age1 + "%n Favorite Number: " + favNumber1
        + "%n Likes: " + likes1 + "%n %n");
        
        // person 2
        String name2 = "Erin :D";
        int age2 = 15;
        int favNumber2 = 8;
        String likes2 = "sofia (real)";
        
        System.out.printf("Person 2 %n Name: " + name2 + "%n Age: " + age2 + "%n Favorite Number: " + favNumber2 
        + "%n Likes: " + likes2 + "%n %n");
        
        // person 3 
        String name3 = "Nina (i can't find the one with the line on top)";
        int age3 = 15;
        int favNumber3 = 6;
        String likes3 = "sofia (also real)";
        
        System.out.printf("Person 3 %n Name: " + name3 + "%n Age: " + age3 + "%n Favorite Number: " + favNumber3 
        + "%n Likes: " + likes3 + "%n %n");
        
        // operators
        int sumAge = age1 + age2 + age3;
        int sumFavNumb = favNumber1 + favNumber2 + favNumber3;
        boolean compAge = age1 > age2;
        
        
        System.out.println("Total age: " + sumAge);
        System.out.println("Sum of favorite numbers: " + sumFavNumb);
        System.out.println("Sofia is older than Erin (for now): " + compAge);
    }
    
}
