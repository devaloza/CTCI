package arrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneWayEditTest { 
    private OneWayEdit s = new OneWayEdit();
    @Test
    public void withEmpty() {
        assertTrue(s.oneWayEdit("", ""));
    }

    @Test
    public void withOneEmpty() {
        assertTrue(s.oneWayEdit("", "b"));
    }

   // @Test
//    public void withTwoSingleWords() {
//        assertTrue(s.oneWayEdit("a", "b"));
//    }

    @Test
    public void withOneInsertion() {
        assertTrue(s.oneWayEdit("pae", "pale"));
    }

    @Test
    public void withOneDeletion() {
        assertTrue(s.oneWayEdit("pales", "paes"));
    }

    @Test
    public void withOneReplace() {
        assertTrue(s.oneWayEdit("pawe", "pave"));
    }

    @Test
    public void withMoreEdits() {
        assertFalse(s.oneWayEdit("paxye", "pamne"));
    }
}
