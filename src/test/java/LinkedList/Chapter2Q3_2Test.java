package LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Chapter2Q3_2Test {

    // Helper method to create a linked list from an array
    private Node createLinkedList(int[] values) {
        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to convert a linked list to a string for easier comparison
    private String linkedListToString(Node head) {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append("->");
            current = current.next;
        }
        return sb.toString().replaceAll("->$", "");
    }

    // Test case: delete node 'c' from the list a->b->c->d->e->f
    @Test
    public void testDeleteMiddleNode() {
        Node head = createLinkedList(new int[]{1, 2, 3, 4, 5, 6}); // a->b->c->d->e->f
        Node nodeToDelete = head.next.next; // Node 'c'

        // Call the method
        deleteMiddleNode(nodeToDelete);

        // Expected result: a->b->d->e->f
        assertEquals("1->2->4->5->6", linkedListToString(head));
    }

    // Test case: delete node 'd' from the list a->b->c->d->e->f
    @Test
    public void testDeleteAnotherMiddleNode() {
        Node head = createLinkedList(new int[]{1, 2, 3, 4, 5, 6}); // a->b->c->d->e->f
        Node nodeToDelete = head.next.next.next; // Node 'd'

        // Call the method
        deleteMiddleNode(nodeToDelete);

        // Expected result: a->b->c->e->f
        assertEquals("1->2->3->5->6", linkedListToString(head));
    }

    // Test case: trying to delete the last node (should not be deleted)

    // Test case: null input
    @Test
    public void testDeleteNullNode() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            deleteMiddleNode(null); // This should throw an exception
        });
        assertEquals("Invalid node to delete", exception.getMessage());
    }

    // Implementation of deleteMiddleNode
    private void deleteMiddleNode(Node node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Invalid node to delete");
        }
        node.value = node.next.value;
        node.next = node.next.next;
    }
}
