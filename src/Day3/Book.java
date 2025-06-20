package Day3;

public class Book {
    private String title;
    private String author;
    private float price;

    public Book(String author){
        this.author = author;
    }

    public Book(String title, float price){
        this.title = title;
        this.price = price;
    }
}
