// Write a java program for getting different colors through ArrayList interface and extract the
// elements 1st and 2nd from the ArrayList object by using SubList()

import java.util.ArrayList;
import java.util.List;

public class colorSubList {
	    public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        List<String> colors = new ArrayList<>();

	        // Adding colors to the ArrayList
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original list of colors:");
	        System.out.println(colors);

	        // Extracting 1st and 2nd elements using subList()
	        // Index starts from 0, so subList(0, 2) returns elements at index 0 and 1
	        List<String> subColors = colors.subList(0, 2);

	        // Display extracted sublist
	        System.out.println("\nExtracted sublist (1st and 2nd elements):");
	        System.out.println(subColors);
	    }
}
