package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

@Service

public class BooksService {
	@Autowired
	BooksRepository booksRepository;

	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

	public Optional<Books> getBooksById(int id) {
		return booksRepository.findById(id);
	}

	public void delete(int id) {
		booksRepository.deleteById(id);

	}

	public void update(Books books) {
		booksRepository.save(books);
	}

	public void save(Books books) {
		booksRepository.save(books);
	}
}
