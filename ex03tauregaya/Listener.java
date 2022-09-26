/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03tauregaya;

/**
 *
 * @author Hershey
 */
public class Listener {
    String username, nickname, occupation;
    int age;
    Singer favSinger;
    Song favSong;
    int noOfYearsFan;
    
    public Listener (String user, String nname, String ocp, int a, Singer fvsing, Song fvsong, int yrsfan) {
        username = user;
        nickname = nname;
        occupation = ocp;
        age = a;
        favSinger = fvsing;
        favSong = fvsong;
        noOfYearsFan = yrsfan;
    }
 
}
