package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        book.setBookId("B004");
        book.setTitle("Kaliyugaya");
        book.setIsbn("9789555640237");

        Author author=new Author();
        author.setAuthorId("A003");
        author.setAuthorName("Martin Wickremasinghe");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author);

        book.setAuthors(authorList);
        author.setBooks(bookList);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(book);
        session.persist(author);
        transaction.commit();
        session.close();
    }
}