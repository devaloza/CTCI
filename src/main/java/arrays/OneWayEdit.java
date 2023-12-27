package arrays;

public class OneWayEdit {
    static boolean oneWayEdit(String str1, String str2) {
        if (str1.isEmpty() && str2.isEmpty()) return true;
        if (str1.length() == str2.length()) {
            return oneCharEdit(str1, str2);
        } else if (str1.length() - 1 == str2.length()) {
            return oneInsertDeleteChar(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return oneInsertDeleteChar(str1, str2);
        }
        return false;
    }
    static boolean oneCharEdit (String str1, String str2) {
        boolean isFound = false;
        for (int i = 0; i < str1.length()-1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (!isFound) {
                    isFound = true;
                } else {
                    return false;
                }
            }
        }
        return isFound;
    }
    static boolean oneInsertDeleteChar (String str1, String str2) {
        String shrt = str1.length() < str2.length() ? str1 : str2;
        String lng  = str1.length() < str2.length() ? str2 : str1;
        int index1 = 0;
        int index2 = 0;
        while (index1 < shrt.length() && index2 < lng.length()) {
            if (shrt.charAt(index1) != lng.charAt(index2)) {
                if (index1 !=index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(oneWayEdit("pale", "ple"));
        System.out.println(oneWayEdit("pales", "pale"));
        System.out.println(oneWayEdit("pale", "bale"));
        System.out.println(oneWayEdit("pale", "bae"));

    }
}
