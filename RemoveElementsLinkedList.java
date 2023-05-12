import java.util.LinkedList;

public class RemoveElementsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        linkedList.remove(); // Remove the first element
        linkedList.removeLast(); // Remove the last element
        
        System.out.println(linkedList);
    }
}

