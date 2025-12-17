package com.mylearn.mockito.test_doubles.spy;

public class BookRepositrySpy  implements BookRepository {
	
	int saveCallCount = 0;
	Book lastAddedBook = null;
	
	
	@Override
	public void save(Book book) {
		saveCallCount++;
		lastAddedBook = book;
	}
	
	public int timesCalled() {
		return saveCallCount;
	}
	
	public boolean calledWith(Book book) {
		return lastAddedBook == book;
	}
	
	
	

}
