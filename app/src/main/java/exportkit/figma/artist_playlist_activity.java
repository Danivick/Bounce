
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		artist_playlist
	 *	@date 		Thursday 14th of July 2022 07:31:16 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

	public class artist_playlist_activity extends Activity {

	
	private View _bg__artist_playlist;

	private ImageView vector_ek4;
	private TextView shuffle_all;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private TextView playlist;
	private ImageView back_arrow3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.artist_playlist);

		
		_bg__artist_playlist = (View) findViewById(R.id._bg__artist_playlist);

		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		shuffle_all = (TextView) findViewById(R.id.shuffle_all);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		playlist = (TextView) findViewById(R.id.playlist);
		back_arrow3 = (ImageView) findViewById(R.id.back_arrow3);

		
		//custom code goes here
		back_arrow3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});

		BottomNavigationView bottomNavigationView = findViewById(R.id.navbar);

		bottomNavigationView.setSelectedItemId(R.id.artist_playlist);

		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
				switch (menuItem.getItemId()){
					case R.id.home:
						startActivity(new Intent(getApplicationContext(), home_activity.class));
						overridePendingTransition(0,0);
						return true;
				}
				switch (menuItem.getItemId()){
					case R.id.search:
						startActivity(new Intent(getApplicationContext(), search_activity.class));
						overridePendingTransition(0,0);
						return true;
				}
				switch (menuItem.getItemId()){
					case R.id.favorite:
						startActivity(new Intent(getApplicationContext(), favorite_activity.class));
						overridePendingTransition(0,0);
						return true;
				}
				switch (menuItem.getItemId()){
					case R.id.profile:
						startActivity(new Intent(getApplicationContext(), profile_activity.class));
						overridePendingTransition(0,0);
						return true;
				}
				return false;
			}
		});
	
	}

	}
	
	