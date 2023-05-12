import java.util.LinkedList;
import java.util.HashSet;

public class RemoveDuplicatesLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        
        HashSet<Integer> set = new HashSet<>(linkedList);
        linkedList.clear();
        linkedList.addAll(set);
        
        System.out.println(linkedList);
    }
}

