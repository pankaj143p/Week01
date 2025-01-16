import java.util.ArrayList;
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
class CartItem {
    private ArrayList<ItemDetails> items;

    CartItem() {
        items = new ArrayList<ItemDetails>();
    }

    public void addItem(String itemName, int price, int quantity) {
        ItemDetails newItem = new ItemDetails(itemName, price, quantity);
        items.add(newItem);
        System.out.println(itemName + "item added: ");
    }
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