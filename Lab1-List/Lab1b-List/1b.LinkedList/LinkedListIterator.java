// Write a Java program to iterate through all elements in a linked list starting at the
// specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
	    public static void main(String[] args) {
	        // Create a LinkedList and add elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the full list
	        System.out.println("Full list of colors:");
	        System.out.println(colors);

	        // Create ListIterator starting at 2nd position (index 1)
	        ListIterator<String> iterator = colors.listIterator(1);

	        // Iterate and display elements from 2nd position onward
	        System.out.println("\nIterating from 2nd position:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}
