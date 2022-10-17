/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sirtrcex03.pkg04;

/**
 *
 * @author sofia
 */
public class Sirtrcex0304 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song s1 = new Song("Twinkle");
        Song s2 = new Song("ABC");
        
        Singer mark = new Singer("Mark");
        Singer josh = new Singer("Josh", s1);
        
        josh.performForAudience(12);
        josh.setFavoriteSong(s2);
        System.out.println(josh.getFavoriteSong().getTitle());
        josh.performForAudience(12, mark);
    }
    
}
