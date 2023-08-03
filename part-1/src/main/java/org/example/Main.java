package org.example;

import org.example.dao.BookDAO;
import org.example.entity.Book;

public class Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        Book book = new Book();
        bookDAO.saveBook(book);
        Book book1 = bookDAO.searchBook(book);
        System.out.println(book1.getTitle());
        System.out.println(book1.getIsbn());
        bookDAO.updateBook(book);
        bookDAO.deleteBook(book);
    }
}