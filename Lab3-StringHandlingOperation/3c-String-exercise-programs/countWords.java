// Write a Java Program for Counting the number of words in a string using user defined function
// countWords()

import java.util.Scanner;
public class countWords {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0; 
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
        scanner.close();
    }
}
