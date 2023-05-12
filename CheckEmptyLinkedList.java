import java.util.LinkedList;

public class CheckEmptyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        boolean isEmpty = linkedList.isEmpty();
        
        System.out.println("Is LinkedList empty? " + isEmpty);
    }
}

