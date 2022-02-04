
import java.util.*;

public class Combinations {

    static Character[][] numberToCharMap;

    private static List<String> printWords(int[] numbers,int len, int numIndex, String s) {

        if (len == numIndex) {
            return new ArrayList<>(Collections.singleton(s));
        }

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < numberToCharMap[numbers[numIndex]].length; i++) {
            String sCopy = String.copyValueOf(s.toCharArray());
            sCopy = sCopy.concat(
                    numberToCharMap[numbers[numIndex]][i].toString());
            stringList.addAll(printWords(numbers, len,
                    numIndex + 1,
                    sCopy));
        }
        return stringList;
    }

    private static void printWords(int[] numbers) {
        generateNumberToCharMap();
        List<String> stringList = printWords(numbers, numbers.length, 0, "");
        stringList.stream().forEach(System.out::println);
    }

    private static void generateNumberToCharMap() {
        numberToCharMap = new Character[4][3];

        numberToCharMap[1] = new Character[] { 'Z', 'Y', 'A' };
        numberToCharMap[2] = new Character[] { 'B', 'O' };
    
        numberToCharMap[3] = new Character[] { 'U', 'P' };

    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3 };
        printWords(number);
    }
}


