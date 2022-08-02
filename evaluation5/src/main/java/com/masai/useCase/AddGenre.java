package com.masai.useCase;

import com.masai.Dao.LibraryDao;
import com.masai.Dao.LibraryDaoImpl;
import com.masai.entity.Book_Genre;

public class AddGenre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryDao lb=new LibraryDaoImpl();
		
		Book_Genre bg1=new Book_Genre();
		bg1.setGenre_name("comic");
		
		Book_Genre bg2=new Book_Genre();
		bg2.setGenre_name("life story");
		
		boolean flag;
		flag=lb.addGenre(bg1);
		System.out.println(flag);
		flag=lb.addGenre(bg2);
		
		System.out.println(flag);
		

	}

}
