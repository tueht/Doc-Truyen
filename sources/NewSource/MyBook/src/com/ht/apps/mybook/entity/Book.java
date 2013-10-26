package com.ht.apps.mybook.entity;

public class Book {

	private int bookId;
	private String bookName;
	private int authorId;
	/**
	 * The book's information as author, publisher, release year, copyright,...
	 */
	private String bookInfo;
	/**
	 * The book's description includes book's description, book's content...
	 */
	private String description;
	private int numberOfChapters;
	private int currentChapter;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfChapters() {
		return numberOfChapters;
	}

	public void setNumberOfChapters(int numberOfChapters) {
		this.numberOfChapters = numberOfChapters;
	}

	public int getCurrentChapter() {
		return currentChapter;
	}

	public void setCurrentChapter(int currentChapter) {
		this.currentChapter = currentChapter;
	}

	public int getAuthorId() {
		return authorId;
	}

}
