// Write a java program for getting different colors through ArrayList interface and remove the
// 2nd element and color "Blue" from the ArrayList

import java.util.ArrayList;

public class removeColors {
    public static void main(String[] args) {
        // Creating an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original list of colors: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedByIndex = colors.remove(1);
            System.out.println("Removed 2nd element (by index): " + removedByIndex);
        }

        // Remove the color "Blue" by value
        boolean removedBlue = colors.remove("Blue");
        if (removedBlue) {
            System.out.println("Removed the color 'Blue' from the list.");
        } else {
            System.out.println("The color 'Blue' was not found in the list.");
        }

        // Display the updated list
        System.out.println("Updated list of colors: " + colors);
    }
}
