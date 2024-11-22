package LinkedList;

public class Chapter2Q2 {
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
    public int returnKthToLast(int k) {
       // System.out.printf(head.data+" ");
        if (head == null || k < 0) throw new IllegalArgumentException("Invalid input");
        LL node1 = head;
        LL node2 = head;
        for (int i = 0; i<k; i++) {
            if (node2 == null) throw new IllegalArgumentException("k is larger than the list size");
            node2 = node2.next;
        }
        while (node2.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1.data;
    }
}
