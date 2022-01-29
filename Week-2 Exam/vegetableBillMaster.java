import java.util.HashMap;

class VegetableBill {

    HashMap<String, Double> billItems = new HashMap<>();

    HashMap<String, Double> discounts = new HashMap<>();

    Double totalCost = 0.0;

    VegetableBill() {
    }


    Employee clerk;
    public VegetableBill(Employee clerk) {   
        
        this.clerk =clerk; 

    }
    
    public void addItem(Item item) {
        billItems.put(item.getName(), item.getPrice());
        if(clerk.applyforDiscount)
        discounts.put(item.getName(), item.getDiscount());
        else
        discounts.put(item.getName(), 0.0);


    }

    public double getTotal() {

        for (String item : billItems.keySet()) {

            totalCost = totalCost + billItems.get(item);
        }

        return totalCost;
    }

    double totaldiscount = 0.0;
    public void printReceipt( DiscountBill discountBill) {

        System.out.println(" ---  Item        Price             Disccount");
        for (String item : billItems.keySet()) {

            System.out.println(" ---  " + item + "    " + billItems.get(item)+"      " +discounts.get(item));

        }

        System.out.println("--------------------------------------");

        System.out.println();

        
        if (clerk.applyforDiscount) {
            totaldiscount = discountBill.getDiscountAmount();
        }
        System.out.println("  ---  Total Disccount =   "+totaldiscount);
        System.out.println("  ---  Total Amount   =  " + totalCost);

        System.out.println("  ---  Total Amount to Pay   =  " +(totalCost-totaldiscount));
        


    }

}
// class Person{

// }
class Employee {

    String name;
    int age;
    String location;
    boolean applyforDiscount;

    public void setApplyforDiscount(boolean applyforDiscount) {
        this.applyforDiscount = applyforDiscount;
    }
    public boolean getpreferred(){
        return applyforDiscount;
    }

    Employee(String name, String location, int age) {

        this.name = name;
        this.age = age;
        this.location = location;
    }

}
// class Customer extends Person{

// }

class Item {

    private String name;
    private double price;
    private double discount = 0.0;

    Item(String name, double price, double discount) {

        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

}

/**
 * DiscountBill
 */
class DiscountBill extends VegetableBill {

    boolean isDiscountApply = false;

    VegetableBill vegetableBill;
    public DiscountBill(Employee clerk,VegetableBill vegetableBill) {

        

        this.vegetableBill = vegetableBill;
        vegetableBill.getTotal();
        isDiscountApply = clerk.getpreferred();

    }


    public int getDiscountCount() {

        int discountCount = 0;
        if (isDiscountApply) {

            for (String item : vegetableBill.discounts.keySet()) {

                if (vegetableBill.discounts.get(item) > 0.0)
                    discountCount++;
            }
        }
        return discountCount;
    }

    int discountAmount = 0;

    public double getDiscountAmount() {

    
        if (isDiscountApply) {

            //System.out.println(vegetableBill.discounts);
            for (String item : vegetableBill.discounts.keySet()) {

                discountAmount += vegetableBill.discounts.get(item);
            }
        }
        return discountAmount;
    }

    public double getDiscountPercent() {
        if (isDiscountApply)

            return (discountAmount / vegetableBill.totalCost) * 100;

        return 0.0;

    }
}

public class vegetableBillMaster {

    public static void main(String[] args) {
        
        Employee clerk = new Employee("Raz", "Agra", 23);
        clerk.setApplyforDiscount(true);
       

        Item item = new Item("Tomato", 39.0, 0.0);
        Item item2 = new Item("Onion", 49.0, 2.0);
        
        
        VegetableBill vegetableBill = new VegetableBill(clerk);
        vegetableBill.addItem(item);
        vegetableBill.addItem(item2);

        DiscountBill discountBill  = new DiscountBill(clerk,vegetableBill); 

        vegetableBill.printReceipt(discountBill);
        

    }
}