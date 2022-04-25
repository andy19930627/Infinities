package com.example.Infinities;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/books")
public class BookManagementController {
	
	@Autowired
	BookManagementService bookManagementService;
	
	@GetMapping
	ResponseEntity<List<Book>> getBooks(){
		return new ResponseEntity<List<Book>>(bookManagementService.getBooks(), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	ResponseEntity<Book> getBook(@PathVariable Long id){
		Optional<Book> bookOptional = bookManagementService.getBook(id);
		return bookOptional.isPresent()?
				new ResponseEntity<Book>(bookOptional.get(), HttpStatus.OK):
				new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	ResponseEntity<Book> postBook(@RequestBody Book book) {
		bookManagementService.postBook(book);
		return new ResponseEntity<Book>(book, HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	ResponseEntity<Book> putBook(@PathVariable Long id, @RequestBody Book book) {
		return bookManagementService.putBook(id, book)?
				new ResponseEntity<>(book, HttpStatus.OK) : new ResponseEntity<>(book, HttpStatus.CREATED)  ;
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<Book> deleteBook(@PathVariable Long id) {
		Optional<Book> bookOptional = bookManagementService.deleteBook(id);
		return bookOptional.isPresent()? new ResponseEntity<Book>(bookOptional.get(), HttpStatus.OK) : 
			new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
	
}
