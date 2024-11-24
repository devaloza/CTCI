package LinkedList;

import LinkedList.LL;
import LinkedList.Chapter2Q3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Chapter2Q3Test {



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
}
