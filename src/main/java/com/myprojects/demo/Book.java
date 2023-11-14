package com.myprojects.demo;

import java.sql.Date;


import jakarta.persistence.*;


@Entity
@Table(name = "books")
class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
    private String title;
    private String author;
    private String ISBN;
    private Date publishedDate;
    
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    //constructors
    public Book() {
    }

    public Book(int id, String title, String author, String ISBN, Date publishedDate, User user) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publishedDate = publishedDate;
        this.user = user;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getUser() {
        return user.getId();
    }

    public void setUser(User user) {
        this.user = user;
    }
	
}
