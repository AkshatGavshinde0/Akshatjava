import java.util.LinkedList;
import java.util.Collections;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        Collections.reverse(linkedList);
        
        System.out.println(linkedList);
    }
}

