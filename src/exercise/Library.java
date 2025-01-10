package exercise;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getDetails());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered: " + member.getDetails());
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
        return null;
    }

    public Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        System.out.println("Member with ID " + id + " not found.");
        return null;
    }

    public void displayBooks() {
        System.out.println("Displaying All Books:");
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }

    public void displayMembers() {
        System.out.println("Displaying All Members:");
        for (Member member : members) {
            System.out.println(member.getDetails());
        }
    }
}
