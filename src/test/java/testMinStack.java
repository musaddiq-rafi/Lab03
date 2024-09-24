package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testMinStack {

    @Test
    public void testMinStack() {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        assertEquals(1, minStack.min());

        minStack.pop();
        assertEquals(2, minStack.min());

        MinStack minStack2 = new MinStack();
        minStack2.push(1);
        minStack2.push(2);
        minStack2.push(3);
        minStack2.push(4);
        assertEquals(1, minStack2.min());
    }

    @Test
    public void testPopOnEmptyStack() {
        MinStack minStack = new MinStack();
        Exception exception = assertThrows(RuntimeException.class, minStack::pop);
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    public void testMinOnEmptyStack() {
        MinStack minStack = new MinStack();
        Exception exception = assertThrows(RuntimeException.class, minStack::min);
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    public void testTopOnEmptyStack() {
        MinStack minStack = new MinStack();
        Exception exception = assertThrows(RuntimeException.class, minStack::top);
        assertEquals("Stack is empty", exception.getMessage());
    }
}
