// Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
// Collections.swap(l_list, 0, 2))

import java.util.Collections;
import java.util.LinkedList;


public class SwapElements {
	    public static void main(String[] args) {
	        // Creating a LinkedList of Strings
	        LinkedList<String> l_list = new LinkedList<>();

	        // Adding elements to the LinkedList
	        l_list.add("Red");
	        l_list.add("Green");
	        l_list.add("Blue");
	        l_list.add("Yellow");

	        // Displaying original list
	        System.out.println("Original LinkedList: " + l_list);

	        // Swapping the first (index 0) and third (index 2) elements
	        Collections.swap(l_list, 0, 2);

	        // Displaying list after swapping
	        System.out.println("LinkedList after swapping first and third elements: " + l_list);
	    }
	}

