
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		albums
	 *	@date 		Thursday 14th of July 2022 07:29:31 AM
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

	public class albums_activity extends Activity {

	
	private View _bg__albums;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView aura;
	private ImageView oasis;
	private ImageView sap;
	private ImageView album_cover;
	private TextView osuna;
	private TextView aura_of_sound;
	private TextView drake;
	private TextView scorpion;
	private TextView nasty__c;
	private TextView sap_ek1;
	private TextView unknown;
	private TextView whatsapp_audio;
	private TextView albums_ek1;
	private View navrectangle_bg3;
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
		setContentView(R.layout.albums);

		
		_bg__albums = (View) findViewById(R.id._bg__albums);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		aura = (ImageView) findViewById(R.id.aura);
		oasis = (ImageView) findViewById(R.id.oasis);
		sap = (ImageView) findViewById(R.id.sap);
		album_cover = (ImageView) findViewById(R.id.album_cover);
		osuna = (TextView) findViewById(R.id.osuna);
		aura_of_sound = (TextView) findViewById(R.id.aura_of_sound);
		drake = (TextView) findViewById(R.id.drake);
		scorpion = (TextView) findViewById(R.id.scorpion);
		nasty__c = (TextView) findViewById(R.id.nasty__c);
		sap_ek1 = (TextView) findViewById(R.id.sap_ek1);
		unknown = (TextView) findViewById(R.id.unknown);
		whatsapp_audio = (TextView) findViewById(R.id.whatsapp_audio);
		albums_ek1 = (TextView) findViewById(R.id.albums_ek1);

		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		icon = (ImageView) findViewById(R.id.icon);
	
		
		//custom code goes here
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

						return true;
				}
				return false;
			}
		});
	
	}
}
	
	