//2b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
// appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
// your answer which one is better.

public class performancetest {
    public static void main(String[] args) {
        final int iterations = 10000;
        final String appendString = "AIET";

        // Test StringBuffer performance
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendString);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test StringBuilder performance
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendString);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Print the results
        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000 + " ms");

        // Justify which is better
        if (durationBuffer > durationBuilder) {
            System.out.println("\nStringBuilder is faster than StringBuffer.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("\nStringBuffer is faster than StringBuilder.");
        } else {
            System.out.println("\nBoth StringBuffer and StringBuilder took the same time.");
        }
    }
}
