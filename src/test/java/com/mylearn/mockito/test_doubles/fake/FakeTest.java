package com.mylearn.mockito.test_doubles.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

public class FakeTest {
	
	@Test
	public void testFake() {
		BookRepository bookRepository = new FakeBookRepository();
		BookService bookService = new BookService(bookRepository);
		
		bookService.addBook(new Book("002201", "Mockto In Action", 4500, LocalDate.now()));
		bookService.addBook(new Book("005502", "Junit 5 In Action", 3500, LocalDate.now()));
		
		assertEquals(2,  bookService.findNumberofBooks());

	}
	
	@Test
	public void testFakeWithMockito() {
		BookRepository bookRepository = mock(BookRepository.class);
		BookService bookService = new BookService(bookRepository);
		
		Book book1 = new Book("1234", "Mockito In Action", 250, LocalDate.now());
		Book book2 = new Book("1235", "JUnit 5 In Action", 200, LocalDate.now());
		
		Collection<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		
		when(bookRepository.findAll()).thenReturn(books);
		
		assertEquals(2, bookService.findNumberofBooks());
	}

}
