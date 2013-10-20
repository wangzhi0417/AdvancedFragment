package com.example.advancedfragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StarDetailActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_detail);
        
        Intent launchingIntent = getIntent();
        String content = launchingIntent.getData().toString();
     
        StarDetailFragment detailFragment = (StarDetailFragment) getFragmentManager()
                .findFragmentById(R.id.fragment_detailview);
     
        detailFragment.updateStar(content);
    }
}
