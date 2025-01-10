package exercise;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Data
@Setter
class Member {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed \"" + book.getTitle() + "\".");
        } else {
            System.out.println("The book \"" + book.getTitle() + "\" is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " returned \"" + book.getTitle() + "\".");
        } else {
            System.out.println(name + " did not borrow \"" + book.getTitle() + "\".");
        }
    }

    public String getDetails() {
        StringBuilder details = new StringBuilder(id + " - " + name + " (Books borrowed: ");
        if (borrowedBooks.isEmpty()) {
            details.append("No books borrowed)");
        } else {
            for (Book book : borrowedBooks) {
                details.append(book.getTitle()).append(", ");
            }
            details.setLength(details.length() - 2); // Remove last comma and space
            details.append(")");
        }
        return details.toString();
    }
}
