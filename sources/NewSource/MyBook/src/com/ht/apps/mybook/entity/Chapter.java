package com.ht.apps.mybook.entity;

public class Chapter {
	private int chapterId;
	private int bookId;
	private String chapterName;
	/**
	 * Contain draw data of chapter
	 */
	private String chapterContent;
	/**
	 * The chapter's description
	 */
	private String description;
	/**
	 * The chapter's volume or episode number Exp: Phần I. Cố lên
	 */
	private int volumeId;

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public String getChapterContent() {
		return chapterContent;
	}

	public void setChapterContent(String chapterContent) {
		this.chapterContent = chapterContent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVolumeId() {
		return volumeId;
	}

	public void setVolumeId(int volumeId) {
		this.volumeId = volumeId;
	}

	public int getBookId() {
		return bookId;
	}

}
