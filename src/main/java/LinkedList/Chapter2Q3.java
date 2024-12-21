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
        if (head == null) return null;
        int size = 1;
        LL current = head;
        LL prev = null;
        while (current !=null) {
            size++;
            current = current.next;
        }
        int index = 1;
        int middle = size / 2;
        if (middle == 0) return null;
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
