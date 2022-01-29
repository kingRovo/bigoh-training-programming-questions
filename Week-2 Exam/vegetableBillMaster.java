public class vegetableBillMaster {
    
}
class VegetableBill{

   public VegetableBill(Employee clerk){

   }

   public void add(Item item){

   }
   public double getTotal(){

    return 0.0;
   }
   public void printReceipt(){
       
   }

}
class Employee{

}

class Item{

    private String name;
    private double price;
    private double discount = 0.0;

    Item(String name,double price,double discount){

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
 *  DiscountBill 
 */
public class  DiscountBill extends VegetableBill {

    public DiscountBill(Employee clerk,boolean preferred){

    }
    public int getDiscountCount(){

        return 0;
    }
    public double getDiscountAmount(){

        return 0.0;
    }

    public double getDiscountPercent(){
        return 0.0;
    }
}