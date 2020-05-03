package com.books.detailhub.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;
    private String title;
    private Float rating;
    private String description;
    private String genre;

    public Books(BooksDTO booksDTO){
        this.book_id = booksDTO.getBook_id();
        this.title = booksDTO.getTitle();
        this.genre = booksDTO.getGenre();
        this.rating = booksDTO.getRating();
        this.description = booksDTO.getDescription();
        this.authors.setAuthor_name(booksDTO.getAuthor_name());
        this.publisher.setName(booksDTO.getName());

    }
    public Books(){

    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisher_id")
    private Publishers publisher;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "book_authors",
                joinColumns = {@JoinColumn(name = "book_id"),},
                inverseJoinColumns = {@JoinColumn(name = "author_id")})
    private Authors authors;

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public Publishers getPublisher() {
        return publisher;
    }

    public void setPublisher(Publishers publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBook_id(int book_id){
        this.book_id = book_id;
    }

    public int getBook_id(){
        return book_id;
    }

}
