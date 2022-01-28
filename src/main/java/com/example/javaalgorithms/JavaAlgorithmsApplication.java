package com.example.javaalgorithms;

import java.util.*;

import static com.example.javaalgorithms.LinkedListExample.insert;
import static com.example.javaalgorithms.LinkedListExample.printList;

public class JavaAlgorithmsApplication {

    public static void main(String[] args){

        //----------------Detailed Stack Example-----------------------//

        StackExample s = new StackExample();
        s.pushElementIntoStack(10);
        s.pushElementIntoStack(20);
        s.pushElementIntoStack(30);
        s.pushElementIntoStack(40);
        System.out.println(s.popElementFromTheStack() + " was popped from the stack");

        //Simplified stack example

        Stack<Integer> integerStack = new Stack<>();
        integerStack.add(1);
        integerStack.add(2);
        integerStack.add(3);
        System.out.println("The current top value is: " + integerStack.peek()); //Shows the current top value
        System.out.println("The top value was: " + integerStack.pop() + " and it has now been removed."); //Gets the top value and removes it
        System.out.println("The new top value is now: " + integerStack.peek());

        //----------------Queue Example-----------------------//

        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        System.out.println("The queue currently has : " + queue + " in it."); //Displaying elements int the queue

        queue.remove("Three");
        System.out.println("After 'Three' has been removed the new queue now looks like this: " + queue);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue contains element 'Two' or not?: " + queue.contains("Two"));

        //To empty the queue
        queue.clear();

        //Simplified Queue example

        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        System.out.println("The first value is: " + integerQueue.poll()); //getting first value in the queue
        System.out.println("The first value was removed: " + integerQueue.peek()); //Removes the first value and displays what the current first place is
        System.out.println("The first value is now: " + integerQueue.poll());

        //--------------Linked List Example-----------------//

        //Starting with an empty list
        LinkedListExample list = new LinkedListExample();

        //Inserting values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        //Printing out the linked list
        printList(list);

        //--------------Hash Set Example-----------------//

        //Hashset stores the data in a random index position

        Set<Integer> numberSet = new HashSet<>();

        numberSet.add(20);
        numberSet.add(43);
        numberSet.add(23);
        numberSet.add(68);
        numberSet.add(12);
        System.out.println("The hash set order is random: " + numberSet);
        System.out.println("This set contains: " + numberSet.contains(68));
        System.out.println("This set has: " + numberSet.size() + " pieces of data in it.");

        //--------------Tree Set Example-----------------//

        //Stores the data in order

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(20);
        treeSet.add(43);
        treeSet.add(23);
        treeSet.add(68);
        treeSet.add(12);
        System.out.println("This tree set has ordered the data: " + treeSet);

        //--------------Hashmap Example Example-----------------//

        //Works with keys and values in an unsorted manner.
        //Tree map does the opposite and sorts the data by the key.

        HashMap<String, String> hashMap = new HashMap<>();  //Create new hashmap

        hashMap.put("Bobby","Brown");   //Declaring keys and values
        hashMap.put("Ana","Edwards");

        System.out.println(hashMap.keySet());   //Finding the keys
        System.out.println(hashMap.values());   //Finding the values
        System.out.println(hashMap.get("Ana")); //Using a specific key to get the value associated with it.
    }

}
