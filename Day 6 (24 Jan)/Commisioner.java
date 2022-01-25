
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

    int winning_constituency;
    final long spendingLimit = 100000;
    static int totalExpense;
    String name;
    int age;

    MP() {

    }

    MP(String name, int age, int winning_constituency, int totalExpense) {

        super(name, age);
        this.name = name;
        this.age = age;
        this.winning_constituency = winning_constituency;
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

        if (spendingLimit < totalExpense)
            return true;

        else
            return false;
    }

    int getConstituency() {
        return this.winning_constituency;
    }

}

class Minister extends MP {

    final long spendingLimit = 1000000;

    Minister(String name, int age, int totalConstituency, int totalExpense) {

        super(name, age, totalConstituency, totalExpense);

    }

    Driver driver;

    public void setDriver(String name, int age, String Drive) {

        driver = new Driver(name, age, Drive);

    }

    public String getDriver() {

        return driver.getName();

    }

    boolean exceedsSpendingLimit() {

        if (spendingLimit < totalExpense)
            return true;

        else
            return false;
    }

    int getConstituency() {
        return this.winning_constituency;
    }

}

class PM extends MP {

    final long spendingLimit = 10000000;

    PM(String name, int age, int totalConstituency, int totalExpense) {

        super(name, age, totalConstituency, totalExpense);
    }

    boolean givePermission(boolean canArrest) {
        return canArrest;
    }

    Driver driver;

    public void setDriver(String name, int age, String Drive) {

        driver = new Driver(name, age, Drive);

    }

    public String getDriver() {

        return driver.getName();

    }

    Pilot pilot;

    public void setPilot(String name, int age, String pilotOf) {

        pilot = new Pilot(name, age, pilotOf);

    }

    public String getPilot() {
        return pilot.getName();
    }

    int getConstituency() {
        return this.winning_constituency;
    }

}

public class Commisioner {

    public static void main(String[] args) {

        //MP 
        MP mp = new MP("Raz Kumar",46,12,50000);
        mp.setDriver("Rahul",33,"Car");

        if(mp.exceedsSpendingLimit()){
            System.out.println(mp.name+" Arrested...");
        }
        
        PM pm = new PM("Updesh Yadav", 33, 89, 1200000);

        pm.setDriver("Ram gopal", 46, "Car");
        pm.setPilot("Rajendra", 44, "Aircraft");
        
        
        //Minister

        Minister minister  = new Minister("Shubh",52,3,70000);

        minister.setDriver("Raju", 30, "Car");

        if(minister.exceedsSpendingLimit()){

            if (pm.givePermission(true)) {
                
                System.out.println(minister.name+" Arrested...");

            }
        }



    }

}
