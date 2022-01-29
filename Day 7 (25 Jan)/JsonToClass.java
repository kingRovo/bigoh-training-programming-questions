import java.util.*;



class Student{
    String firstName;
    String lastName;
    int age;
    Address address;

    ArrayList<PhoneNumber> phoneNumbers;

}
class PhoneNumber{

   String type;
   String phoneNumbers;
}

class Address{
    String streetAddress;
    String city;
    String state;
    int postalCode;
}


public class JsonToClass  {
    


    public static void main(String[] args) {
        

        Student student;
        

        String jsonObject ="{ 'firstName':'John','lastName':'Smith','age':'25','address':{"+
               "'streetAddress':'21 2nd Street','city':'New York','state':'NY','postalCode':10021},"+
            "'phoneNumbers':[{'type':'home','number':'212 555-1234'},{'type':'fax','number':'646 555-4567'}]}";



        String tempString = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<jsonObject.length();i++){

            char c = jsonObject.charAt(i);
            if (c=='{'||c=='[') {
                stack.push(c);
            }
            else if (c==" '") {
                
            }
        }



    }
}
