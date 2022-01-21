package de.uni.koeln.se.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.uni.koeln.se.bookstore.datamodel.Book;
import de.uni.koeln.se.bookstore.repository.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	public List<Book> findBooks() {
		return bookRepo.findAll();
	}
	
	public Optional<Book> fetchBook(int id) {
		return bookRepo.findById(id);
	}
	
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}
	
	public boolean deleteBook(int id) {
		boolean status;
		try {
			bookRepo.deleteById(id);
			status=true;
		} catch (Exception e) {
			status=false;
		}
		
		return status;
	}
	
	public Book getOldest() {
		Book oldest = findBooks().get(0);
		for (Book book : findBooks()) {
			if (book.getYear() < oldest.getYear()) {
				oldest = book;
			}
		}
		return oldest;
	}
	
	public Book getRecent() {
		Book recent = findBooks().get(0);
		for (Book book : findBooks()) {
			if (book.getYear() > recent.getYear()) {
				recent = book;
			}
		}
		return recent;
	}
}
