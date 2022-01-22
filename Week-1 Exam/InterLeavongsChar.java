public class InterLeavongsChar {

    static void findInterleavings(String str1, String str2, int str1Index, int str2Index, String result) {

        if (str1Index == str1.length() && str2Index == str2.length())
            System.out.println(result);

        if (str1Index < str1.length()) {

            findInterleavings(str1, str2, str1Index + 1, str2Index, result + str1.charAt(str1Index));
        }
        if (str2Index < str2.length()) {

            findInterleavings(str1, str2, str1Index, str2Index + 1, result + str2.charAt(str2Index));
        }

    }

    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "CDE";
        findInterleavings(str1, str2, 0, 0, "");

    }
}
