/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package effectivejava.chapter02;

/**
 * Item 3 - Enforce the singleton property with a private
constructor or an enum type
* 
* Concerns singleton object. Best way to write Singleton objects is to use a 
* enum type.
 * @author Ameer
 */
public enum Item3 {
    INSTANCE;
    
    public void printStatement() {
        System.out.println("HI");
    }
    
    public static void main(String[] args) {
        Item3.INSTANCE.printStatement();
    }
}
