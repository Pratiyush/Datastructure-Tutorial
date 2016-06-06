package stack.test;
/*The concrete test classes instantiate the specific kind of stack.
Because they are subclasses of the base test class, they inherit 
all of the the common test cases for free!*/



import org.junit.Before;
import org.junit.Test;

import stack.ArrayStack;

/**
 * Unit test for BoundedStack.
 */
public class ArrayStackTest extends StackTest {
    private static int CAPACITY = 40;

    @Before
    public void makeBoundedStack() {
        s = new ArrayStack(CAPACITY);
    }

    @Test(expected=IllegalStateException.class)
    public void testPushToFullStack() {
        for (int i = 0; i < CAPACITY; i++) {
            s.push("abc");
        }
        s.push("abc");
    }
}