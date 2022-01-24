import java.util.ArrayList;

abstract class Politician {
    String name;
    int age;
    int winning_constituencys;
    static int max_speed = 60;
    long spending_limit;
    String Vehicle;

}

class PM extends Politician{
    
   
   ArrayList<String> Vehicles = new ArrayList<>();
    
    PM(String name,int age,int winning_constituencys){

        super.name=name;
        super.age = age;
        super.winning_constituencys=winning_constituencys;
    }
    public void Setspending_limit(long spending_limit){
        super.spending_limit = spending_limit;
    }

    public void SetVehicle(String Vehicle){
        Vehicles.add(Vehicle);
    }

    public void setConstituency(int winning_constituencys){

        this.winning_constituencys = winning_constituencys;
    }
    public int getConstituency(){
        return this.winning_constituencys;

    }

    





    




}

public class Politics {

}
