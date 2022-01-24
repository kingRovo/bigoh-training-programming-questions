        }

    }

    public void displayInfo() {

        System.out.println("Name : " + name + "   --   " + age);

        for (int i = 0; i < vehicles.size(); i++) {

            System.out.println(vehicles.get(i).displayVehicleInfo());

        }

    }

    public static void main(String[] args) {


        
        Person person = new Person("Updesh", 21);