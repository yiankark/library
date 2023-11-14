package com.myprojects.demo;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
    private BookRepository bookRepository;

	
	@RequestMapping(method = RequestMethod.GET)
    public Book getAllBooks(@PathVariable Long id) {
        // Implement logic to retrieve a book by ID
        // (You might want to add error handling and return appropriate responses)
        return null;
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public Book createBooks(@RequestBody Book book) {
        // Implement logic to create a new book
        // (You might want to add validation and return appropriate responses)
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable Long id) {
        // Implement logic to retrieve a book by ID
        // (You might want to add error handling and return appropriate responses)
        return null;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Book createBook(@RequestBody Book book) {
        // Implement logic to create a new book
        // (You might want to add validation and return appropriate responses)
    	Date sampledate = new Date(1911,11,28);
    	Long sampleUserId = new Long(32323);
    	bookRepository.saveAndFlush("Atitle", "jkmartin", "11235", sampledate , sampleUserId);
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        // Implement logic to update an existing book
        // (You might want to add validation and return appropriate responses)
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable Long id) {
        // Implement logic to delete a book
        // (You might want to add validation and return appropriate responses)
    }
}
