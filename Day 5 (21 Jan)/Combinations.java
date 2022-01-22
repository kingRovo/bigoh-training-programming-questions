//Write a program to print all the possible combinations according to the input values.


import java.util.*;
public class Combinations {

    public static void main(String[] args) {
        
    
    HashMap<String,Character[]> value = new HashMap<>();

    Character list1[] = new Character[]{'Z','Y','A'};
    Character list2[] = new Character[]{'B','O'};
    Character list3[] = new Character[]{'L'};
    Character list4[] = new Character[]{'U','P'};
   
    value.put("1", list1);
    value.put("2", list2);
    value.put("12", list3);
    value.put("3", list4);

    String input = "123";
   
    int mxSize=list1.length>list2.length?list1.length>list3.length?list1.length:list3.length:list2.length;
   
    mxSize = mxSize>list4.length?mxSize:list4.length;

    System.out.println(mxSize);
    ArrayList<String> result = new ArrayList<>();

    String contain = "";
    int index=0;
    while (mxSize>index) {

        if (index<list1.length) {
            
            
        }
        
    }
    

}
}