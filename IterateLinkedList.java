import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}

