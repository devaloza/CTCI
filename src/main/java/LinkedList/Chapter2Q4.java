package LinkedList;


public class Chapter2Q4 {
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
    public void partition(int d) {
        LL node = head;
        LL left = node;
        LL right = node;
        while (node != null) {
            LL next = node.next;
            if (node.data < d) {
                node.next = left;
                left = node;
            } else {
                right.next = node;
                right = node;
            }
        node = next;
        }
        right.next = null;
        head = left;
       // return left;
    }
    public String listToString() {
        StringBuilder result = new StringBuilder();
        LL current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString().trim();
    }
}
