package com.ht.apps.mybook.databasehelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;

import com.ht.apps.mybook.entity.Chapter;
import com.ht.apps.mybook.entity.Volume;
import com.ht.apps.mybook.utils.Variables;

public class DatabaseManager extends SQLiteAssetHelper {

	private static final String DATABASE_NAME = "ht_mybooks";
	private static final int DATABASE_VERSION = 1;
	private static final int CURRENT_BOOK_ID = 1;
	private static final String TAG = "On DatabaseManager.class";
	SQLiteDatabase db = getReadableDatabase();
	SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

	public DatabaseManager(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);

		// you can use an alternate constructor to specify a database location
		// (such as a folder on the sd card)
		// you must ensure that this folder is available and you have permission
		// to write to it
		// super(context, DATABASE_NAME,
		// context.getExternalFilesDir(null).getAbsolutePath(), null,
		// DATABASE_VERSION);

	}

	public void getVolumes() {
		String sqlTables = "Volumes";

		qb.setTables(sqlTables);
		Cursor cursor = qb.query(db, null, "BookId=" + CURRENT_BOOK_ID, null,
				null, null, null);

		cursor.moveToFirst();
		Volume volume;
		while (cursor.isAfterLast() == false) {
			try {
				volume = new Volume();
				volume.setVolumeId(cursor.getInt(0));
				volume.setBookId(cursor.getInt(1));
				volume.setVolumeName(cursor.getString(2));
				volume.setDescription(cursor.getString(3));
				Variables.volumes.add(volume);
				cursor.moveToNext();
			} catch (Exception e) {
				Log.e(TAG, "[Exception]" + e.getMessage());
			}
		}

	}

	public void getChapters() {
		String sqlTables = "Chapters";

		qb.setTables(sqlTables);
		Cursor cursor = qb.query(db, null, "BookId=" + CURRENT_BOOK_ID, null,
				null, null, null);

		cursor.moveToFirst();
		Chapter chapter;
		while (cursor.isAfterLast() == false) {
			try {
				chapter = new Chapter();
				chapter.setChapterId(cursor.getInt(0));
				chapter.setBookId(cursor.getInt(1));
				chapter.setChapterName(cursor.getString(2));
				chapter.setChapterContent(cursor.getString(3));
				chapter.setDescription(cursor.getString(4));
				chapter.setVolumeId(cursor.getInt(5));
				Variables.chapters.add(chapter);
				cursor.moveToNext();
			} catch (Exception e) {
				Log.e(TAG, "[Exception]" + e.getMessage());
			}
		}
	}

}
