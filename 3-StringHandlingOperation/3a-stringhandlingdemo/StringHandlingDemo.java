// 3a. Develop a java program for performing various string operations with different string
// handling functions directed as follows:
// String Creation and Basic Operations, Length and Character Access, String Comparison, String
// Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
// String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
// startsWith() and endsWith()

import java.util.Scanner;

public class StringHandlingDemo {
    public static void main(String[] args) {

        // Using try-with-resources to auto-close Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // 1. String Creation and Basic Operations
            String str1 = "Hello";
            String str2 = "World";
            String str3 = "Hello"; // Better than new String()

            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            System.out.println("String 3: " + str3);

            // 2. Length and Character Access
            System.out.println("Length of str1: " + str1.length());
            System.out.println("First character of str1: " + str1.charAt(0));
            System.out.println("Last character of str1: " + str1.charAt(str1.length() - 1));

            // 3. String Comparison
            System.out.println("str1 equals str3? " + str1.equals(str3)); // true
            System.out.println("str1 == str3? (reference comparison) " + (str1 == str3)); // true (in string pool)
            System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

            // 4. String Searching
            String sentence = "The quick brown fox jumps over the lazy dog.";
            System.out.println("Index of 'fox': " + sentence.indexOf("fox"));
            System.out.println("Contains 'lazy'? " + sentence.contains("lazy"));

            // 5. Substring Operations
            System.out.println("Substring (10 to 19): " + sentence.substring(10, 19));

            // 6. String Modification
            String replaced = sentence.replace("lazy", "active");
            System.out.println("After replace: " + replaced);

            // 7. Whitespace Handling
            String withSpaces = "   Trim me   ";
            System.out.println("Before trim: '" + withSpaces + "'");
            System.out.println("After trim: '" + withSpaces.trim() + "'");

            // 8. String Concatenation
            String full = str1 + " " + str2;
            System.out.println("Concatenated: " + full);

            // 9. String Splitting
            String fruits = "apple,banana,grape,orange";
            String[] fruitArray = fruits.split(",");
            System.out.println("Split fruits:");
            for (String fruit : fruitArray) {
                System.out.println(fruit);
            }

            // 10. StringBuilder Demo (mutable and fast for appending)
            StringBuilder sb = new StringBuilder("Start");
            sb.append(" - Middle");
            sb.append(" - End");
            System.out.println("StringBuilder result: " + sb.toString());

            // 11. String Formatting
            String name = "Keerthana";
            int age = 21;
            String formatted = String.format("Name: %s, Age: %d", name, age);
            System.out.println("Formatted string: " + formatted);

            // 12. Validate Email with contains(), startsWith(), endsWith()
            System.out.print("Enter an email address to validate: ");
            String email = scanner.nextLine();
            if (email.contains("@") && email.endsWith(".com") &&
                (email.startsWith("info") || email.startsWith("admin"))) {
                System.out.println("Email format seems valid.");
            } else {
                System.out.println("Email format is not valid.");
            }
        }
    }
}
