class Solution {
    public static int FindLength(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count last word length
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {

        //test cases
        String str = "hi how are you";
        System.out.println(FindLength(str));

        str = "i love progamming";
        System.out.println(FindLength(str));

        str = "java is good language";
        System.out.println(FindLength(str));

        str = "my name is ganesh";
        System.out.println(FindLength(str));

        str = ""; // testing edge case
        System.out.println(FindLength(str));

        str = "t"; // testing edge case
        System.out.println(FindLength(str));
    }
}