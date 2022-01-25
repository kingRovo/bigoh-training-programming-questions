import java.util.*;

class Vehicle {

    private String name;
    private String model;
    private String type;
    private String colour;

    Vehicle() {
    }

    Vehicle(String name, String model, String colour, String type) {
        this.type = type;
        this.name = name;
        this.model = model;
        this.colour = colour;

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

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    String displayVehicleInfo() {

        return type + "  " + name + "  " + model + "  " + colour;

    }

}

class Car extends Vehicle {

    Car(String name, String model, String colour, String type) {
        super(name, model, colour, type);

    }

    String displayVehicleInfo() {

        return super.getType() + "  " + super.getName() + "  " + super.getModel() + "  " + super.getColour();

    }

}

class Bike extends Vehicle {

    Bike(String name, String model, String colour, String type) {
        super(name, model, colour, type);

    }

    String displayVehicleInfo() {

        return super.getType() + "  " + super.getName() + "  " + super.getModel() + "  " + super.getColour();

    }

}

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(String type, String name, String model, String colour) {

        if (type == "Car") {
            vehicles.add(new Car(name, model, colour, type));
        } else {
            vehicles.add(new Bike(name, model, colour, type));
        }

    }

    public void displayInfo() {

        System.out.println("Name : " + name + "   --   " + age);

        if (vehicles.size() < 1) {
            System.out.println(name + " does't have any Vehicle");
        }

        for (int i = 0; i < vehicles.size(); i++) {

            System.out.println(vehicles.get(i).displayVehicleInfo());

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name and age of a person : ");
        String name  =  scanner.nextLine();
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        System.out.println("Number of vehicle have? :");
        
        int numofVehicle = scanner.nextInt();
        scanner.nextLine();

            for (int i = 0; i < numofVehicle; i++) {
                System.out.println("Add Vehicle num " + (i + 1));
                                 // type(car/bike)       model               color              type
                person.addVehicle(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            }

            person.displayInfo();

        

        scanner.close();
        
    }

}
