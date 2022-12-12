/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise07tauregayasofiarose;

/**
 *
 * @author sofia
 */
public class Exercise07tauregayasofiarose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trainer rio = new Trainer ("Rio");
        Monster flame  = new FireType ("Flame", 120, 100);
        Location tokyo = new Location ("Tokyo", "ramen");
        NPC bel = new NPC ("Bel", tokyo, "Hey girly!");
        
        
        rio.inspect(flame);
        rio.inspect(bel);
        System.out.println("");
        rio.inspect(tokyo);
        System.out.println("");
    }
  
}
