/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03tauregaya;

public class Ex03TauRegaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("""
                           Welcome to You Ask, We Deliver 2022 Music Festival! Here, we ask you who your favorite artists are and get the Top 3 artists to perform. 
                            Let's meet this year's top artists!\n""");
        
        // artists' songs
        Song s1 = new Song ("the perfect pair", "beabadobee", 2022, "Alternative/Indie", "Beatopia");
        Song s2 = new Song ("Underneath the Stars", "Mariah Carey", 1995, "R&B/Soul, Pop, UK R&B", "Daydream");
        Song s3 = new Song ("dayfly (ft. Sulli, Rad Museum)", "DEAN", 2018, "Alternative R&B");
        
        // orig favorite songs
        Song s4 = new Song ("Velocity Girl", "Snow Patrol", 1998, "Alternative/Indie, Rock", "Songs for Polarbears");
        Song s5 = new Song ("End of the Road", "Boyz II Men", 1991, "R&B/Soul", "Cooleyhighharmony");
        Song s6 = new Song ("Honeymoon Avenue", "Ariana Grande", 2013, "R&B/Soul, Pop, UK R&B", "Yours Truly");
        
        // new favorite songs
        Song s7 = new Song ("Kiss of Life", "Sade", 1993, "Electronic music, Downtempo, Synth-pop, Jazz", "Love Deluxe");
        Song s8 = new Song ("Saw You in a Dream", "The Japanese House", 2017, "Alternative/Indie", "Saw You in a Dream");
        Song s9 = new Song ("safety net (feat. Ty Dolla $ign)", "Ariana Grande", 2020, "R&B/Soul, Pop", "Positions");
        
        // singers
        Singer sing1 = new Singer ("Beabadoobee", 214, 2000, 48800000, s4);
        Singer sing2 = new Singer ("Mariah Carey", 785, 5000, 320000000, s5);
        Singer sing3 = new Singer ("DEAN", 47, 2500, 500000, s6);
        
        // print orig values
        System.out.printf("First up, we have new hot Filipino artist, %s! Currently, she enjoys listening to %s by %s.%n"
                + "Here are some other things to know about her career. %n  Number of Performances: %d (with a typical venue capacity of %d)"
                + "%n  Combined with her total earnings from her albums and singles, she has a total net worth of $%.0f.", 
                sing1.name, sing1.favoriteSong.title, sing1.favoriteSong.artist, sing1.noOfPerformances, sing1.noOfPeople, sing1.earnings);
        System.out.printf("%n%n Find out more here: %n "
                + "-%s's Favorite Song- %n %s by %s%n Year Released: %d%n Album: %s%n Genre: %s", 
                sing1.name, sing1.favoriteSong.title, sing1.favoriteSong.artist, sing1.favoriteSong.yearReleased, sing1.favoriteSong.album, sing1.favoriteSong.genre);
        
        System.out.printf("%n%n Next, we have the legend, %s! Currently, she enjoys listening to %s by %s."
        + "%n Here are some other things to know about her impressive career. %n  Number of Performances: %d (with a typical venue capacity of %d)"
        + "%n  After years in the industry, she now boasts an impressive net worth of $%.0f.",
        sing2.name, sing2.favoriteSong.title, sing2.favoriteSong.artist, sing2.noOfPerformances, sing2.noOfPeople, sing2.earnings);
       System.out.printf("%n%n Find out more here: %n "
                + "-%s's Favorite Song-%n %s by %s%n Year Released: %d%n Album: %s%n Genre: %s%n", 
                sing2.name, sing2.favoriteSong.title, sing2.favoriteSong.artist, sing2.favoriteSong.yearReleased, sing2.favoriteSong.album, sing2.favoriteSong.genre);
        
        System.out.printf("%n%nLast but not the least, the R&B Prince of Asia, %s! Currently, he enjoys listening to %s by %s."
                + "%nHere are some other things to know about his career. %n  Number of Performances: %d (with a typical venue capacity of %d)"
                + "%n  He currently has a net worth of $%.0f.",
                sing3.name, sing3.favoriteSong.title, sing3.favoriteSong.artist, sing3.noOfPerformances, sing3.noOfPeople, sing3.earnings);
        System.out.printf("%n%n Find out more here: %n"
                + "-%s's Favorite Song- %n %s by %s%n Year Released: %d%n Album: %s%n Genre: %s%n", 
                sing3.name, sing3.favoriteSong.title, sing3.favoriteSong.artist, sing3.favoriteSong.yearReleased, sing3.favoriteSong.album, sing3.favoriteSong.genre);
        
        System.out.println("""
                           \n\n Now, let's have the performances! 
                           
                           
                           
                            A few hours later...""");
        
        // performForAudience()
        sing1.performForAudience(214, 2000, 12);
        sing2.performForAudience(785, 5000, 12);
        sing3.performForAudience(47, 2500, 12);
        
        
        //changeFavSong()
        sing1.changeFavSong(s4, s7);
        sing2.changeFavSong(s5, s8);
        sing3.changeFavSong(s6, s9);
        
        System.out.println("\n\n Those were some impressive performances! It turns out that the artists' favorite songs we gave earlier were outdated. They're currently enjoying new songs!");
        System.out.printf("%n %s says she's really been enjoying %s by %s!%n Released in %d in her album, %s, %s has a genre of %s. Woooo, a that's a good one.", 
        sing1.name, sing1.favoriteSong.title, sing1.favoriteSong.artist, sing1.favoriteSong.yearReleased, sing1.favoriteSong.album, sing1.favoriteSong.title, sing1.favoriteSong.genre);
        
        System.out.printf("%n%n %s has been exploring other genres of music. Released in %d, she's been currently enjoying %s by %s from their eponymous album, '%s'. She says she's been enjoying the %s genre!", 
        sing2.name, sing2.favoriteSong.yearReleased,sing2.favoriteSong.title, sing2.favoriteSong.artist, sing2.favoriteSong.album, sing2.favoriteSong.genre);
        
        System.out.printf("%n%n The R&B Prince, %s, has stayed loyal and is enjoying %s's %s from her latest album %s, released in %d!%n He really loves the %s genre.", 
        sing3.name, sing3.favoriteSong.artist, sing3.favoriteSong.title, sing3.favoriteSong.album, sing3.favoriteSong.yearReleased, sing3.favoriteSong.genre);
        
        System.out.println("\n\nView the artists' update profiles here! ");
        // beabadoobee
        System.out.printf("%n%s %n Number of performances: %d%n Number of people: %d%n Earnings: $%.0f %n Favorite Song: %s by %s",
        sing1.name, sing1.noOfPerformances, sing1.noOfPeople, sing1.earnings, sing1.favoriteSong.title, sing1.favoriteSong.artist);
        
        //mariah
        System.out.printf("%n%n%s %n Number of performances: %d%n Number of people: %d%n Earnings: $%.0f %n Favorite Song: %s by %s",
        sing2.name, sing2.noOfPerformances, sing2.noOfPeople, sing2.earnings, sing2.favoriteSong.title, sing2.favoriteSong.artist);
        
        // dean
        System.out.printf("%n%n%s %n Number of performances: %d%n Number of people: %d%n Earnings: $%.0f %n Favorite Song: %s by %s",
        sing3.name, sing3.noOfPerformances, sing3.noOfPeople, sing3.earnings, sing3.favoriteSong.title, sing3.favoriteSong.artist);
        
       
        System.out.println("\n\n Before we end, let's see which lucky fans won the free fanmeet tickets! ");
        // Listeners 
        Listener l1 = new Listener ("@rainyt4pestry", "sofia", "Student", 16, sing1, s1, 1);
        Listener l2 = new Listener ("@porxia", "portia", "Unemployed", 26, sing2, s2, 5);
        Listener l3 = new Listener ("@deancomebackwemissu", "alex", "Artist", 23, sing3, s3, 4);
        
        
        // print listeners
        System.out.printf("%n%n Winner 1: %n %s (%s)%n %s  %d years old %n Favorite Song: %s by %s%n  Album: %s%n  Year Released: %s%n  Genre: %s%n"
                + " Been a fan for: %d year(s)",
        l1.username, l1.nickname, l1.occupation, l1.age, l1.favSong.title, l1.favSinger.name, l1.favSong.album,l1.favSong.yearReleased, l1.favSong.genre, l1.noOfYearsFan);
        System.out.printf("%n%n Winner 2: %n %s (%s)%n %s  %d years old %n Favorite Song: %s by %s%n  Album: %s%n  Year Released: %s%n  Genre: %s%n "
                + "Been a fan for: %d year(s)",
        l2.username, l2.nickname, l2.occupation, l2.age, l2.favSong.title, l2.favSinger.name, l2.favSong.album, l2.favSong.yearReleased, l2.favSong.genre,l2.noOfYearsFan);
        System.out.printf("%n%n Winner 3: %n %s (%s)%n %s  %d years old %n Favorite Song: %s by %s%n Album: %s%n  Year Released: %s%n  Genre: %s%n "
                + "Been a fan for: %d year(s)",
        l3.username, l3.nickname, l3.occupation, l3.age, l3.favSong.title, l3.favSinger.name,l3.favSong.album, l3.favSong.yearReleased, l3.favSong.genre,l3.noOfYearsFan);
        
        
        //end
        System.out.println("\n\nCongrats to the winners! That concludes You Ask, We Deliver 2022 Music Festival 2022. Thank you to the artists! See you next year!");
    }
    
}
