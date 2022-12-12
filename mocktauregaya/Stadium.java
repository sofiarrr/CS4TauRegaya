/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocktauregaya;

/**
 *
 * @author sofia
 */
public class Stadium extends Venue {
    private boolean reserved;

    public Stadium(String s, String l, int v){
        super(s, l, v);
        reserved = false;
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
        return reserved;   
    } 
    
    public void reserve() {
        reserved = true;
    }
    
    public void hostEvent() {
        reserved = !true;
    }
}
