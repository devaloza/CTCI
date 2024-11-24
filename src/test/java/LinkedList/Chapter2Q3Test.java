package Chapter2Q3;

import LinkedList.LL;
import linkedList.Chapter2Q3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Chapter2Q3Test {
    @Test
    void testKthToLast_ValidInput() {
        Chapter2Q2 list = new Chapter2Q2();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(4, list.returnKthToLast(1)); // 1st to last element is 4
        assertEquals(5, list.returnKthToLast(0)); // Last element is 5
        assertEquals(1, list.returnKthToLast(4)); // 4th to last element is 1
    }

    @Test
    void testKthToLast_SingleElementList() {
        Chapter2Q2 list = new Chapter2Q2();
        list.add(42);

        assertEquals(42, list.returnKthToLast(0)); // Only element is 42
      //  assertThrows(IllegalArgumentException.class, () -> list.returnKthToLast(1)); // k out of bounds
    }

    @Test
    void testKthToLast_EmptyList() {
        Chapter2Q2 list = new Chapter2Q2();

        assertThrows(IllegalArgumentException.class, () -> list.returnKthToLast(0)); // Invalid for empty list
    }

    @Test
    void testKthToLast_KGreaterThanSize() {
        Chapter2Q2 list = new Chapter2Q2();
        list.add(10);
        list.add(20);
        list.add(30);

        assertThrows(IllegalArgumentException.class, () -> list.returnKthToLast(5)); // k > size of list
    }

    @Test
    void testKthToLast_NegativeK() {
        Chapter2Q2 list = new Chapter2Q2();
        list.add(10);
        list.add(20);
        list.add(30);

        assertThrows(IllegalArgumentException.class, () -> list.returnKthToLast(-1)); // Negative k
    }



    @Test
    void testDeleteMiddleSingleElement() {
        Chapter2Q3 list = new Chapter2Q3();
        Chapter2Q3.Node head = new Chapter2Q3().Node(1);

        assertNull(list.deleteMiddle(head), "Deleting the middle of a single-element list should return null.");
    }

    @Test
    void testDeleteMiddleTwoElements() {
        Chapter2Q3 list = new Chapter2Q3();
        Chapter2Q3.Node head = new Chapter2Q3().Node(1);
        head.next = new Chapter2Q3().Node(2);

        Chapter2Q3.Node result = list.deleteMiddle(head);
        assertEquals(1, result.value, "Head value should remain 1.");
        assertNull(result.next, "The second node should be removed.");
    }

    @Test
    void testDeleteMiddleOddLength() {
        Chapter2Q3 list = new Chapter2Q3();
        Chapter2Q3.Node head = new Chapter2Q3().Node(1);
        head.next = new Chapter2Q3().Node(2);
        head.next.next = new Chapter2Q3().Node(3);

        Chapter2Q3.Node result = list.deleteMiddle(head);
        assertEquals(1, result.value, "Head value should remain 1.");
        assertEquals(3, result.next.value, "Node with value 3 should come after the head.");
        assertNull(result.next.next, "No more nodes should exist after the second node.");
    }

    @Test
    void testDeleteMiddleEvenLength() {
        Chapter2Q3 list = new Chapter2Q3();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        LL result = list.deleteMiddleNode();

        assertEquals(1, result.data, "Head value should remain 1.");
        assertEquals(3, result.next.data, "Node with value 3 should come after the head.");
        assertEquals(4, result.next.next.data, "Node with value 4 should remain in the list.");
        assertNull(result.next.next.next, "No more nodes should exist after the third node.");
    }

    @Test
    void testDeleteMiddleNullHead() {
        Chapter2Q3 list = new Chapter2Q3();

        assertNull(list.deleteMiddle(null), "Deleting middle of null head should return null.");
    }

}
