package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class Book {
    @Id
    private String bookId;
    private String title;
    private String isbn;
    @ManyToOne
    private Author author;
}
