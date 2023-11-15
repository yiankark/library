package com.myprojects.demo;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;


@Entity
@Table(name = "books")
class Book{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "title")
    private String title;
	@Column(name = "author")
    private String author;
	@Column(name = "ISBN")
    private String ISBN;
	@Column(name = "publishedDate")
    private Date publishedDate;
    
    @ManyToOne
    @JsonBackReference 
    @JoinColumn(name = "user_id")
    private User user;

    //constructors
    public Book() {
    	this.title = "default";
        this.author = "default";
        this.ISBN = "default";
        this.user = null;
    }

    public Book(String title, String author, String ISBN, Date publishedDate, User user) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publishedDate = publishedDate;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
	
}
