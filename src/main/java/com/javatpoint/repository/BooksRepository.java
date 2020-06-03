package com.javatpoint.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.model.Books;

//import com.javatpoint.model.books;

public interface BooksRepository extends JpaRepository<Books,Integer>{
	Optional<Books> findById(Integer id);
	}
