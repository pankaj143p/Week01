public class MobilePhone {
    // Attributes (Instance variables)
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize attributes
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display the details of the mobile phone
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        // Create MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 999);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S21", 799);

        // Display details of each phone
        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
    }
}
