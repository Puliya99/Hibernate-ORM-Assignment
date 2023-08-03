package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

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
    @ManyToMany(mappedBy = "books")
    private List<Author> authors;
}
