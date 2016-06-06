package queue.test;
/*Unit Testing

Here is what we need to test:

A queue is empty on construction
A queue has size 0 on construction
After n enqueues to an empty queue, n > 0, the queue is not empty and its size is n
If one enqueues x then dequeues, the value dequeued is x.
If one enqueues x then peeks, the value returned is x, but the size stays the same
If the size is n, then after n dequeues, the stack is empty and has a size 0
If one enqueues the values 1 through 50, in order, into an empty queue, then if 50 dequeues are done the values dequeues are 1 through 50.
Dequeueing from an empty queue does throw a NoSuchElementException
Peeking into an empty queue does throw a NoSuchElementException
For bounded queues only, pushing onto a full stack does throw an IllegalStateException
We really have three classes to test, but the test cases share a bunch of things in common; the common tests can go in a base class. Note how the base test class tests any kind of queue.*/
import org.junit.Before;
import org.junit.Test;

import queue.ArrayQueue;
/* The concrete test classes instantiate the specific kind of queue. 
 * Because they are subclasses of the base test class, they inherit
 * all of the the common test cases for free!
 * */
/**
 * Unit test for BoundedQueue.
 */
public class ArrayQueueTest extends QueueTest {
    private static int CAPACITY = 60;

    @Before
    public void makeBoundedQueue() {
        q = new ArrayQueue(CAPACITY);
    }

    @Test(expected=IllegalStateException.class)
    public void testEnqueueToFullQueue() {
        for (int i = 0; i < CAPACITY; i++) {
            q.enqueue("abc");
        }
        q.enqueue("abc");
    }
}