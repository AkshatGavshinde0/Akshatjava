import java.util.LinkedList;

public class AccessElementsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        String first = linkedList.getFirst();
        String last = linkedList.getLast();
        
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
    }
}

