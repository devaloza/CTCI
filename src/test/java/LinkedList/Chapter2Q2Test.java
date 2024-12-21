package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class Chapter2Q2Test {
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
}
