// create a class Book with the following private attributes
class Book{
    private String title;
    private String auther;
    private int price;
    Book(String title, String auther, int price){
        this.title=title;
        this.auther=auther;
        this.price=price;
    // create a method to display the book details
    }
    private void display(){
        System.out.println("Book Title: "+title);
        System.out.println("Book Auther: "+auther);
        System.out.println("Book Price: "+price);

    }   
    public static void main(String[] args) {
        Book e=new Book("Ikigai","Sadguru",200);
        e.display();
    }
}