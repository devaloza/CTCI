package linkedList;

import LinkedList.LL;

public class Chapter2Q3 {
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
    public LL deleteMiddleNode() {
       // System.out.printf(head.data+" ");
        if (head == null) throw new IllegalArgumentException("Invalid input");
        int size = 0;
        LL current = head;
        LL prev = head;
        while (current !=null) {
            size++;
            current = current.next;
        }
        int index = 0;
        int middle = size / 2;
        while (index < middle) {
            index++;
            prev = prev.next;
        }
        if (index == middle) {
            prev.next = prev.next.next;
        }
        return head;
    }
}
