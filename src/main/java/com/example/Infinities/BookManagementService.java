package com.example.Infinities;

import java.util.List;
import java.util.Optional;

public interface BookManagementService {
	
	public Optional<Book> getBook( Long id);
	
	public List<Book> getBooks();
	
	public void postBook(Book book);
	
	public boolean putBook(Long id, Book book);
	
	public Optional<Book> deleteBook(Long id);
}
