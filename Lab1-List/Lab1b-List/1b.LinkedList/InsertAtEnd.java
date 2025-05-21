// Write a Java program to insert the specified element at the end of a linked list.( using
// l_listobj.offerLast("Pink"))
import java.util.LinkedList;
public class InsertAtEnd {
	    public static void main(String[] args) {
	        // Create a LinkedList and add some initial colors
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("Red");
	        l_list.add("Blue");
	        l_list.add("Green");

	        // Display original list
	        System.out.println("Original LinkedList:");
	        System.out.println(l_list);

	        // Insert "Pink" at the end using offerLast()
	        l_list.offerLast("Pink");

	        // Display updated list
	        System.out.println("\nLinkedList after inserting 'Pink' at the end:");
	        System.out.println(l_list);
	    }
	}
