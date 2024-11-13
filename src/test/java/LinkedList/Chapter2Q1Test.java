package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Chapter2Q1Test {
    @Test
    public void testRemoveDuplicates_NoDuplicates() {
        Chapter2Q1 list = new Chapter2Q1();
        list.add(1);
        list.add(2);
        list.add(3);

        list.removeDuplicate();
        assertEquals("1 2 3", list.toString(), "Expected linked list to remain the same with no duplicates");
    }

    @Test
    public void testRemoveDuplicates_WithDuplicates() {
        Chapter2Q1 list = new Chapter2Q1();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

        list.removeDuplicate();
        assertEquals("1 2 3", list.toString(), "Expected duplicates to be removed");
    }

    @Test
    public void testRemoveDuplicates_AllSame() {
        Chapter2Q1 list = new Chapter2Q1();
        list.add(1);
        list.add(1);
        list.add(1);

        list.removeDuplicate();
        assertEquals("1", list.toString(), "Expected only one element to remain after removing duplicates");
    }

    @Test
    public void testRemoveDuplicates_EmptyList() {
        Chapter2Q1 list = new Chapter2Q1();

        list.removeDuplicate();
        assertEquals("", list.toString(), "Expected an empty list to remain empty after removing duplicates");
    }

    @Test
    public void testRemoveDuplicates_SingleElement() {
        Chapter2Q1 list = new Chapter2Q1();
        list.add(1);

        list.removeDuplicate();
        assertEquals("1", list.toString(), "Expected a single element list to remain unchanged");
    }
}
