package com.example.book.repository;

import java.awt.print.Book;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.book.DTO.BookDTO;

@Repository
public class BookRepository {

	@Autowired
	private SqlSessionTemplate sql;

	public void save(BookDTO bookDTO) {
		sql.insert("book.save", bookDTO);

	}

	public List<BookDTO> findAll() {
		return sql.selectList("book.findAll");
	}

	public BookDTO findById(Long id) {
		return sql.selectOne("book.findById", id);
	}

	public void delete(Long id) {
		sql.delete("book.delete", id);

	}

	public void update(BookDTO bookDTO) {
		sql.update("book.update", bookDTO);

	}

}
