/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov.pkg11;

/**
 *
 * @author TAU
 */
public class Person {
    private final String name;
    private int age, friendship;
    private double money;
    private static String school = "PSHS";
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.money = 0;
        this.friendship = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the friendship
     */
    public int getFriendship() {
        return friendship;
    }

    /**
     * @return the money
     */
    public double getMoney() {
        return money;
    }

    /**
     * @return the school
     */
    public static String getSchool() {
        return school;
    }
    
    // superclass boom badoom boom boom badoom boom bass u got that super bass 
    /* hm..... IN YHE SUBCLASS 
    ex. Student class
        in the class: '...extends Person' 
        to add constructor from superclass: 'super(name, 14); -- utilizing these parameters from the superclass ;) '
        - remove getters/setters since it's alr present in the superclass
        - put fields/methods specific to the subclass 
    
        - for private fields:
            1) getter method
            2) give specific class access to said field:
                In the main class: instead of 'private' --> 'protected'
                EX. private double money; --> protected double money; 
        
        - can override method from superclass in subclass
        if (method specific for class)
    
        else {
            super.method();
        } -- use method from superclass 
    
    
        for the exercise:
    
        punlic class FireType extends Monster {
            public FireType(String name, int hp) {
               super(name, "fire", "gras", "water", hp, base);
               atk *= 1.3; // will have to modify access in monster class <3
               def *= 0.7
               
        }
    
    }
    */
}
