/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise07tauregayasofiarose;

/**
 *
 * @author sofia
 */
public class GrassType extends Monster {
    public GrassType (String name, int hp, int base) {
        super(name, "grass", "water", "fire", hp, base);
        atk = base;
        def = base;
    }
    
    @Override
    public void rest() {
        hp += (0.5 * maxHP);
    }
    
    @Override
    public void special() {
        hp += (0.2 * maxHP);
    }
}
