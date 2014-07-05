package effectivejava.chapter02;

import java.util.Arrays;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public Object pop() throws EmptyStackException {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }
    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
    
    public void printItems()
    {
        System.out.println("****************************");
        for(int i=0; i<Stack.DEFAULT_INITIAL_CAPACITY; i++)
            System.out.println(elements[i]);
    }
    
    private class EmptyStackException extends Exception {
        
        public EmptyStackException() {
            super();
            this.printStackTrace();
        } 
  }
    public static void main(String[] args) throws EmptyStackException {
        Stack stack = new Stack();
        for(int i=0; i<4; i++)
        stack.push(i);
        for(int i=4; i<8; i++)
        stack.push(new String("doodle"+i));
        for(int i=8; i<Stack.DEFAULT_INITIAL_CAPACITY; i++)
        {
            if(i%2==0)
            {
                stack.push(Boolean.valueOf(true));
            }
            else {
                stack.push(Boolean.valueOf(false));
            }
        }
        stack.printItems();
        stack.pop();
        stack.pop();
        stack.push(new Integer(10));
        stack.printItems();
}
}