package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="books")
public class Books {
	@Id
	@Column(name="id")
	private int booksid;  
	@Column(name="bookname")
	private String bookname; 
	@Column(name="author")
	private String author;  
	@Column(name="price")
	private int price;  

	public int getBookid() {
		return booksid;
	}
	public void setBookid(int bookid) {
		this.booksid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
