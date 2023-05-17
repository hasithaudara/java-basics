package org.example.LibraryManagementApp;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> listOfBooks;
    private ArrayList<Member> listOfMembers;

    public Library(ArrayList<Book> listOfBooks, ArrayList<Member> listOfMembers) {
        this.listOfBooks = listOfBooks;
        this.listOfMembers = listOfMembers;
    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public ArrayList<Member> getListOfMembers() {
        return listOfMembers;
    }

    public void setListOfMembers(ArrayList<Member> listOfMembers) {
        this.listOfMembers = listOfMembers;
    }

    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    public void addMember(Member member) {
        listOfMembers.add(member);
    }

    public void removeBook(Book book) {
        listOfBooks.remove(book);
    }

    public void removeMember(Member member) {
        listOfMembers.remove(member);
    }

    public void borrowingBook(Book book, Member member) {
        if (!book.isBorrowed()) {
            member.getBorrowedBooks().add(book);
            book.setBorrowed(true);
            getListOfBooks().remove(book);
        }
    }

    public void returningBook(Book book, Member member) {
        if (book.isBorrowed()) {
            member.getBorrowedBooks().remove(book);
            book.setBorrowed(false);
            this.getListOfBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "listOfBooks=" + listOfBooks +
                ", listOfMembers=" + listOfMembers +
                '}';
    }
}
