package br.com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.book.entity.Book;
import br.com.book.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public void save(Book book) {
		this.bookRepository.save(book);
	}

	public void findAll(Book book) {
		this.bookRepository.findAll();
	}

	public List<Book> findAll() {
		return this.bookRepository.findAll();
	}

	public Book findById(Long id) {
		return this.bookRepository.findById(id).get();
	}

	public void delete(Long id) {
		this.bookRepository.deleteById(id);
	}

}
