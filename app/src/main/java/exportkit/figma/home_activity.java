
	 
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

	public class home_activity extends Activity {

	
	private View _bg__home_ek4;
	private ImageView _300_album_80039_1_ek1;
	private ImageView j_balvin_bad_bunny_oasis_2_ek1;
	private ImageView d3cb603523f4f9197b495f0892139dec_1_ek1;
	private TextView albums_ek1;
	private TextView most_played_ek1;
	private ImageView rectangle_2;
	private ImageView rectangle_2_ek1;
	private ImageView rectangle_2_ek2;
	private ImageView _300_album_80039_1_ek2;
	private ImageView j_balvin_bad_bunny_oasis_2_ek2;
	private ImageView d3cb603523f4f9197b495f0892139dec_1_ek2;
	private TextView recently_played_ek1;
	private ImageView arrow_1;
	private TextView listen_to_sumn;
	private TextView welcome;
	private View rectangle_13;
	private ImageView vector_ek36;
	private ImageView vector_ek37;
	private ImageView vector_ek38;
	private ImageView vector_ek39;
	private ImageView icon_ek2;
	private ImageView vector_ek40;
	private ImageView vector_ek41;
	private View rectangle_12;
	private ImageView j_balvin_bad_bunny_oasis_1;
	private ImageView vector_ek42;
	private ImageView vector_ek43;
	private TextView some_nights;
	private TextView saint_jhn;
	private View ellipse_25;
	private ImageView polygon_4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		
		_bg__home_ek4 = (View) findViewById(R.id._bg__home_ek4);
		_300_album_80039_1_ek1 = (ImageView) findViewById(R.id._300_album_80039_1_ek1);
		j_balvin_bad_bunny_oasis_2_ek1 = (ImageView) findViewById(R.id.j_balvin_bad_bunny_oasis_2_ek1);
		d3cb603523f4f9197b495f0892139dec_1_ek1 = (ImageView) findViewById(R.id.d3cb603523f4f9197b495f0892139dec_1_ek1);
		albums_ek1 = (TextView) findViewById(R.id.albums_ek1);
		most_played_ek1 = (TextView) findViewById(R.id.most_played_ek1);
		rectangle_2 = (ImageView) findViewById(R.id.rectangle_2);
		rectangle_2_ek1 = (ImageView) findViewById(R.id.rectangle_2_ek1);
		rectangle_2_ek2 = (ImageView) findViewById(R.id.rectangle_2_ek2);
		_300_album_80039_1_ek2 = (ImageView) findViewById(R.id._300_album_80039_1_ek2);
		j_balvin_bad_bunny_oasis_2_ek2 = (ImageView) findViewById(R.id.j_balvin_bad_bunny_oasis_2_ek2);
		d3cb603523f4f9197b495f0892139dec_1_ek2 = (ImageView) findViewById(R.id.d3cb603523f4f9197b495f0892139dec_1_ek2);
		recently_played_ek1 = (TextView) findViewById(R.id.recently_played_ek1);
		arrow_1 = (ImageView) findViewById(R.id.arrow_1);
		listen_to_sumn = (TextView) findViewById(R.id.listen_to_sumn);
		welcome = (TextView) findViewById(R.id.welcome);
		rectangle_13 = (View) findViewById(R.id.rectangle_13);
		vector_ek36 = (ImageView) findViewById(R.id.vector_ek36);
		vector_ek37 = (ImageView) findViewById(R.id.vector_ek37);
		vector_ek38 = (ImageView) findViewById(R.id.vector_ek38);
		vector_ek39 = (ImageView) findViewById(R.id.vector_ek39);
		icon_ek2 = (ImageView) findViewById(R.id.icon_ek2);
		vector_ek40 = (ImageView) findViewById(R.id.vector_ek40);
		vector_ek41 = (ImageView) findViewById(R.id.vector_ek41);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		j_balvin_bad_bunny_oasis_1 = (ImageView) findViewById(R.id.j_balvin_bad_bunny_oasis_1);
		vector_ek42 = (ImageView) findViewById(R.id.vector_ek42);
		vector_ek43 = (ImageView) findViewById(R.id.vector_ek43);
		some_nights = (TextView) findViewById(R.id.some_nights);
		saint_jhn = (TextView) findViewById(R.id.saint_jhn);
		ellipse_25 = (View) findViewById(R.id.ellipse_25);
		polygon_4 = (ImageView) findViewById(R.id.polygon_4);
	
		
		//custom code goes here

		BottomNavigationView bottomNavigationView = findViewById(R.id.navbar);

		bottomNavigationView.setSelectedItemId(R.id.home);

		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
				switch (menuItem.getItemId()){
					case R.id.home:

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

		//Navigation Bar
		vector_ek36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(home_activity.this, home_activity.class);
				startActivity(intent);
			}
		});
		icon_ek2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(home_activity.this, favorite_activity.class);
				startActivity(intent);
			}
		});
		vector_ek41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(home_activity.this, profile_activity.class);
				startActivity(intent);
			}
		});
		rectangle_12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(home_activity.this, song_activity.class);
				startActivity(intent);
			}
		});

	}
}
	
	