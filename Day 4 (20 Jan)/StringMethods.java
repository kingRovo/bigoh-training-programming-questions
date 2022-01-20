
// Make a StringUtils class which contains following methods
// NOTE: You can use only String.charAt(), methods to code this problem.(Don't use any other inbuilt functions)
// static int countChar(String str,char ch)
// - Returns occurrence of the given character in the given String (str).
// static String substring(String str,int start,int end)
// - Returns a substring from the start index to end index with all validation checks.
// static String[] split(String str,char ch)
// - Returns an array of strings broken according to the occurrence of the given character with validation checks.
// static Boolean hasPattern(String str,String pattern)
// - Returns true if the give string (pattern) found in the main string (str) otherwise false.
// static Boolean allWordsContainsChar(String str,char ch)
// - Returns true if all words of the given string (str) contains the given character (ch)  otherwise false.
// static String reverse(String str)
// - Returns the reverse of the String (Without using extra String or array)
// static String reverseVowels(String str)
// - Reverse only all the vowels in the string and return it ( Example : 

public class StringMethods {

    static int countChar(String str, char ch) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ch)
                cnt++;

        return cnt;
    }

    static String substring(String str, int start, int end) {

        String subStr = "";
        for (int i = start; i < end; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    static String[] split(String str, char ch) {

        String strArr[] = new String[str.length()];

        String ctn = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ch) {

                strArr[i] = ctn;
                ctn = "";
            } else
                ctn += c;
            if (i == str.length() - 1) {
                strArr[i] = ctn;
            }

        }
        return strArr;
    }

    static Boolean hasPattern(String str, String pattern) {

        if (pattern.length() == 0 || pattern.length() > str.length()) {
            return false;
        }

        char ptrCh = pattern.charAt(0);

        for (int j = 0; j < str.length(); j++) {

            int cnt = 1;

            if (ptrCh == str.charAt(j)) {

                for (int k = 1; k < pattern.length(); k++) {

                    if (pattern.charAt(k) == str.charAt(j + k)) {
                        cnt++;

                    }
                    if (cnt == pattern.length()) {
                        return true;
                    }

                }

            }

        }

        return false;
    }

    static String reverse(String str) {

        char[] ch = str.toCharArray();
        char temp;
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        str = String.valueOf(ch);
        return str;

    }

    static Boolean allWordsContainsChar(String str, char ch) {

        boolean ctn = false;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == ch) {
                ctn = true;
            }
            if (c == ' ' || c == '\n' || i == str.length() - 1) {
                if (ctn == false) {
                    return false;
                }
                ctn = false;

            }

        }
        return true;

    }

    static String reverseVowels(String str) {

        char[] ch = str.toCharArray();
        char temp;
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {

            if (isVowel(ch[l])&&isVowel(ch[r])) {

                temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
            else if (isVowel(ch[l]) && isVowel(ch[r])!=true) {
                r--;
            }
            else if (isVowel(ch[l])!=true && isVowel(ch[r])) {
                l++;
            }
            else {
            l++;
            r--;
        }

            
        }
        str=String.valueOf(ch);return str;

    }

    static boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o'
                || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {

        String string = "liipcoce";

        //System.out.println("Count Char : " + countChar(string, 'e'));

        System.out.println(reverseVowels(string));

        // System.out.println("Substring :"+substring(string, 1, 3));

        // System.out.println("Hash Pattren :" + hasPattern(string, "saym"));

        // System.out.println("split :");
        // for (int i = 0; i < split(string, 'd').length; i++) {
        // if (split(string, 'd')[i]!=null)
        // System.out.print(split(string, 'd')[i]+" ");
        // }
        // StringBuilder str = new StringBuilder("Updesh");
        // System.out.println("Reverse :" + reverse(string));

        // System.out.println(" All Words Contains Char : "+allWordsContainsChar(string,
        // 'a'));

    }
}
