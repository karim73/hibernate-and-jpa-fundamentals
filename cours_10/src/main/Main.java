package org.perso.tuto_hibernate.cours_10.main;

import java.util.ArrayList;
import java.util.List;

import org.perso.tuto_hibernate.cours_10.service.BookStoreService;


import org.perso.tuto_hibernate.cours_10.domain.Book;
import org.perso.tuto_hibernate.cours_10.domain.Chapter;
import org.perso.tuto_hibernate.cours_10.domain.Publisher;

public class Main {

	public static void main(String[] args) {

		try{
			BookStoreService bookStoreService = new BookStoreService();

			//persisting object graph
			/*
			Publisher publisher = new Publisher("MANN", "Manning Publications Co.");

			Book book = new Book("9781617290459", "Java Persistence with Hibernate, Second Edition", publisher);

			List<Chapter> chapters = new ArrayList<Chapter>();
			Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
			chapters.add(chapter1);
			Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
			chapters.add(chapter2);

			book.setChapters(chapters);

			bookStoreService.persistObjectGraph(book);
			*/
			//retrieving object graph
			/* */
			Book book = bookStoreService.retrieveObjectGraph("9781617290459");
			System.out.println(book);
			/* */
		}
		catch(Exception e){
			System.err.println("Dsl : "+e.getMessage());
		}
	}
}





