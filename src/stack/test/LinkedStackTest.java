package stack.test;
/*The concrete test classes instantiate the specific kind of stack.
Because they are subclasses of the base test class, they inherit 
all of the the common test cases for free!*/

import org.junit.Before;
import org.junit.Test;

import stack.LinkedStack;

/**
 * Unit test for LinkedStack.
 */
public class LinkedStackTest extends StackTest {

    @Before
    public void makeLinkedStack() {
        s = new LinkedStack();
    }

    @Test public void stupidPieceOfCrapMethodForEclipse() {}
}