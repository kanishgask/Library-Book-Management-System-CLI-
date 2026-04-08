public class SearchEngine {

    public static void search(Library library, String title){

        boolean found = false;

        for(Book b : library.getBooks()){

            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println(b);
                found = true;
            }
        }

        if(!found){
            System.out.println("Book not found.");
        }
    }
}
