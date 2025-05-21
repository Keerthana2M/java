// Write a Java program to display elements and their positions in a linked list ( using
// l_listobj.get(p) )

import java.util.LinkedList;

public class LinkedListDisplay {
	    public static void main(String[] args) {
	        // Creating a LinkedList of Strings
	        LinkedList<String> l_listobj = new LinkedList<>();

	        // Adding elements to the LinkedList
	        l_listobj.add("Apple");
	        l_listobj.add("Banana");
	        l_listobj.add("Cherry");
	        l_listobj.add("Date");

	        // Displaying elements along with their positions
	        System.out.println("Elements in the LinkedList with their positions:");

	        for (int p = 0; p < l_listobj.size(); p++) {
	            System.out.println("Position " + p + ": " + l_listobj.get(p));
	        }
	    }
	}