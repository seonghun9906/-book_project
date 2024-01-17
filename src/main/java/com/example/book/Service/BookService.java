package com.example.book.Service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.DTO.BookDTO;
import com.example.book.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public void save(BookDTO bookDTO) {
		System.out.println("bookDTO = " + bookDTO);
		bookRepository.save(bookDTO);
	}

	public List<BookDTO> findAll() {
		return bookRepository.findAll();
	}

	public BookDTO findById(Long id) {
		return bookRepository.findById(id);
	}

	public void delete(Long id) {
		bookRepository.delete(id);

	}

	public void update(BookDTO bookDTO) {
		bookRepository.update(bookDTO);

	}

}
