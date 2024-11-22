package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Chapter2Q1 {
    LL head;
    public void add(int data)  {
        if (head == null) {
            head = new LL(data);
        } else {
            LL current = head;
            while (current.next !=null) {
                current = current.next;
            }
            current.next = new LL(data);
        }
    }
    public void removeDuplicate() {
        Set<Integer> set = new HashSet<>();
        LL current = head;
        LL prev = null;
        while (current != null) {
            if (set.contains(current.data)) {
                prev.next = current.next;
            } else {
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        LL current = head;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }
}
