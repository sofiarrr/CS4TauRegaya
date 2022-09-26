/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03tauregaya;

/**
 *
 * @author Hershey
 */
public class Singer {
    String name;
    int noOfPerformances;
    int noOfPeople;
    double earnings;
    Song favoriteSong;
    
    public Singer(String n, int perf, int ppl, double earn, Song s){
        name = n;
        noOfPerformances = perf;
        noOfPeople = ppl;
        earnings = earn;
        favoriteSong = s;          
    }
    public void performForAudience(int x, int y, int z) {
        noOfPerformances += 1; // increases by 1
        noOfPeople = x * y + z;
        earnings += z * 100; // increase earnings by 100 for each person
    }
    
    public void changeFavSong(Song x, Song y) {
        favoriteSong = y;
    }
}
