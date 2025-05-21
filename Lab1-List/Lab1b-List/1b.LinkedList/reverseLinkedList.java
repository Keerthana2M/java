// Write a Java program to iterate a linked list in reverse order (using
// objlist.descendingIterator())

import java.util.Iterator;
import java.util.LinkedList;

public class reverseLinkedList {
	    public static void main(String[] args) {
	        // Create a LinkedList and add some elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original list:");
	        System.out.println(colors);

	        // Get descending (reverse) iterator
	        Iterator<String> reverseIterator = colors.descendingIterator();

	        // Iterate and print elements in reverse order
	        System.out.println("\nIterating in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}
