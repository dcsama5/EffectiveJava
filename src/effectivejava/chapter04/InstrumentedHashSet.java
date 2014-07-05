/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package effectivejava.chapter04;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Ameer
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;
    
    public InstrumentedHashSet() {
        
    }
    public InstrumentedHashSet(int initCap, float loadFactor)
    {
        super(initCap, loadFactor);
    }
    
    @Override public boolean add(E e)
    {
        addCount++;
        System.out.println("hit");
        return super.add(e);
    }
    
    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }
    
    public static void main(String[] args) 
    {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());
    }
}