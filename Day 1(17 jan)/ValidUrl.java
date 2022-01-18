// Write a function Boolean isValidURL(String url)

import java.util.regex.*;

class ValidUrl {

    public static boolean isValidURL(String url) {

        String regex = "((http|https|ftp)://)(www.)?"+ "[a-zA-Z0-9@:%._\\+~#?&//=]"+ "{2,256}\\.[a-z]"
                     + "{2,6}\\b([-a-zA-Z0-9@:%"
                     + "._\\+~#?&//=]*)";

        Pattern p = Pattern.compile(regex);

        if (url == null) {
            return false;
        }

        Matcher m = p.matcher(url);

        return m.matches();
    }

    public static void main(String args[]) {
        String url = "https://bigogtech.com";

        System.out.println(isValidURL(url)?"Valid " : "invalid");
       
    }
}
