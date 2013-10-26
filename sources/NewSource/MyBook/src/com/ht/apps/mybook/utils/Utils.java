package com.ht.apps.mybook.utils;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

import com.ht.apps.mybook.entity.BookMenuItem;

public class Utils {

	public static List<BookMenuItem> getListBookMenuItem() {
		List<BookMenuItem> items = new ArrayList<BookMenuItem>();
		int currentVolume = 0;
		BookMenuItem item;
		for (int i = 0; i < Variables.chapters.size(); i++) {
			item = new BookMenuItem();
			item.setId(i);
			item.setBookChapterName(Variables.chapters.get(i).getChapterName());
			if (Variables.chapters.get(i).getVolumeId() > currentVolume) {
				currentVolume = Variables.chapters.get(i).getVolumeId();
				item.setBookVolume(Variables.volumes.get(currentVolume-1)
						.getVolumeName());
				Log.d("getFirstChapterNumberOfVolumes", "chapter-" + i
						+ "||volumeId-"
						+ Variables.chapters.get(i).getVolumeId());
			}
			items.add(item);
		}
		return items;
	}
}
