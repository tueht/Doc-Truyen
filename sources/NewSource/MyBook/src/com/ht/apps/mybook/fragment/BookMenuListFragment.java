package com.ht.apps.mybook.fragment;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ht.apps.mybook.R;
import com.ht.apps.mybook.databasehelper.DatabaseManager;
import com.ht.apps.mybook.entity.BookMenuItem;
import com.ht.apps.mybook.utils.Utils;
import com.ht.apps.mybook.utils.Variables;

public class BookMenuListFragment extends ListFragment {
	private DatabaseManager dbManager;
	private List<BookMenuItem> menuItems;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.menu, null);
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		dbManager = new DatabaseManager(getActivity());
		if (Variables.volumes.size() == 0)
			dbManager.getVolumes();
		if (Variables.chapters.size() == 0)
			dbManager.getChapters();
		if (Variables.volumes.size() != 0 && Variables.chapters.size() != 0)
			menuItems = Utils.getListBookMenuItem();
		BookMenuAdapter adapter = new BookMenuAdapter(getActivity(),
				R.layout.menu_row, menuItems);
		setListAdapter(adapter);
	}

	// private class ViewHolder {
	// TextView tvMenuTitle;
	// TextView tvVolume;
	// }

	public class BookMenuAdapter extends ArrayAdapter<BookMenuItem> {
		private Context context;

		// private ViewHolder holder;

		public BookMenuAdapter(Context context, int resource,
				List<BookMenuItem> items) {
			super(context, resource, items);
			this.context = context;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			// if (convertView == null) {
			// LayoutInflater inflater = (LayoutInflater) context
			// .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			// convertView = inflater.inflate(R.layout.menu_row, null);
			// holder = new ViewHolder();
			// holder.tvMenuTitle = (TextView) convertView
			// .findViewById(R.id.tvMenuTitle);
			// holder.tvVolume = (TextView) convertView
			// .findViewById(R.id.tvVolume);
			// convertView.setTag(holder);
			// } else {
			// holder = (ViewHolder) convertView.getTag();
			// }
			// holder.tvMenuTitle.setText(getItem(position).getBookChapterName());
			// if (position == 0) {
			// holder.tvMenuTitle.setTextSize(18);
			// holder.tvMenuTitle.setTextColor(R.color.blue);
			// } else {
			// if (getItem(position).getBookVolume() != null
			// && getItem(position).getBookVolume() != "") {
			// holder.tvVolume.setText(getItem(position).getBookVolume());
			// holder.tvVolume.setVisibility(View.VISIBLE);
			// }
			// }
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.menu_row, null);
			TextView tvMenuTitle = (TextView) convertView
					.findViewById(R.id.tvMenuTitle);
			TextView tvVolume = (TextView) convertView
					.findViewById(R.id.tvVolume);
			tvMenuTitle.setText(getItem(position).getBookChapterName());
			if (position == 0) {
				tvMenuTitle.setTextSize(18);
				tvMenuTitle.setTextColor(R.color.blue);
			} else {
				if (getItem(position).getBookVolume() != null
						&& getItem(position).getBookVolume() != "") {
					tvVolume.setText(getItem(position).getBookVolume());
					tvVolume.setVisibility(View.VISIBLE);
				}
			}
			return convertView;
		}
	}
}
