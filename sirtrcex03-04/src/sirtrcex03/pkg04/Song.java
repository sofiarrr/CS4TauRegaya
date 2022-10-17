/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sirtrcex03.pkg04;

/**
 *
 * @author sofia
 */
public class Song {
    private String title, album;
    private int trackNo, timesPlayed, timesFavorited;
    
    public Song (String title) {
        this.title = title;
        this.timesPlayed = 0; 
        this.timesFavorited = 0; 
        // no need to intiialize all variables in the constructor
    
    }
    
    public Song (String title, String album. int trackNo) {
        this.title = getTitle();
        this.album = getAlbum();
        this.trackNo = getTrackNo();
        this.setTimesPlayed(0);
        this.timesFavorited = 0;
    }
    
    public String getTitle() { // to allow access to the title
        return title;
    }

    /**
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @return the trackNo
     */
    public int getTrackNo() {
        return trackNo;
    }

    /**
     * @return the timesPlayed
     */
    public int getTimesPlayed() {
        return timesPlayed;
    }

    /**
     * @param timesPlayed the timesPlayed to set
     */
    public void setTimesPlayed(int timesPlayed) {
        this.timesPlayed = timesPlayed;
    }

    /**
     * @return the timesFavorited
     */
    public int getTimesFavorited() {
        return timesFavorited;
    }
    
    public void play() {
        timesPlayed += 1;
    }
    
    public void favorite() {
        timesFavorited += 1;
    }
    
    
}
