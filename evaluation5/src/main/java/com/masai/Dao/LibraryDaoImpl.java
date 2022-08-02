package com.masai.Dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.Exception.BookNotFound;
import com.masai.Exception.GenreNotFound;
import com.masai.entity.Book;
import com.masai.entity.Book_Genre;
import com.masai.utility.EMconnector;

public class LibraryDaoImpl implements LibraryDao{

	public boolean addBook(Book book) {
		boolean flag=false;
		EntityManager em=EMconnector.provideEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book genric id");
		int id=sc.nextInt();
		Book_Genre bg=em.find(Book_Genre.class, id);
		bg.getBookList().add(book);
		em.getTransaction().begin();
	    em.persist(bg);
	    flag=true;
	    em.getTransaction().commit();
	    em.close();
		
		
		return flag;
	}

	public boolean addGenre(Book_Genre bookGenre) {
		boolean flag=false;
		EntityManager em=EMconnector.provideEntityManager();
		
		em.getTransaction().begin();
	    em.persist(bookGenre);
	    flag=true;
	    em.getTransaction().commit();
	    em.close();
		
		
		return flag;
	}

	public List<Book> getBooksByGenre(String genre) throws GenreNotFound {
		List<Book> list=null;
		EntityManager em=EMconnector.provideEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book genric id");
		int id=sc.nextInt();
		Book_Genre bg=em.find(Book_Genre.class, id);
		list=bg.getBookList();
		
		if(list==null) {
			throw new GenreNotFound("No list");
		}
		
		
		return list;
	}

	public String updateAuthorName(String bookName, String authorName) throws BookNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeGenre(String genre) throws GenreNotFound {
		// TODO Auto-generated method stub
		
	}

	public void removeBook(String bookName) throws BookNotFound {
		// TODO Auto-generated method stub
		
	}

}
