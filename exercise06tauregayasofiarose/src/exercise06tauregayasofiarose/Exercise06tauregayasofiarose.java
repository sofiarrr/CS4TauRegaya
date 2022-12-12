/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise06tauregayasofiarose;

/**
 *
 * @author sofia
 */
public class Exercise06tauregayasofiarose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monster fire = new Monster("Flame", "fire", "grass", "water", 120, 100);
        Monster water = new Monster("Wave", "water", "fire", "grass", 150, 100);
        Monster grass = new Monster("Green", "grass", "water", "fire", 110, 100);
       
                 
        // grass vs fire 
        do {
          if (fire.hp <= 0 && grass.hp <= 0) {
            System.out.println("Battle ended with a tie." );
            break;
          } else if (fire.hp <= 0 && grass.hp > 0) {
            System.out.println("Battle ended. Green won.");
            break;
          } else if (grass.hp <= 0 && fire.hp > 0) {
            System.out.println("Battle ended. Flame won.");
            break;
          } else {
              // battle 
              fire.attack(grass);
              grass.charge();
              grass.attack(fire);              
          }
        } while ((fire.hp > 0 && grass.hp > 0) || (fire.hp > 0 || grass.hp > 0));
    
    
    fire.resetHealth();
    grass.resetHealth();
    
    // fire vs water
        do {
          if (fire.hp <= 0 && water.hp <= 0) {
            System.out.println("Battle ended with a tie.");
          } else if (fire.hp <= 0 && water.hp > 0) {
            System.out.println("Battle ended. Wave won.");
            break;
          } else if (water.hp <= 0 && fire.hp > 0) {
            System.out.println("Battle ended. Flame won.");
            break;
          } else {
            // battle
            water.attack(fire);
            fire.guard();
            fire.attack(water);
            water.special();
            water.charge();
            water.attack(fire);
          }  
        } while ((fire.hp > 0 && water.hp > 0) || (fire.hp > 0 || water.hp > 0));
    
        
    water.resetHealth();
    
        do {
          if (grass.hp <= 0 && water.hp <= 0) {
           System.out.println("Battle ended with a tie.");
          } else if (grass.hp <= 0 && water.hp > 0) {
            System.out.println("Battle ended. Wave won.");
            break;
          } else if (water.hp <= 0 && grass.hp > 0) {
            System.out.println("Battle ended. Green won.");
            break;
          } else {
            // battle
            grass.attack(water);
            water.rest();
            water.attack(grass);
            grass.special();
            grass.attack(water);  
          }
        } while ((water.hp > 0 && grass.hp > 0) || (water.hp > 0 || grass.hp > 0));
    }
}
