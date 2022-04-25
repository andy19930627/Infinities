package com.example.Infinities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;


@Service("BookManagementService")
public class BookManagementServiceImpl implements BookManagementService{
	
	@Autowired
	private BookDao bookDao;
	
	@Override
	public Optional<Book> getBook(Long id) {
		return bookDao.findById(id);
	}

	
	@Override
	public List<Book> getBooks() {
		return  Streamable.of(bookDao.findAll()).toList();
	}
	
	@Override
	public void postBook(Book book) {
		bookDao.save(book);
	}

	@Override
	public boolean putBook(Long id, Book book) {
		bookDao.save(book);
		return bookDao.existsById(id); 
	}

	@Override
	public Optional<Book> deleteBook(Long id) {
		Optional<Book> bookOptional = bookDao.findById(id);
		if(bookOptional.isPresent()) {
			bookDao.delete(bookOptional.get());
		}
		return bookOptional;
	}

}
