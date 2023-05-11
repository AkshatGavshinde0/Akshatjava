import java.util.LinkedList;

public class SearchElementLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        boolean containsBanana = linkedList.contains("Banana");
        int index = linkedList.indexOf("Orange");
        
        System.out.println("Contains Banana: " + containsBanana);
        System.out.println("Index of Orange: " + index);
    }
}

