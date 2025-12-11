package com.mylearn.mockito.test_doubles.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StubTest {
	
	
	@Test
	public void demoStub() {
		BookRepository bookRepository = new BookRepositoryStub();
		BookService bookService = new BookService(bookRepository);
		List<Book> newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 17);
		
		assertEquals(2, newBooksWithAppliedDiscount.size());
		assertEquals(450, newBooksWithAppliedDiscount.get(0).getPrice());
		assertEquals(360, newBooksWithAppliedDiscount.get(1).getPrice());
		
	}

}
