public class LibraryService {

    private Library library;

    public LibraryService(){
        library = new Library();
    }

    public void addBook(String title, String author){

        Book book = new Book(title, author);
        library.addBook(book);

        System.out.println("Book added successfully.");
    }

    public void viewBooks(){

        for(Book b : library.getBooks()){
            System.out.println(b);
        }
    }

    public void borrowBook(String title){

        for(Book b : library.getBooks()){

            if(b.getTitle().equalsIgnoreCase(title) && !b.isBorrowed()){
                b.borrow();
                System.out.println("Book borrowed.");
                return;
            }
        }

        System.out.println("Book not available.");
    }

    public void returnBook(String title){

        for(Book b : library.getBooks()){

            if(b.getTitle().equalsIgnoreCase(title) && b.isBorrowed()){
                b.returnBook();
                System.out.println("Book returned.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public Library getLibrary(){
        return library;
    }
}
