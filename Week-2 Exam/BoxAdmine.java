import java.util.HashMap;

interface MainBox {

    public void area();

    public int TotalGSMCost();

    public int boxCost();
    
}

class Box implements MainBox {

    int hight;
    int length;
    int width;
    int totalGSMCost = 0;

    int extraGSM = 0;

    char flute;
    int area = 0;

    int pastingCost = 0;

    Box() {

    }

    Box(int hight, int length, int width) {

        this.hight = hight;
        this.length = length;
        this.width = width;

    }

    @Override
    public void area() {

        area =  (hight * length * width);
    }

   

    public void setFlute(char flute) {

        this.flute = flute;
    }

    public void setGSMCost(int gsmCost) {

        totalGSMCost = gsmCost * 100;

    }

    public void isNeedOfExtraGSM(boolean extraGSM, HashMap<Character, Integer> flutes) {

        if (extraGSM) {
            this.extraGSM = flutes.get(flute);
        }

    }

    @Override
    public int TotalGSMCost() {

        return totalGSMCost + extraGSM;
    }

    public void setPastingCost(int pastingCost) {
        this.pastingCost = pastingCost;
    }

    public void boxPart(String partytype){

        if(partytype == "Double"){

            pastingCost =  pastingCost*3;
        }
    }

    @Override
    public int boxCost() {

        // System.out.println("area = "+area);
        // System.out.println("totalGSMCost = "+totalGSMCost);
        // System.out.println("extraGSM = "+extraGSM);
        // System.out.println("pastingCost = "+pastingCost);

        return (area * totalGSMCost * extraGSM * pastingCost);


    }

}

class Universal extends Box {



    

    Universal(int hight, int length, int width) {
        
        
        super(hight, length, width);
        
    }

}

class AllFlapMeeting extends Box {

    

    AllFlapMeeting(int hight, int length, int width) {
        
        super(hight, length, width);
    }
}

class HoneyComb extends Box {

    HoneyComb(int hight, int length, int width) {
        
        super(hight, length, width);
    }
}

class ReverseTuckIn extends Box {

    ReverseTuckIn(int hight, int length, int width) {
        
        super(hight, length, width);
    }

}

class TopOpening_SnapLock extends Box {

    TopOpening_SnapLock(int hight, int length, int width) {
        
    super(hight, length, width);
    }

}

public class BoxAdmine {

    public static void main(String[] args) {

        HashMap<Character, Integer> flute = new HashMap<>();

        flute.put('A', 10);
        flute.put('B', 30);
        flute.put('C', 20);
        flute.put('E', 40);
        flute.put('F', 50);
        flute.put('G', 20);

      

        Box universal = new Universal(6, 9, 6);

        // universal.setFlute('A');
        // universal.setPastingCost(10);
        // universal.isNeedOfExtraGSM(true, flute);
        // universal.area();
        // universal.boxPart("Double");
        // universal.setGSMCost(12);
        // System.out.println(universal.boxCost());


        Box allFlapMeeting = new AllFlapMeeting(3,4,5);
        Box honeyComb  = new HoneyComb(4,5,4);
        Box reverseTuckIn = new ReverseTuckIn(3,4,4);
        Box TopOpening_SnapLock = new TopOpening_SnapLock(3,4,4);


    }
}