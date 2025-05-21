// Write a java program for getting different colors through ArrayList interface and delete nth
// element from the ArrayList object by using remove by index

import java.util.ArrayList;
import java.util.Scanner;

public class removeIndex {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some sample colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original Color List: " + colors);

        // Use try-with-resources to auto-close Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the index (n) of the color to remove (starting from 0): ");
            int n = scanner.nextInt();

            // Remove n-th element if index is valid
            if (n >= 0 && n < colors.size()) {
                String removedColor = colors.remove(n);
                System.out.println("Removed color: " + removedColor);
            } else {
                System.out.println("Invalid index! No color removed.");
            }
        }

        // Display updated list
        System.out.println("Updated Color List: " + colors);
    }
}
