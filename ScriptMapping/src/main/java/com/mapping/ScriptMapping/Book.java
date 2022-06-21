package com.mapping.ScriptMapping;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book {
	@Id
	@GeneratedValue
	private String bookName;
	private int bookPrize;
	@ManyToOne(cascade=CascadeType.ALL)
	private String bookAuthor_Name;
	public String getBookAuthor_Name() {
		return bookAuthor_Name;
	}

	public void setBookAuthor_Name(String bookAuthor_Name) {
		this.bookAuthor_Name = bookAuthor_Name;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	private String bookCourse_Name;
	public String getBookCourse_Name() {
		return bookCourse_Name;
	}

	public void setBookCourse_Name(String bookCourse_Name) {
		this.bookCourse_Name = bookCourse_Name;
	}



	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrize() {
		return bookPrize;
	}
	public void setBookPrize(int bookPrize) {
		this.bookPrize = bookPrize;
	}


}
