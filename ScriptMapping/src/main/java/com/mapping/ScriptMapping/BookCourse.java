package com.mapping.ScriptMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="BOOK_COURSE")
public class BookCourse {
	@Id
	@GeneratedValue
	private String bookCourse_Name;
	public String getBookCourse_Name() {
		return bookCourse_Name;
	}

	public void setBookCourse_Name(String bookCourse_Name) {
		this.bookCourse_Name = bookCourse_Name;
	}

	


}
