// Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
// defined function truncate()
import java.util.Scanner;
public class truncate {
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength <= 0) {
            return "";
        }
        if (str.length() <= maxLength) {
            return str;
        } else if (maxLength <= 3) {
            return "...".substring(0, maxLength);
        } else {
            return str.substring(0, maxLength - 3) + "...";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter maximum length: ");
        int maxLength = scanner.nextInt();
        String result = truncate(input, maxLength);
        System.out.println("Truncated string: " + result);
        scanner.close();
    }
}