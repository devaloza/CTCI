package LinkedList;


 class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
public class Chapter2Q3_2 {

    // Helper method to create a linked list from an array
    public Node createLinkedList(int[] values) {
        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    /**
     * delete Given Node
     * @param node
     */
    public void deleteMiddleNode(Node node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Invalid node to delete");
        }
        node.value = node.next.value;
        node.next = node.next.next;

    }
    // Helper method to convert a linked list to a string for easier comparison
    public String linkedListToString(LL head) {
        StringBuilder sb = new StringBuilder();
        LL current = head;
        while (current != null) {
            sb.append(current.data).append("->");
            current = current.next;
        }
        return sb.toString().replaceAll("->$", "");
    }
}
