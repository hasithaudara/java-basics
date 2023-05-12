package org.example.LibraryManagementApp;

import java.util.ArrayList;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library(new ArrayList<Book>(), new ArrayList<Member>());
        LibraryManagement libraryManagement = new LibraryManagement();

        // Creating and adding books to the library
        Book book_1 = new Book("1122", "The Adventures of Sherlock Holmes", " Sir Arthur Conan Doyle", false);
        Book book_2 = new Book("1222", "The Memoirs of Sherlock Holmes", " Sir Arthur Conan Doyle", false);
        Book book_3 = new Book("1322", "The Return of Sherlock Holmes", " Sir Arthur Conan Doyle", false);
        Book book_4 = new Book("1422", "His Last Bow", " Sir Arthur Conan Doyle", false);
        Book book_5 = new Book("1522", "The Case-Book of Sherlock Holmes", " Sir Arthur Conan Doyle", false);
        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(book_3);
        library.addBook(book_4);
        library.addBook(book_5);

        // Creating and adding members to the library
        Member member_1 = new Member(1, "Kevin", new ArrayList<Book>());
        Member member_2 = new Member(2, "Thor", new ArrayList<Book>());
        Member member_3 = new Member(3, "Peter", new ArrayList<Book>());
        library.addMember(member_1);
        library.addMember(member_2);
        library.addMember(member_3);

        // Member borrowing a book
        library.borrowingBook(book_2, member_1);
        libraryManagement.displayBookList(library);
        libraryManagement.displayMembersList(library);

        // Member returning a book
        library.returningBook(book_2,member_1);
        libraryManagement.displayBookList(library);
        libraryManagement.displayMembersList(library);

        // Removing a book from the library
        library.removeBook(book_2);
        libraryManagement.displayBookList(library);

        // Removing a member from the library
        library.removeMember(member_2);
        libraryManagement.displayMembersList(library);
    }

    private void displayBookList(Library library) {
        System.out.println("List of all the Books :");
        for (int i = 0; i < library.getListOfBooks().size(); i++) {
            System.out.println(library.getListOfBooks().get(i));
        }
    }

    private  void displayMembersList(Library library){
        System.out.println("List of all the Members :");
        for (int i = 0; i< library.getListOfMembers().size();i++){
            System.out.println(library.getListOfMembers().get(i));
        }
    }
}
