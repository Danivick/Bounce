
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		playlist
	 *	@date 		Thursday 14th of July 2022 07:31:59 AM
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
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

	public class recently_played_activity extends Activity {

	
	private View _bg__playlist;
	private ImageView playlist_cover;
	private TextView artist_name;
	private TextView song_name;
	private ImageView drakepic;
	private TextView artist_name_2;
	private TextView song_name_2;
	private ImageView darklane4_ek1;
	private TextView artist_name_ek2;
	private TextView album_song_ek2;
	private ImageView back_arrow;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.recently_played);

		
		_bg__playlist = (View) findViewById(R.id._bg__playlist);
		playlist_cover = (ImageView) findViewById(R.id.playlist_cover);
		artist_name = (TextView) findViewById(R.id.artist_name);
		song_name = (TextView) findViewById(R.id.song_name);
		drakepic = (ImageView) findViewById(R.id.drakepic);
		artist_name_2 = (TextView) findViewById(R.id.artist_name_2);
		song_name_2 = (TextView) findViewById(R.id.song_name_2);
		darklane4_ek1 = (ImageView) findViewById(R.id.darklane4_ek1);
		artist_name_ek2 = (TextView) findViewById(R.id.artist_name_ek2);
		album_song_ek2 = (TextView) findViewById(R.id.album_song_ek2);
		back_arrow = (ImageView) findViewById(R.id.back_arrowR);
	

		
		//custom code goes here
		back_arrow.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(recently_played_activity.this, home_activity.class);
				startActivity(intent);
			}
		});

		BottomNavigationView bottomNavigationView = findViewById(R.id.navbar);

		bottomNavigationView.setSelectedItemId(R.id.albums);

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
						startActivity(new Intent(getApplicationContext(), home_activity.class));
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
	
	