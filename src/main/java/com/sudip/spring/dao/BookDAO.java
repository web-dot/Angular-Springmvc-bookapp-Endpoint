package com.sudip.spring.dao;

import java.util.List;

import com.sudip.spring.model.Book;

public interface BookDAO {
	
	//Save the record
	long save(Book book);
	
	//Get a single record
	Book get(long id);
	
	//Get all the records
	List<Book> list();
	
	//Update the record
	void update(long id, Book book);
	
	//Delete a record
	void delete(long id);
}
