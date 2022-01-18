// Write down a method boolean isNameValid(String name).
// A name is valid if following conditions are satisfied:
// • It does not contain any vowel more than once.
// • If the name contains two ‘S’, then there is not any ‘T’ in between them (both in capital cases).

public class NameValidation {

    static boolean sts(String name){
     
        boolean ctnT=false;
        boolean flg = false;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c=='S'||flg){flg = true;

                if (c=='T') {
                    ctnT = true;
                }
                if (ctnT && c=='S') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isNameValid(String str) {

        String vowel_cnt = "";

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == 'A' || c == 'E' || c == 'I' && c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u')

                if (vowel_cnt.contains(c + ""))
                    return false;

                else
                    vowel_cnt = vowel_cnt + c;

        }

        return true&&sts(str);
    }

    public static void main(String[] args) {
        String name = "TTTSTSTSTSS";
        System.out.println(isNameValid(name) ? "Valid name" : "not a valid name");
    }

}