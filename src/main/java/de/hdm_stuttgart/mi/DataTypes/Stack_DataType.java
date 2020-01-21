package de.hdm_stuttgart.mi.DataTypes;

import java.util.Stack;

public class Stack_DataType {

    public static void main(String[] args) {

        final java.util.Stack<Integer> number = new java.util.Stack<>();

        // "push(...)" Add object on top
        // Requirement: -
        // Access type: modify
        System.out.println("Empty stack\t\t -> " + number.toString());
        number.push(8);
        System.out.println( "number.push(8)\t -> " + number.toString());
        number.push(3);
        System.out.println( "number.push(3)\t -> " + number.toString());

        // "pop()" Read + remove topmost object
        // Requirement: Stack not empty
        // Access type: modify
        number.pop();
        System.out.println( "number.pop()\t -> " + number.toString());

        // "top()" or "peek()" Read topmost object
        // Requirement: Stack not empty
        // Access type: Read only
        // number.top(); -> not working
        System.out.println( "number.peek()\t -> " + number.peek());

        // "empty()" true if and only if stack is empty
        // Access type: Read only
        // Requirement: -
        System.out.println( "number.empty()\t -> " + number.empty());
    }
}
