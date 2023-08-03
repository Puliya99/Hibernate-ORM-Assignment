package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class Author {
    @Id
    private String authorId;
    private String authorName;
    @OneToMany(mappedBy = "author")
    private List <Book> book;

    public Author(String authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }
}