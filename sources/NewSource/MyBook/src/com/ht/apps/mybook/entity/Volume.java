package com.ht.apps.mybook.entity;

public class Volume {
	private int volumeId;
	private int bookId;
	private String volumeName;
	private String description;

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getVolumeId() {
		return volumeId;
	}

	public void setVolumeId(int volumeId) {
		this.volumeId = volumeId;
	}

	public String getVolumeName() {
		return volumeName;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBookId() {
		return bookId;
	}

}
