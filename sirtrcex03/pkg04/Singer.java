/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sirtrcex03.pkg04;

/**
 *
 * @author sofia
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    

    public Singer(String name) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = null;
    }
    
    public Singer (String name, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = null;
        this.favoriteSong = favoriteSong;
    
    
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the noOfPerformances
     */
    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    /**
     * @return the earnings
     */
    public double getEarnings() {
        return earnings;
    }

    /**
     * @return the favoriteSong
     */
    public Song getFavoriteSong() {
        return favoriteSong;
    }

    /**
     * @param favoriteSong the favoriteSong to set
     */
    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int people) {
        noOfPerformances += 1;
        earnings += 100*people;
        System.out.printf("%s perfromed for %d people and earned %f.%n", name, people, earnings);
        
    }
    
    public void performForAudience(int people, Singer companion) {
        double totalEarnings = 100*people;
        this.earnings = totalEarnings / 2;
        companion.earnings += totalEarnings;
         
        totalPerformances++;
        this.noOfPerformances++;
        companion.noOfPerformances++;
        System.out.printf("%s performed w %s for %d people and has earned %.2f in total and each earned %.2f %n.", name, companion.name, people, earnings, totalEarnings/2);
    }
    
}
