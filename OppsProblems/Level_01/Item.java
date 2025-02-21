
import java.util.Scanner;
// Create a class Item with instance variables itemCode, itemName, price, and numberOfItems.
public class Item{
    public int itemCode;
    public String itemName;
    public int price;
    public static int numberOfItems;
    // Create a constructor Item(int itemCode, String itemName, int price) that initializes the instance variables.
    Item(int itemCode, String itemName, int price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    // Create a method calculateTotal(int numberOfItems, int price) that returns the total price of the items.
    public int calculateTotal(int numberOfItems, int price){
        return numberOfItems*price;
    }
    // Create a method display() that displays the item code, name, price, and total price of the items.
    public void display(){
        System.out.println("code of Item: "+itemCode);
        System.out.println("name of Item: "+itemName);
        System.out.println("price of Item: "+price);
        System.out.println("Total price of items: "+calculateTotal(numberOfItems, price));

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        numberOfItems=sc.nextInt();
        Item i=new Item(2003,"sugar",46);
        i.display();
    }
}