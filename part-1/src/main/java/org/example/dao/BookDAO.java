package org.example.dao;

import org.example.entity.Book;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDAO {
    public void saveBook(Book book){
        book.setBookId("B001");
        book.setTitle("Madol Doova");
        book.setIsbn("9789555640107");
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(book);
        transaction.commit();
        session.close();
    }

    public Book searchBook(Book book){
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Book searchBook = session.get(Book.class,"B001");
        transaction.commit();
        return searchBook;
    }

    public void updateBook(Book book){
        book.setBookId("B001");
        book.setTitle("Madol Doova");
        book.setIsbn("9789555640106");
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.update(book);
        transaction.commit();
        session.close();
    }

    public void deleteBook(Book book){
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(book);
        transaction.commit();
        session.close();
    }

}
