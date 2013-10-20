package com.example.advancedfragment;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarListFragment extends ListFragment {
	
	private OnListItemSelectedListener listItemSelectedListener;
	
	public interface OnListItemSelectedListener {
	    public void onListItemSelected(String comicID);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setListAdapter(ArrayAdapter.createFromResource(
	    		getActivity().getApplicationContext(), 
	    		R.array.star_names,
	    		R.layout.star_list_item));
	    
	    listItemSelectedListener = (OnListItemSelectedListener) getActivity();
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		final String[] links = getResources().getStringArray(R.array.star_images);
		String strip = links[position];
		listItemSelectedListener.onListItemSelected(strip);
	} 
}
