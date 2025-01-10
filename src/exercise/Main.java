package exercise;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");

        Library library = new Library();

        System.out.println("\nAdding Books...");
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));

        System.out.println("\nAdding Members...");
        library.registerMember(new Member(1, "Alice"));
        library.registerMember(new Member(2, "Bob"));

        System.out.println("\nDisplaying All Books:");
        library.displayBooks();

        System.out.println("\nDisplaying All Members:");
        library.displayMembers();

        System.out.println("\nBob borrows \"The Great Gatsby\"...");
        Member bob = library.findMemberById(2);
        Book greatGatsby = library.findBookById(1);
        if (bob != null && greatGatsby != null) {
            bob.borrowBook(greatGatsby);
        }

        System.out.println("\nDisplaying All Books:");
        library.displayBooks();

        System.out.println("\nDisplaying All Members:");
        library.displayMembers();

        System.out.println("\nBob returns \"The Great Gatsby\"...");
        if (bob != null && greatGatsby != null) {
            bob.returnBook(greatGatsby);
        }

        System.out.println("\nDisplaying All Books:");
        library.displayBooks();
        System.out.println("\nDisplaying All Members:");
        library.displayMembers();
    }
}

