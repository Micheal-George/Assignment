package com.masai.useCase;

import java.util.List;

import com.masai.Dao.LibraryDao;
import com.masai.Dao.LibraryDaoImpl;
import com.masai.Exception.GenreNotFound;
import com.masai.entity.Book;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryDao lb=new LibraryDaoImpl();
		
		try {
			List<Book> book=lb.getBooksByGenre("call");
			
			for(Book s:book)
			{
				System.out.println(s);
			}
		} catch (GenreNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
