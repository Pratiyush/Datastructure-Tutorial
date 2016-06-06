package queue;
/*The queue is one of the most widely used data structures. So what are queues? Where are they used? How are they implemented?

A queue is a FIFO sequence. Addition takes place only at the tail, and removal takes place only at the head.
The basic operations are:

enqueue(x): add an item at the tail
dequeue: remove the item at the head
peek: return the item at the head (without removing it)
size: return the number of items in the queue
isEmpty: return whether the queue has no items
Usage

You tend to see queues often....

Line of cars at a light
Line of people at a deli or at Fry's
Printer buffer
Packets waiting at a router
Simulation
*/
/*
There's already a Queue interface in the Java Core API and a whole bunch of implementing subclasses (AbstractQueue, ArrayBlockingQueue, ArrayDeque, ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque, LinkedBlockingQueue, LinkedList, PriorityBlockingQueue, PriorityQueue, SynchronousQueue)
*//**
 * A small queue interface.  You can query the size of the queue and
 * ask whether it is empty, add and remove items, and peek at the front
 * item.
 */
public interface Queue {

    /**
     * Adds the given item to the rear of the queue.
     */
    void enqueue(Object item);

    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    Object dequeue();

    /**
     * Returns the front item from the queue without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    Object peek();

    /**
     * Returns the number of items currently in the queue.
     */
    int size();

    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty();
}