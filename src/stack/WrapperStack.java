package stack;
/*The Trivial Wrapper Implementation

One way to make our own stack is to make a wrapper around the existing LinkedList class.*/
import java.util.LinkedList;

/**
 * A stack class implemented as a wrapper around a java.util.LinkedList.
 * All stack methods simply delegate to LinkedList methods.
 */
public class WrapperStack implements Stack {
	    private LinkedList<Object> list = new LinkedList<Object>();

	    public void push(Object item) 
	    {
	    	list.addFirst(item);
	    }
	    
	    public Object pop() 
	    {
	    	return list.removeFirst();
	    }
	    
	    public Object peek() 
	    {
	    	return list.getFirst();
	    }
	    
	    public int size() 
	    {
	    	return list.size();
	    }
	    
	    public boolean isEmpty() 
	    {
	    	return list.isEmpty();
	    }
}
