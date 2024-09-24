package org.example;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        System.out.println("Minimum after pushing 3, 2, 5, 1: " + minStack.min() + " (Expected: 1)");

        minStack.pop();
        System.out.println("Minimum after popping: " + minStack.min() + );

        MinStack anotherStack = new MinStack();
        anotherStack.push(1);
        anotherStack.push(2);
        anotherStack.push(3);
        anotherStack.push(4);
        System.out.println("Minimum after pushing 1, 2, 3, 4: " + anotherStack.min() + );

        anotherStack.pop();
        anotherStack.pop();
        System.out.println("Top element after popping twice: " + anotherStack.top());
    }
}
