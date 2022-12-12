/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocktauregaya;

/**
 *
 * @author sofia
 */
public class Theater extends Venue {
    private int numStages;

    public Theater(String s, String l, int v, int num){
        super(s, l, v);
        numStages = num;
    }
    
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public double getValue(){
        return value;
    }
    
    public boolean checkAvailability() {
        if (numStages > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void reserve() {
        numStages -= 1;
        System.out.print("A stage has been reserved.");
    }
    
    public void hostEvent() {
        numStages += 1;
        System.out.print("A new event will be hosted.");
    }
}
