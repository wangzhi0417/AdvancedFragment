package com.example.advancedfragment;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity 
	implements StarListFragment.OnListItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.v("orientation", "landscape");
          }
        else {
        	Log.v("orientation", "portrait");
        }
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onListItemSelected(String starImage) {
		FragmentManager fm = getFragmentManager();
		StarDetailFragment detailFragment = (StarDetailFragment)fm.findFragmentById(R.id.fragment_detailview);
		if (detailFragment == null || !detailFragment.isInLayout())
		{
			Intent showContent = new Intent(getApplicationContext(), StarDetailActivity.class);
			showContent.setData(Uri.parse(starImage));
			startActivity(showContent);
		}
		else
		{
			detailFragment.updateStar(starImage);
		}
	}
    
}
