/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mocktauregaya;

/**
 *
 * @author sofia
 */
public class Mocktauregaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Band b1 = new IndieBand("BSD", 45, "SM");
        Venue t1 = new Theater("SM", "Manila", 400, 15);
        b1.reserve(t1);
        b1.perform();
        System.out.printf("%s popularity is at %d", b1.name, b1.popularity);
    }
    
}
