public class Book {

    private String title;
    private String author;
    private boolean borrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public String getTitle(){
        return title;
    }

    public boolean isBorrowed(){
        return borrowed;
    }

    public void borrow(){
        borrowed = true;
    }

    public void returnBook(){
        borrowed = false;
    }

    public String toString(){
        return "Title: " + title +
               " | Author: " + author +
               " | Status: " + (borrowed ? "Borrowed" : "Available");
    }
}
