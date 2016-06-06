package queue;
/*A Bounded Array Implementation

Things to note here:

The capacity is set at creation time
Adds have a precondition that the queue isn't already full
Adding to a full queue is a state exception, not an argument exception
The array itself is effectively circular
When removing, we take care to nullify the newly unused slot in the array to prevent a possible memory leak*/
import java.util.NoSuchElementException;

/**
 * An implementation of a queue using a fixed, non-expandable array whose
 * capacity is set in its constructor.
 */
public class ArrayQueue implements Queue {
    private Object[] array;
    private int size = 0;
    private int head = 0; // index of the current front item, if one exists
    private int tail = 0; // index of next item to be added

    public ArrayQueue(int capacity) {
        array = new Object[capacity];
    }

    public void enqueue(Object item) {
        if (size == array.length) {
            throw new IllegalStateException("Cannot add to full queue");
        }
        array[tail] = item;
        tail = (tail + 1) % array.length;
        size++;
    }

    public Object dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot remove from empty queue");
        }
        Object item = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return item;
    }

    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot peek into empty queue");
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