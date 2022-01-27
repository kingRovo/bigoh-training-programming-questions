class Constant {
    final static long spendingLimit_MP = 100000;
    final static long spendingLimit_Minster = 1000000;
    final static long spendingLimit_PM = 10000000;
}

class Person {
    private String name;
    private int age;

    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}

class Driver extends Person {

    String Drive;

    Driver(String name, int age, String Drive) {

        super(name, age);
        this.Drive = Drive;
    }

    public String getDriver() {
        return super.getName();
    }

}

class Pilot extends Person {

    String pilotOf;

    Pilot(String name, int age, String pilotOf) {

        super(name, age);
        this.pilotOf = pilotOf;
    }

    public String getPilot() {
        return super.getName();
    }
}

class MP extends Person {

    String constituency;

    int totalExpense;
    String name;
    int age;
    String role;

    MP() {

    }

    MP(String name, int age, String winning_constituency, int totalExpense, String role) {

        super(name, age);
        this.name = name;
        this.age = age;
        this.role = role;
        this.constituency = winning_constituency;
        this.totalExpense = totalExpense;
    }

    Driver driver;

    public void setDriver(String name, int age, String Drive) {

        driver = new Driver(name, age, Drive);

    }

    public String getDriver() {

        return driver.getName();

    }

    boolean exceedsSpendingLimit() {

        if (Constant.spendingLimit_MP < totalExpense)
            return true;

        else
            return false;
    }

    String getConstituency() {
        return this.constituency;
    }

}

class Minister extends MP {

    final long spendingLimit = 1000000;

    Minister(String name, int age, String Constituency, int totalExpense, String role) {

        super(name, age, Constituency, totalExpense, role);

    }

    boolean exceedsSpendingLimit() {

        if (Constant.spendingLimit_Minster < totalExpense)
            return true;

        else
            return false;
    }

}

class PM extends MP {

    final long spendingLimit = 10000000;

    PM(String name, int age, String Constituency, int totalExpense, String role) {

        super(name, age, Constituency, totalExpense, role);
    }

    boolean givePermission(boolean canArrest) {
        return canArrest;
    }
    boolean exceedsSpendingLimit() {

        if (Constant.spendingLimit_PM < totalExpense)
            return true;

        else
            return false;
    }

    Pilot pilot;

    public void setPilot(String name, int age, String pilotOf) {

        pilot = new Pilot(name, age, pilotOf);

    }

    public String getPilot() {
        return pilot.getName();
    }

}

class Commisioner  extends Person{

    Commisioner(String name, int age){
        super(name,age);
    }


    boolean canArrest(MP mp,PM pm){

        
        if (!mp.exceedsSpendingLimit()) {
            return false;    
        }
        if(mp.role=="Minister"){
             
            if (pm.givePermission(true)) {
                return true;
            }
        }
        if (mp.role=="PM") {

            return false;
            
        }
        else return true;

    }

}

public class Politics {

    public static void main(String[] args) {
        
        MP mp = new PM("Updesh Yadav", 46,"Mathura",470000,"PM");
        PM pm =(PM)mp; 
        Commisioner commisioner = new Commisioner("Raj",45);
        
        MP minister = new Minister("Rahul",37,"Agra",5600000,"Minister");

        System.out.println(commisioner.canArrest(minister,pm));

        


    }

}
