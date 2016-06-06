package stack;

/*A Bounded Array Implementation

Things to note here:

The capacity is set at creation time
Pushes have a precondition that the stack isn't already full
Pushing on a full stack is a state exception, not an argument exception
The field for the current size doubles as the index of the next item to be pushed, and
When popping, we take care to nullify the newly unused slot in the array to prevent a possible memory leak*/
import java.util.NoSuchElementException;

/**
 * An implementation of a stack using a fixed, non-expandable array whose
 * capacity is set in its constructor.
 */
public class ArrayStack implements Stack {
    private Object[] array;
    private int size = 0;

    public ArrayStack(int capacity) {
        array = new Object[capacity];
    }

    public void push(Object item) {
        if (size == array.length) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        array[size++] = item;
    }

    public Object pop() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot pop from empty stack");
        }
        Object result = array[size-1];
        array[--size] = null;
        return result;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot peek into empty stack");
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}