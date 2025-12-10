package com.mylearn.mockito.test_doubles.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

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

}
