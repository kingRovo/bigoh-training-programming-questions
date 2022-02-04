

class HelloWorld {
    
    static HelloWorld ob= new HelloWorld();

    public static HelloWorld  getInst() {
        return ob;
    }
}

public class Main {

public static void main(String[] args) {
    
    HelloWorld ob = HelloWorld.getInst();
    System.out.println(ob);
}
    
}