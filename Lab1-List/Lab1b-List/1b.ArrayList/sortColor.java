// Write a java program for getting different colors through ArrayList interface and sort them
// using Collections.sort( ArrayListObj)

import java.util.ArrayList;
import java.util.Collections;

public class sortColor {
	    public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors to the list
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");
	        colors.add("Violet");

	        // Displaying original list
	        System.out.println("Original list of colors:");
	        System.out.println(colors);

	        // Sorting the list using Collections.sort()
	        Collections.sort(colors);

	        // Displaying sorted list
	        System.out.println("\nSorted list of colors:");
	        System.out.println(colors);
	    }
	

}
