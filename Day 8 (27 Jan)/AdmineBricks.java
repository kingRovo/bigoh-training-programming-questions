import java.util.*;;

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

    public void dedicateBricks(Brick brick,String caption,String message,User dedicate){

        brick.paintBrick(caption, message, dedicate);
    }

} 

class  Owner extends Person {

    Owner(String name,String city,String country){
        super(name, city, country);
    }
    
}

class Country{

    String name;
    String areaZone; //eg. asia,Europe.
    City city;
    Country(String name,String areaZone){
        this.name = name;
        this.areaZone = areaZone;
    }

}

class City{

    String name;
    String state;
    Wall wall;
    City(String name,String state){
        this.name = name;
        this.state = state;
    }

   
}

class Wall{

    String street;
    int id;
    Brick brick;
    Owner owner;
    int bricksCount = 0;

    ArrayList<Brick>bricks = new ArrayList<>();

    Wall(String street,int id){

        this.street =  street;
        this.id = id;
    }
    
}

class  Brick {

    String caption;
    String message;
    User usertoDedicate;
    int id;
    Brick(int id){
        this.id = id;
    }

    HashMap<User,Integer> dedicateUsers = new HashMap<>();

    public void paintBrick(String caption,String message,User dedicateUser){
        this.caption = caption;
        this.message = message;
        if(!dedicateUsers.containsKey(dedicateUser)){
                
            dedicateUsers.put(dedicateUser,1);
        }
        else
        {
            dedicateUsers.put(dedicateUser,dedicateUsers.get(dedicateUser)+1);
        }

        
    }
   
}



public class AdmineBricks {
    

    public static void main(String[] args) {

        Country  country = new Country("India","Asia");

        country.city = new City("Agra","UP");
        country.city.wall = new Wall("Dayal Bagh",1);

        country.city.wall.owner = new Owner("Shubh","Agra","India");

        Wall wall =country.city.wall;
        // Brick brick = new Brick(1);
        // Brick brick2 = new Brick(2);
        // Brick brick3 = new Brick(3);
        // Brick brick4 = new Brick(4);
        // wall.setBricks(brick);
        // wall.setBricks(brick2);
        // wall.setBricks(brick3);
        // wall.setBricks(brick4);

        ArrayList<Brick>bricks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            wall.bricks.add(new Brick(i)); 
        }
            
        User user1 = new User("Updesh","Agra", "India");
        User user2 = new User("Krishna","Mathura", "India");
        User user3 = new User("Shikha","Gurugram", "India");

        
        int paintBrickonId = 3;

        Brick brick = bricks.get(paintBrickonId);
        
        user1.dedicateBricks(brick, "krishna","We love you forever",user2);


    }
   


}
