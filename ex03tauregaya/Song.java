/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03tauregaya;

/**
 *
 * @author Hershey
 */
public class Song {
    String title;
    String artist;
    int yearReleased;
    String genre;
    String album;

    public Song (String t, String art, int yr, String gen, String alb){
        title = t;
        artist = art;
        yearReleased = yr;
        genre = gen;
        album = alb;
    }
    
    // no album, just a single
    public Song (String t, String art, int yr, String gen){
        title = t;
        artist = art;
        yearReleased = yr;
        genre = gen;
        album = title;
    }
    

}
