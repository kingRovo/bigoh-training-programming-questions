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

class  Brickes {

    String caption;
    String message;
    User usertoDedicate;

    public void paintBrickes(String caption,String message,User usertoDedicate){
        this.caption = caption;
        this.message = message;
        this.usertoDedicate = usertoDedicate;
    }
   
}



public class AdmineBricks {
    


}
