/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocktauregaya;

/**
 *
 * @author sofia
 */
public class IndieBand extends Band implements SelfPromoting {
    private String origin;

    public IndieBand(String s, int p, String o){
        super(s, p);
        popularity = 0;
        origin = o;
    }
    public void reserve(Venue v){
        if(v.checkAvailability()){
            v.reserve();
            selectedVenue = v;
        }
    }
    
    public void perform(){
       if(selectedVenue != null){
            popularity += 5;
            performances++;
        }
        if(selectedVenue.equals(origin)) {
           popularity *= 2;
       }
        selectedVenue.hostEvent();
        selectedVenue = null;
    }
    
    public void advertise() {
        popularity += (performances/10);
    }
}
