package com.epsilon.project;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Book {

	@Value("My Autobiography")
	String bookName;
	
	@Autowired(required = false)
	@Qualifier("publisher")
	Publisher publisher;
	
	Author author;

	int bookId;
	float price;
	
	@Value("English")
	String language;
	
	public Book() {
		super();
	}

	public Book(String name, Publisher publisher1) {
		super();
		this.bookName = name;
		this.publisher = publisher1;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getbookName() {
		return bookName;
	}
	public void setbookName(String title) {
		this.bookName = title;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", language=" + language + ", publisher=" + publisher + ", author=" + author + ", , price=" + price + "]";
	}


}
