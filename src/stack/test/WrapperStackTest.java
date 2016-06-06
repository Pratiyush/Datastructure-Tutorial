package stack.test;
/*The concrete test classes instantiate the specific kind of stack.
Because they are subclasses of the base test class, they inherit 
all of the the common test cases for free!*/

import org.junit.Before;
import org.junit.Test;

import stack.WrapperStack;

/**
 * Unit test for SimpleStack.
 */
public class WrapperStackTest extends StackTest {

    @Before
    public void makeSimpleStack() {
        s = new WrapperStack();
    }

    @Test public void stupidPieceOfCrapMethodForEclipse() {}
} 