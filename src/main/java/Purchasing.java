import java.util.*;
import java.text.DecimalFormat;

public class Purchasing {
  public static void main(String[] args) {
    
    String productName = null;
    int quantity;
    double price;
    double totalPrice;
    double overAllPrice = 0.0;

    Scanner nic = new Scanner(System.in);

      System.out.println("Enter the name of the item you are purchasing.");
      productName = nic.nextLine();
      
      System.out.println("Enter the quantity and price seperated by a space.");
      quantity = nic.nextInt();
      price = nic.nextDouble();
      
      System.out.println("You are purchasing " + quantity + " " + productName + "(s) at " + price + " each");
      
      totalPrice = price * quantity;

      DecimalFormat cole = new DecimalFormat("0.00");
      System.out.print("Amount due is ");
      System.out.println(cole.format(overAllPrice += totalPrice));
      
    nic.close();
  }
}

class LabExer2 {
  
  private String itemName;
  private double itemPrice;
  private int itemQuantity;
  private double amountDue;


  public String setItemName() {
    return itemName;
  }
  public int getitemQuantity() {
    return itemQuantity;
  }
  public double itemPrice() {
    return itemPrice;
  }
  public double amountDue() {
    return amountDue;
  } 
}

