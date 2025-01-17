// create a class Book with the following private attributes
class Book{
    private String title;
    private String author;
    private int price;
    Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    // create a method to display the book details
    }
    private void display(){
        System.out.println("Book Title: "+title);
        System.out.println("Book author: "+author);
        System.out.println("Book Price: "+price);

    }   
    public static void main(String[] args) {
        Book e=new Book("Ikigai","Sadguru",200);
        e.display();
    }
}