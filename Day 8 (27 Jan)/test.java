class Person{
    String name;
    String city;
    String country;
    Person(String name,String city,String country){

        this.name = name;
        this.city = city;
        this.country = country;
    }

}
class User extends Person{

    User(String name,String city,String country){
        super(name, city, country);
    }    

} 

class  Owner extends Person {

    Owner(String name,String city,String country){
        super(name, city, country);
    }
    
}

class country{

    String name;
    City city;
}

class City{
    String name;
    Wall wall;
}

class Wall{
    
    Owner owner;
    
}

class  Brick {

    String caption;
    String message;
    User usertoDedicate;

    public void paintBrick(String caption,String message,User usertoDedicate){
        this.caption = caption;
        this.message = message;
        this.usertoDedicate = usertoDedicate;
    }
   
}

public class test {
   public static void main(String[] args) {


    Object[City][Wall][Brick] arr = new Object[10][10][80];

    Brick brick = new Brick();
    arr[1][1][1] = brick;
  
    User user =   new User("Updesh","Agra","India");
    Brick brick = new Brick();                      //user to dedicate
    brick.paintBrick("Krishna","Jay Shree Krishna", "Krishna");

    for (int i = 0; i < args.length; i++) {
        for (int j = 0; j < args.length; j++) {
            for (int j2 = 0; j2 < args.length; j2++) {
                
            }
        }
    }

   }



}
