public class Library {
    private Book[] books;
    private int bookCount;

    Library() {
        this.books = new Book[10];
    }

    public int getBookCount() {
        return bookCount;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book has been added");
        } else {
            System.out.println("Library is Full.");
        }
    }

    public void removeBook(int bookId) {
        for(int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == bookId) {
                for (int j = i+1; j < bookCount; j++) {
                    books[j] = books[j+1];
                }
                books[--bookCount] = null;
                System.out.println("Book has been removed");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void searchBook(int bookId) {
        System.out.println(bookId + " is searching for the book");
        for(int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == bookId) {
                System.out.println(bookId + " is found");
                System.out.println("This is the book");
                System.out.println(books[i].toString());
                return;
            }
        }
    }

    public Book getBookById(int bookId) {
        for(int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == bookId) {
                System.out.println(bookId + " is found");
                System.out.println("This is the book");
                return books[i];
            }
        }
        return null;
    }

    public void replaceBook(int bookId, Book newBook) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == bookId) {
                books[i] = newBook;
                System.out.println("Book has been replaced");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void changeAvailability(int bookId, boolean newAvailability) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == bookId) {
                books[i].setIsAvailable(newAvailability);
                System.out.println("Book has been changed");
            }
        }
        System.out.println("Book not found");
    }

    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books found");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i].toString());
            }
        }
    }
}
