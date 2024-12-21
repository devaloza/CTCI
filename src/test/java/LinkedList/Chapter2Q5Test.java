package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Chapter2Q5Test {
    private LL createList(int... values) {
        LL dummyHead = new LL(0);
        LL current = dummyHead;
        for (int value : values) {
            current.next = new LL(value);
            current = current.next;
        }
        return dummyHead.next;
    }
    private String listToString(LL head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.data).append("->");
            head = head.next;
        }
        sb.append("null");
        return sb.toString();
    }
    @Test
    void testPartitionWithMixedValues() {
        LL l1 = createList(2, 4, 3); // 342
        LL l2 = createList(5, 6, 4); // 465
        Chapter2Q5 list = new Chapter2Q5();
        LL result = list.sumList(l1, l2);
        assertEquals("7->0->8->null", listToString(result));
    }

    @Test
    void testAddListsWithCarry() {
        LL l1 = createList(9, 9, 9); // 999
        LL l2 = createList(1);       // 1
        Chapter2Q5 list = new Chapter2Q5();
        LL result = list.sumList(l1, l2); // 1000 -> 0->0->0->1

        assertEquals("0->0->0->1->null", listToString(result));
    }

    @Test
    void testAddListsDifferentLengths() {
        LL l1 = createList(1, 8);    // 81
        LL l2 = createList(0);       // 0
        Chapter2Q5 list = new Chapter2Q5();
        LL result = list.sumList(l1, l2); // 81 -> 1->8

        assertEquals("1->8->null", listToString(result));
    }

    @Test
    void testAddListsBothEmpty() {
        Chapter2Q5 list = new Chapter2Q5();
        LL result = list.sumList(null, null); // Empty lists

        assertNull(result);
    }

    @Test
    void testAddListsOneEmpty() {
        Chapter2Q5 list = new Chapter2Q5();
        LL l1 = createList(7, 3);    // 37
        LL result = list.sumList(l1, null); // 37 -> 7->3

        assertEquals("7->3->null", listToString(result));
    }
}
