import java.util.ArrayList;
// create a class for ItemDetails
class ItemDetails{
    String name;
    int price;
    int quantity;
    ItemDetails(String name, int price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}
// create a class for CartItem
class CartItem {
    private ArrayList<ItemDetails> items;

    CartItem() {
        items = new ArrayList<ItemDetails>();
    }
    // method to add item in cart
    public void addItem(String itemName, int price, int quantity) {
        ItemDetails newItem = new ItemDetails(itemName, price, quantity);
        items.add(newItem);
        System.out.println(itemName + "item added: ");
    }
    // method to remove item from cart
    public void removeItem(String itemName) {
//        boolean flag=false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equals(itemName)){
                items.remove(i);
                System.out.println(itemName + " has been removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " is not in the cart.");
    }
    // method to calculate total cost
    public int totalCost(){
        int tc=0;
        if(items.isEmpty()){
            return 0;
        }else{
            for(int i=0; i<items.size(); i++){
                tc+=(items.get(i).price*items.get(i).quantity);
            }
        }
        return tc;
    }
    // method to display the items in cart
    public void display(){
        if (items.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        for(ItemDetails it : items){
            System.out.println("name of item: "+it.name);
            System.out.println("quentity of item: "+it.quantity);
            System.out.println("price of item: "+it.price);

        }
        System.out.println("Total cost: "+totalCost());
    }

     public static void main(String[] args) {
      CartItem ci = new CartItem();
      ci.display();
      ci.addItem("Laptop", 800, 1);
      ci.addItem("Phone", 500, 2);
      ci.display();
    }
}