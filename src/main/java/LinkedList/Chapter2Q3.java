package LinkedList;


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
        int size = 1;
        LL current = head;
        LL prev = null;
        while (current !=null) {
            size++;
            current = current.next;
        }
        int index = 1;
        int middle = size / 2;
        System.out.printf(middle+" ");
        current = head;
        while (index < middle) {
            index++;
            prev = current;
            current = current.next;
        }
        if (prev !=null) {
            prev.next = current.next;
        }
        return head;
    }
}
