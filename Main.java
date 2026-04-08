import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LibraryService service = new LibraryService();

        while(true){

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    service.addBook(title, author);
                    break;

                case 2:
                    service.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter book title to borrow: ");
                    service.borrowBook(scanner.nextLine());
                    break;

                case 4:
                    System.out.print("Enter book title to return: ");
                    service.returnBook(scanner.nextLine());
                    break;

                case 5:
                    System.out.print("Enter book title to search: ");
                    SearchEngine.search(service.getLibrary(), scanner.nextLine());
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
