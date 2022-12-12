/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocktauregaya;

/**
 *
 * @author sofia
 */
public abstract class Venue implements SelfPromoting {
    protected String name, location;
    protected double value;
    protected boolean availability;

    public Venue(String s, String l, double v) {
        name = s;
        location = l;
        value = v;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getValue() {
        return value;
    }
    
    public abstract boolean checkAvailability();
    public abstract void reserve();
    public abstract void hostEvent();
    
    @Override
    public void advertise() {
        value += 2;
    }
}
