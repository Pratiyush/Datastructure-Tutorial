package queue.test;

import org.junit.Before;
import org.junit.Test;

import queue.WrapperQueue;
/* The concrete test classes instantiate the specific kind of queue. 
 * Because they are subclasses of the base test class, they inherit
 * all of the the common test cases for free!
 * */

/**
 * Unit test for SimpleQueue.
 */
public class WrapperQueueTest extends QueueTest {

    @Before
    public void makeSimpleQueue() {
        q = new WrapperQueue();
    }

    @Test public void stupidPieceOfCrapMethodForEclipse() {}
}