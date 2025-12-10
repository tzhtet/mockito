package com.mylearn.mockito.test_doubles.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DummyTest {

	
	@Test
	public void demoDummy(){
		BookRepository bookRepository = new FakeBookRepository();
		EmailService emailService = new DummyEmailService();
		BookService bookService = new BookService(bookRepository, emailService);
		
		bookService.addBook(new Book("1234", "Mockito In Action", 250, LocalDate.now()));
		bookService.addBook(new Book("1235", "JUnit 5 In Action", 200, LocalDate.now()));
		
		assertEquals(2, bookService.findNumberOfBooks());
	}
}
