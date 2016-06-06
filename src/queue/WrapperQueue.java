package queue;
import java.util.LinkedList;

/**
 * A trivial implementation of the simple queue interface, built as
 * a wrapper around the LinkedList class from java.util.
 */
public class WrapperQueue implements Queue {
    private LinkedList<Object> data = new LinkedList<Object>();
    public void enqueue(Object item) {data.addLast(item);}
    public Object dequeue() {return data.removeFirst();}
    public Object peek() {return data.getFirst();}
    public int size() {return data.size();}
    public boolean isEmpty() {return data.isEmpty();}
}