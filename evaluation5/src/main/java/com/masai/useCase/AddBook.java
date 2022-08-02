package com.masai.useCase;

import com.masai.Dao.LibraryDao;
import com.masai.Dao.LibraryDaoImpl;
import com.masai.entity.Book;
import com.masai.entity.Book_Genre;

public class AddBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Book book=new Book();
		book.setBook_name("Wings o fire");
		book.setAuthor_name("Kalam");
		
		LibraryDao lb=new LibraryDaoImpl();
		boolean flag=lb.addBook(book);
System.out.println(flag);
	}

}
