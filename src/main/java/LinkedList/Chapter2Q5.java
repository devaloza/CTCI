package LinkedList;


public class Chapter2Q5 {
    public LL sumList(LL list1, LL list2) {
        return sumListHelper(list1, list2, 0);
    }
    private LL sumListHelper(LL l1, LL l2, int carry) {
        if (l1 == null && l2 == null && carry ==0) {
            return null;
        }
        LL result = new LL();
        int value = carry;
        if (l1 !=null) {
            value +=l1.data;
        }
        if (l2 !=null) {
            value +=l2.data;
        }
        result.data = value % 10;
        if (l1 !=null || l2 !=null) {
            result.next = sumListHelper(l1 == null ? null : l1.next,
                                        l2 == null ? null : l2.next,
                                        value /10);
        }
        return result;
    }
}
