/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
package effectivejava.chapter02;

/**
 *
 * @author Ameer
 */
public class Item2 {
    /**
     * Consider static factory methods 
     * @param args 
     */
    public static void main(String[] args)
    {
        Item2 item = valueOf(true);
        Map<String, Integer> map = newInstance();
        
        
    }
    
    protected Item2()
    {
        
    }
    
    public static Item2 valueOf(boolean b)
    {
        return new Item2();
    }
    
    public static <K, V> HashMap<K, V> newInstance()
    {
        return new HashMap<K, V>();
    }
}
