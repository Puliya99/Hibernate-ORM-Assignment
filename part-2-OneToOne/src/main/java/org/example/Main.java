package org.example;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("B002","Gamperaliya","9789558415436");
        Author author = new Author();
        author.setAuthorId("A001");
        author.setAuthorName("Martin Wickramasinghe");
        author.setBook(book);
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(book);
        session.persist(author);
        transaction.commit();
        session.close();
    }
}