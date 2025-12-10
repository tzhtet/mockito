package com.mylearn.mockito.test_doubles.stub;

import java.util.Collection;

public interface BookRepository {
	
	void save(Book book);
	Collection<Book> findAll();

}
