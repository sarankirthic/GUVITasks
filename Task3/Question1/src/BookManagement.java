import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book");
            System.out.println("4. Search Book");
            System.out.println("5. Display all Books");
            System.out.println("6. Exit");
            switch (choice = scanner.nextInt()) {
                case 1:
                    int bookID = library.getBookCount() + 1;
                    System.out.println("Please enter the book title: ");
                    String title = scanner.next();
                    System.out.println("Please enter the book author: ");
                    String author = scanner.next();
                    System.out.println("Please enter the book availability: (true/false): ");
                    boolean availability = scanner.nextBoolean();
                    library.addBook(new Book(bookID, title, author, availability));
                    break;
                case 2:
                    System.out.println("Please enter the book ID: ");
                    int removeID = scanner.nextInt();
                    library.removeBook(removeID);
                    break;
                case 3:
                    System.out.println("Please enter the book ID to update: ");
                    int editID = scanner.nextInt();
                    Book book = library.getBookById(editID);
                    int editChoice;
                    do {
                        System.out.println("1. Do you want to change the book title and author?");
                        System.out.println("2. Do you want to change the book availability?");
                        System.out.println("3. Exit");
                        switch(editChoice = scanner.nextInt()){
                            case 1:
                                System.out.println("Enter the book title: ");
                                String newTitle = scanner.nextLine();
                                System.out.println("Enter the book author: ");
                                String newAuthor = scanner.nextLine();
                                Book updatedBook = new Book(editID, newTitle, newAuthor, book.getIsAvailable());
                                library.replaceBook(editID, updatedBook);
                                break;
                            case 2:
                                System.out.println("Enter the book availability: ");
                                boolean newAvailability = scanner.nextBoolean();
                                library.changeAvailability(editID, newAvailability);
                                break;
                        }
                    } while (editChoice != 3);
                    break;
                case 4:
                    System.out.println("Please enter the book ID: ");
                    int searchID = scanner.nextInt();
                    library.getBookById(searchID);
                    break;
                case 5:
                    library.displayAllBooks();
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
