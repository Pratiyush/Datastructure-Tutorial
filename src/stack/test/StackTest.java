package stack.test;
/*Here is what we need to test:

A stack is empty on construction
A stack has size 0 on construction
After n pushes to an empty stack, n > 0, the stack is not empty and its size is n
If one pushes x then pops, the value popped is x.
If one pushes x then peeks, the value returned is x, but the size stays the same
If the size is n, then after n pops, the stack is empty and has a size 0
Popping from an empty stack does throw a NoSuchElementException
Peeking into an empty stack does throw a NoSuchElementException
For bounded stacks only, pushing onto a full stack does throw an IllegalStateException

We really have three classes to test, but the test cases share a bunch of things in common; 
the common tests can go in a base class.
*/
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Test;

import stack.Stack;

/**
 * Base test for any class that implements the Stack interface.
 */
public abstract class StackTest {

    /**
     * The stack to use in all the tests: set this in subclasses.
     */
    protected Stack s;

    @Test
    public void testNewStackIsEmpty() {
        assertTrue(s.isEmpty());
        assertEquals(s.size(), 0);
    }

    @Test
    public void testPushesToEmptyStack() {
        int numberOfPushes = 6;
        for (int i = 0; i < numberOfPushes; i++) {
            s.push("zzz");
        }
        assertFalse(s.isEmpty());
        assertEquals(s.size(), numberOfPushes);
    }

    @Test
    public void testPushThenPop() {
        String message = "hello";
        s.push(message);
        assertEquals(s.pop(), message);
    }

    @Test
    public void testPushThenPeek() {
        String message = "hello";
        s.push(message);
        int size = s.size();
        assertEquals(s.peek(), message);
        assertEquals(s.size(), size);
    }

    @Test
    public void testPoppingDownToEmpty() {
        int numberOfPushes = (int)(Math.random() * 20 + 1);
        for (int i = 0; i < numberOfPushes; i++) {
            s.push("zzz");
        }
        for (int i = 0; i < numberOfPushes; i++) {
            s.pop();
        }
        assertTrue(s.isEmpty());
        assertEquals(s.size(), 0);
    }

    @Test(expected=NoSuchElementException.class)
    public void testPopOnEmptyStack() {
        assertTrue(s.isEmpty());
        s.pop();
    }

    @Test(expected=NoSuchElementException.class)
    public void testPeekIntoEmptyStack() {
        assertTrue(s.isEmpty());
        s.peek();
    }
}