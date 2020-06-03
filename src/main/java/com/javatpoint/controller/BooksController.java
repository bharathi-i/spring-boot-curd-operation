package com.javatpoint.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Books;
import com.javatpoint.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	BooksService booksService;

	@GetMapping("/all")
	private List<Books> getAllBooks() {
		return booksService.getAllBooks();
	}

	@GetMapping("/id/{booksid}")
	private Optional<Books> getBooks(@PathVariable("booksid") int booksid) {
		return booksService.getBooksById(booksid);
	}

	@DeleteMapping("/delete/{booksid}")
	private void deleteBook(@PathVariable("booksid") int booksid) {
		booksService.delete(booksid);
	}

	@PutMapping("/update")
	private Books update(@RequestBody Books books) {
		booksService.update(books);
		return books;
	}

	@PostMapping("/save")
	private int saveBook(@RequestBody Books books) {
		booksService.save(books);
		return books.getBookid();
	}

}
