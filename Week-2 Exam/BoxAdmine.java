import java.util.HashMap;

interface MainBox {

    public double area();

    public double pasting();

    public double TotalGSMCost();
}

class Box implements MainBox {

    double hight;
    double length;
    double width;

    double totalGSMCost = 0.0;

    double extraGSM = 0.0;

    double PastingCoust;
   Box(){

   }
    Box(double hight, double length, double width,double PastingCoust) {

        this.hight = hight;
        this.length = length;
        this.width = width;
        this.PastingCoust = PastingCoust;
    }

    @Override
    public double area() {

        return (hight * length * width);
    }

    @Override
    public double pasting() {  
        return PastingCoust;

    }

   
    public void setGSMCost(double gsmCost) {
        
        totalGSMCost =  gsmCost*100;
    }

    @Override
    public double TotalGSMCost() {
        // TODO Auto-generated method stub
        return  totalGSMCost+extraGSM;
    }

}
class Universal extends Box{

    Universal(double hight, double length, double width,double PastingCoust){
        super(hight,length,width,PastingCoust);
    }



}

class AllFlapMeeting extends Box{

}
class HoneyComb extends Box{
    
}
class ReverseTuckIn extends Box{
    
}
class TopOpening_SnapLock extends Box{
    
}


public class BoxAdmine {

    public static void main(String[] args) {
        
        HashMap<Character,Integer> flute = new HashMap<>();

        flute.put('A', 10);
        flute.put('B', 30);
        flute.put('C', 20);
        flute.put('E', 40);
        flute.put('F', 50);
        flute.put('G', 20);

        Box universal = new 
    }
}