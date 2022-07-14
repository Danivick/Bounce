
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		profile
	 *	@date 		1657543253110
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

	public class favorite_activity extends Activity {

	
	private View _bg__favorite_ek2;
	private ImageView vector_ek8;
	private ImageView vector_ek9;
	private TextView liked_songs;
	private TextView chicago_freestyle___drake;
	private TextView drake;
	private ImageView darklane4;
	private TextView chicago_freestyle___drake_ek1;
	private TextView drake_ek1;
	private ImageView darklane3;
	private TextView chicago_freestyle___drake_ek2;
	private TextView drake_ek2;
	private ImageView darklane2;
	private TextView chicago_freestyle___drake_ek3;
	private TextView drake_ek3;
	private ImageView darklane;
	private ImageView vector_ek10;
	private ImageView vector_ek11;
	private ImageView aura;
	private ImageView oasis;
	private ImageView sap;
	private TextView liked_playlist_ek1;
	private TextView find_in_liked_songs;
	private View search_bar;
	private View navrectangle_bg3;
	private ImageView vector_ek12;
	private ImageView vector_ek13;
	private ImageView vector_ek14;
	private ImageView vector_ek15;
	private ImageView vector_ek16;
	private ImageView vector_ek17;
	private ImageView icon_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.favorite);

		
		_bg__favorite_ek2 = (View) findViewById(R.id._bg__favorite_ek2);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		liked_songs = (TextView) findViewById(R.id.liked_songs);
		chicago_freestyle___drake = (TextView) findViewById(R.id.chicago_freestyle___drake);
		drake = (TextView) findViewById(R.id.drake);
		darklane4 = (ImageView) findViewById(R.id.darklane4);
		chicago_freestyle___drake_ek1 = (TextView) findViewById(R.id.chicago_freestyle___drake_ek1);
		drake_ek1 = (TextView) findViewById(R.id.drake_ek1);
		darklane3 = (ImageView) findViewById(R.id.darklane3);
		chicago_freestyle___drake_ek2 = (TextView) findViewById(R.id.chicago_freestyle___drake_ek2);
		drake_ek2 = (TextView) findViewById(R.id.drake_ek2);
		darklane2 = (ImageView) findViewById(R.id.darklane2);
		chicago_freestyle___drake_ek3 = (TextView) findViewById(R.id.chicago_freestyle___drake_ek3);
		drake_ek3 = (TextView) findViewById(R.id.drake_ek3);
		darklane = (ImageView) findViewById(R.id.darklane);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		aura = (ImageView) findViewById(R.id.aura);
		oasis = (ImageView) findViewById(R.id.oasis);
		sap = (ImageView) findViewById(R.id.sap);
		liked_playlist_ek1 = (TextView) findViewById(R.id.liked_playlist_ek1);
		find_in_liked_songs = (TextView) findViewById(R.id.find_in_liked_songs);
		search_bar = (View) findViewById(R.id.search_bar);

	
		
		//custom code goes here

		BottomNavigationView bottomNavigationView = findViewById(R.id.navbar);

		bottomNavigationView.setSelectedItemId(R.id.favorite);

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

		//Navigation
		vector_ek12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(favorite_activity.this, home_activity.class);
				startActivity(intent);
			}
		});

		icon_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(favorite_activity.this, favorite_activity.class);
				startActivity(intent);
			}
		});

		vector_ek17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(favorite_activity.this, profile_activity.class);
				startActivity(intent);
			}
		});
	}
}
	
	