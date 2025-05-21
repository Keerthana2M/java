
import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        // 1. Adding elements
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Initial LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");
        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);
        // 4. Accessing elements
        System.out.println("\nElement at index 2 in ArrayList: " + arrayList.get(2));
        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));
        // 5. Updating elements
        arrayList.set(2, "Kiwi");
        linkedList.set(2, "Kiwi");
        // 6. Removing elements
        arrayList.remove("Mango");
        linkedList.remove("Mango");
        // 7. Searching elements
        boolean foundInArrayList = arrayList.contains("Banana");
        boolean foundInLinkedList = linkedList.contains("Banana");
        System.out.println("\nIs 'Banana' in ArrayList? " + foundInArrayList);
        System.out.println("Is 'Banana' in LinkedList? " + foundInLinkedList);
        // 8. List size
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating over list
        System.out.println("\nIterating ArrayList with for-each:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("Iterating LinkedList with for-each:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nUsing Iterator on ArrayList:");
        Iterator<String> arrayIterator = arrayList.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        System.out.println("Using Iterator on LinkedList:");
        Iterator<String> linkedIterator = linkedList.iterator();
        while (linkedIterator.hasNext()) {
            System.out.println(linkedIterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\nSorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> arraySubList = arrayList.subList(1, 3);
        List<String> linkedSubList = linkedList.subList(1, 3);
        System.out.println("\nSublist of ArrayList (1 to 3): " + arraySubList);
        System.out.println("Sublist of LinkedList (1 to 3): " + linkedSubList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("\nArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}

