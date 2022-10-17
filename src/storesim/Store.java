/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storesim;
import java.util.*;
/**
 *
 * @author sofia
 */
public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    this.itemList = new ArrayList<>();  
    storeList.add(this);
  }

  public String getName(){
    return name;
  } 
  
  public double getEarnings(){
    return earnings;
  }
  public void addItem(Item i){
    itemList.add(i);
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)     
    if (index < itemList.size() && index >= 0) {
        /* Item foundItem = itemList.get(index)
        earnings += foundItem.getCost();
        System.out.printf("Sold %s for %.2f.%n", foundItem.getName(), foundItem.getCost());        
        */
        earnings += itemList.get(index).getCost();
        System.out.printf("%n%n%s sold for P%.1f.", itemList.get(index).getName(), itemList.get(index).getCost());
    } else {
        System.out.printf("%nThere are only %d items in the store. %n%n", itemList.size()); // tama queen slay!
        // or: System.out.printf("%s does not sell that many items.%n", this.name);
    }
  }
  
  public void sellItem(String name){  
    
    boolean inStore = false;
    for (Item e : itemList) {
        if (e.getName().equalsIgnoreCase(name)) { // get name of element and see if its equal to string name (nvm didnt work)
            inStore = true;
            earnings += e.getCost();
            System.out.printf("%n%s sold at P%.2f. ", e.getName(),e.getCost());
        } 
           
    }  
      
    if (!inStore) {
            System.out.printf("%nStore does not sell %s. ", name);
    } 
  }
  
  /* 
  boolean found = false;
  for(Item i : itemList) {
    if (i.getName().equals(name)) {
        found = true;
        earnings += i.getCost();
        System.out.printf("Sold %s for %.2f.%n", i.getName(), i.getCost());  
  }
  if (!found)
        System.out.printf("%s does not sell %s.%n", this.name, name);  
  }  
  */
  
  public void sellItem(Item i){
    
    if (itemList.contains(i)) {
        earnings += i.getCost();
        System.out.printf("%n%n%s sold at P%.1f", i.getName(), i.getCost());
    } else {
        System.out.printf("%nStore does not sell %s.%n", i.getName());
    }   
  }
  /*
    if (itemList.contains(i)) {
        earnings += i.getCost();
        System.out.printf("Sold %s for %.2f.%n", i.getName(), i.getCost());
  } else {
        System.out.printf(%s does not sell %s.%n, this.name, i.getName());
  }
  */

  
  public void filterType(String type){  
    System.out.println("\n\nFood Items: ");
    for(Item e : itemList) {
        if (e.getType().equals(type)) {
            System.out.printf("%s %n", e.getName());
        }
    }    
  }
  
  public void filterCheap(double maxCost){  
    System.out.println("\n\nCheap items (for below 500): ");
    for (Item e : itemList) {
        if (maxCost >= e.getCost()) {
            System.out.printf("%s %n",e.getName());
        }   
    }
  }
  
  public void filterExpensive(double minCost){ 
    System.out.println("\n\nExpensive Items (for above 1000): ");
    for (Item e : itemList) {
        if (minCost <= e.getCost()) {
            System.out.printf("%s %n",e.getName());
        }     
    }
  }
  
  public static void printStats(){
    for (Store s : storeList) {
        System.out.printf("%n%s has the total earnings of P%.1f.%n", s.name, s.earnings);
    }    
  }
}
