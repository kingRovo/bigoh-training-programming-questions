class Vehicles {

    private String type;
    private String name;
    private String model;
    private String colour;

    //vehicles(){}
    // vehicles(String type, String name, String model, String colour) {
    //     this.type = type;
    //     this.name = name;
    //     this.model = model;
    //     this.colour = colour;

    // }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void displayVehicleInfo(){
        System.out.println("Vehicle : "+this.type);
        System.out.println(" Name   : "+this.name);
        System.out.println(" Model  : "+this.model);
        System.out.println(" Colour : "+this.colour);
    }



}




public class Person extends Vehicles {
    private String name;
    private int age;
    


    Person(String name,int age){ 
        this.name = name;
        this.age = age;
    }

    public void addVehicle(String type, String name, String model, String colour){
        super.setType(type);
        super.setName(name);
        super.setModel(model);
        super.setColour(colour);
        
    }
    public void displayInfo(){

        System.out.println("Name : "+this.name+"  ---  Age"+this.age);

        super.displayVehicleInfo();
    }

    public static void main(String[] args) {
        

        Person person =  new Person("Updesh",21);

        person.addVehicle("Car","BMW","T2019", "Green");

        person.displayInfo();
    }
  
  
}
