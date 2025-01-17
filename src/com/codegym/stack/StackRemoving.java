package com.codegym.stack;

import java.util.*;

public class StackRemoving {
    public static void main(String args[]) {
        // Creating an empty Stack
        Stack<Integer> stack = new Stack<Integer>();

        // Use add() method to add elements
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Removing elements using pop() method
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stack);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position wanna remove: ");
        int position = sc.nextInt();

        Integer element = stack.remove(position);
        System.out.println(element);
        System.out.println("Stack after remove operation " + stack);
    }
}
