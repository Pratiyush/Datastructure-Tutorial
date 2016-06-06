package stack;

/*
The Java Core API has a stack class in the package java.util but you should avoid 
it since it subclasses Vector and thus has a bunch of non-stack operations (this is
a major design flaw in the library), and it is (perhaps unnecessarily) synchronized
making it slow (though always thread-safe).*/


/*A stack is a LIFO sequence. Addition and removal takes place only at one end, called the top.


Operations

push(x): add an item on the top
pop: remove the item at the top
peek: return the item at the top (without removing it)
size: return the number of items in the stack
isEmpty: return whether the stack has no items
Examples

Stacks of plates
Trains
Vending Machines
Expression Evaluation
Matching delimiters
Navigating a maze
Map coloring
Many more examples*/


/**
 * A small stack interface.  You can query the size of the stack and
 * ask whether it is empty, push items, pop items, and peek at the top
 * item.
 */
public interface Stack {
	/**
     * Adds the given item to the top of the stack.
     */
    void push(Object item);
    
    /**
     * Removes the top item from the stack and returns it.
     * @exception java.util.NoSuchElementException if the stack is empty.
     */
    Object pop();
    
    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the stack is empty.
     */
    Object peek();
    
    /**
     * Returns the number of items currently in the stack.
     */
    int size();

    /**
     * Returns whether the stack is empty or not.
     */
    boolean isEmpty();
}
