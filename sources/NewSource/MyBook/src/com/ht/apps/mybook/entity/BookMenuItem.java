package com.ht.apps.mybook.entity;

public class BookMenuItem {
	private int id;
	private String bookChapterName;
	private String bookVolume;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookChapterName() {
		return bookChapterName;
	}

	public void setBookChapterName(String bookChapterName) {
		this.bookChapterName = bookChapterName;
	}

	public String getBookVolume() {
		return bookVolume;
	}

	public void setBookVolume(String bookVolume) {
		this.bookVolume = bookVolume;
	}

	public BookMenuItem() {
		super();
	}
}
