/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06tauregayasofiarose;

/**
 *
 * @author sofia
 */
public class WaterType extends Monster {
    public WaterType (String name, int hp, int base) {
        super(name, "water", "fire", "grass", hp, base);
        atk *= 0.7;
        def *= 1.3;
    }
    
    @Override
    public void special() {
        def += 2;
        hp -= (0.1 * maxHP);
    }
}
