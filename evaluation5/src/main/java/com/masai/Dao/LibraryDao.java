package com.masai.Dao;

import java.util.List;

import com.masai.Exception.BookNotFound;
import com.masai.Exception.GenreNotFound;
import com.masai.entity.Book;
import com.masai.entity.Book_Genre;

public interface LibraryDao {
	
	boolean addBook(Book book);
	
	boolean addGenre(Book_Genre bookGenre);
	
	List<Book> getBooksByGenre(String genre) throws GenreNotFound;
	
	String updateAuthorName(String bookName, String authorName) throws BookNotFound;
	
	void removeGenre(String genre) throws GenreNotFound;
	
	void removeBook(String bookName) throws BookNotFound;

}
