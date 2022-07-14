
	 
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


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_activity extends Activity {

	
	private View _bg__splash_ek2;
	private ImageView splash_screen_01_1;
	private TextView the_second_most_popular_place_to_listen_to_music_and_growing_fast_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		
		_bg__splash_ek2 = (View) findViewById(R.id._bg__splash_ek2);
		splash_screen_01_1 = (ImageView) findViewById(R.id.splash_screen_01_1);
		the_second_most_popular_place_to_listen_to_music_and_growing_fast_ = (TextView) findViewById(R.id.splash_text);
	
		
		//custom code goes here
		splash_screen_01_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(splash_activity.this, home_activity.class);
				startActivity(intent);
			}
		});
	}
}
	
	