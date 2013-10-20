package com.example.advancedfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class StarDetailFragment extends Fragment{
	
	private ImageView viewer;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    View view = (View) inflater.inflate(R.layout.fragment_star_detail, container, true);
	    viewer = (ImageView) view.findViewById(R.id.iv_star);

	    return view;
	}
	
	public void updateStar(String starImage) {
	    if (viewer != null) {
	    	viewer.setBackgroundResource(matchResourceID(starImage));
	    }
	}
	
	private int matchResourceID(String starImage) {
		int id = getResources().getIdentifier(starImage, "drawable", getActivity().getPackageName());
		return id;
		
	}
}
