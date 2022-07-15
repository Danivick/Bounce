
	 
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

	public class profile_activity extends Activity {

	
	private View _bg__profile_ek2;
	private ImageView vector;
	private ImageView vector_ek1;
	private View line_3;
	private TextView settings;
	private ImageView _300_album_80039_1;
	private ImageView j_balvin_bad_bunny_oasis_2;
	private ImageView d3cb603523f4f9197b495f0892139dec_1;
	private TextView my_playlists;
	private TextView queue_settings;
	private ImageView arrow_5;
	private TextView volume_level_ek2;
	private ImageView arrow_4;
	private TextView gapless_playback_ek1;
	private ImageView arrow_3;
	private TextView sleep_timer_ek1;
	private ImageView arrow_2;
	private TextView danivick;
	private ImageView profile_icon;
	private View nav_rectangle_bg4;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private ImageView vector_ek7;
	private ImageView icon;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);

		
		_bg__profile_ek2 = (View) findViewById(R.id._bg__profile_ek2);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		line_3 = (View) findViewById(R.id.line_3);
		settings = (TextView) findViewById(R.id.settings);
		_300_album_80039_1 = (ImageView) findViewById(R.id._300_album_80039_1);
		j_balvin_bad_bunny_oasis_2 = (ImageView) findViewById(R.id.j_balvin_bad_bunny_oasis_2);
		d3cb603523f4f9197b495f0892139dec_1 = (ImageView) findViewById(R.id.d3cb603523f4f9197b495f0892139dec_1);
		my_playlists = (TextView) findViewById(R.id.my_playlists);
		queue_settings = (TextView) findViewById(R.id.queue_settings);
		arrow_5 = (ImageView) findViewById(R.id.arrow_5);
		volume_level_ek2 = (TextView) findViewById(R.id.volume_level_ek2);
		arrow_4 = (ImageView) findViewById(R.id.arrow_4);
		gapless_playback_ek1 = (TextView) findViewById(R.id.gapless_playback_ek1);
		arrow_3 = (ImageView) findViewById(R.id.arrow_3);
		sleep_timer_ek1 = (TextView) findViewById(R.id.sleep_timer_ek1);
		arrow_2 = (ImageView) findViewById(R.id.arrow_2);
		danivick = (TextView) findViewById(R.id.danivick);
		profile_icon = (ImageView) findViewById(R.id.profile_icon);
		nav_rectangle_bg4 = (View) findViewById(R.id.nav_rectangle_bg4);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		icon = (ImageView) findViewById(R.id.icon);
	
		
		//custom code goes here

		BottomNavigationView bottomNavigationView = findViewById(R.id.navbar);

		bottomNavigationView.setSelectedItemId(R.id.profile);

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

						return true;
				}
				return false;
			}
		});

	}
}
	
	