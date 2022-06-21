package com.mapping.ScriptMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Author")
public class BookAuthor {
	@Id
	@GeneratedValue
	private String bookAuthor_Name;
	public String getBookAuthor_Name() {
		return bookAuthor_Name;
	}

	public void setBookAuthor_Name(String bookAuthor_Name) {
		this.bookAuthor_Name = bookAuthor_Name;
	}

	



}
