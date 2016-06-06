package queue.test;
import org.junit.Before;
import org.junit.Test;

import queue.LinkedQueue;
/* The concrete test classes instantiate the specific kind of queue. 
 * Because they are subclasses of the base test class, they inherit
 * all of the the common test cases for free!
 * */

/**
 * Unit test for LinkedQueue.
 */
public class LinkedQueueTest extends QueueTest {

    @Before
    public void makeLinkedQueue() {
        q = new LinkedQueue();
    }

    @Test public void stupidPieceOfCrapMethodForEclipse() {}
}