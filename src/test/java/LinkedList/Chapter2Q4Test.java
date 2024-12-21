package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Chapter2Q4Test {
    @Test
    void testPartitionWithMixedValues() {
        Chapter2Q4 list = new Chapter2Q4();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);

        int partitionValue = 5;

        list.partition(partitionValue);

        // Verify the partitioning
        assertEquals("1 -> 2 -> 3 -> 5 -> 8 -> 5 -> 10 -> null", list.listToString());
    }

    @Test
    void testPartitionWithAllSmallerValues() {
        Chapter2Q4 list = new Chapter2Q4();
        list.add(1);
        list.add(2);
        list.add(3);

        int partitionValue = 5;
        list.partition(partitionValue);
        // Verify that the list remains unchanged
        assertEquals("3 -> 2 -> 1 -> null", list.listToString());
    }
    @Test
    void testPartitionWithAllLargerValues() {
        Chapter2Q4 list = new Chapter2Q4();
        list.add(6);
        list.add(7);
        list.add(8);

        int partitionValue = 5;
        list.partition(partitionValue);

        // Verify that the list remains unchanged
        assertEquals("6 -> 7 -> 8 -> null", list.listToString());
    }
    @Test
    void testPartitionWithSingleNode() {
        Chapter2Q4 list = new Chapter2Q4();
        list.add(3);

        int partitionValue = 5;

        list.partition(partitionValue);

        // Verify the single node list remains unchanged
        assertEquals("3 -> null", list.listToString());
    }
}
