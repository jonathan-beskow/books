package br.com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import br.com.book.entity.Author;
import br.com.book.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Author> getAuthorList() {
		Iterable<Author> authorIterable = this.authorRepository.findAll();
		List<Author> authorList = Streamable.of(authorIterable).toList();
		return authorList;
	}
	
}
