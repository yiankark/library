package com.myprojects.demo;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface BookRepository extends JpaRepository<Book, Integer> {
    // Custom query methods (if needed)
	
	
	// Custom method to add a new book and immediately flush changes
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO books (title, author, ISBN, published_date, user_id) VALUES (:title, :author, :isbn, :publishedDate, :userId)", nativeQuery = true)
    void saveAndFlush(
        @Param("title") String title,
        @Param("author") String author,
        @Param("isbn") String isbn,
        @Param("publishedDate") Date publishedDate,
        @Param("userId") Long userId
    );
}
