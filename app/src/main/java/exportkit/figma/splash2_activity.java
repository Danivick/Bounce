
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		splash2
	 *	@date 		Tuesday 12th of July 2022 08:51:45 PM
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

public class splash2_activity extends Activity {

	
	private View _bg__splash2;
	private ImageView splash2;
	private TextView experience_ad_free_completely_uninterrupted_offline_access_to_all_your_music_;
	private TextView play_offline;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash2);

		
		_bg__splash2 = (View) findViewById(R.id._bg__splash2);
		splash2 = (ImageView) findViewById(R.id.splash_2);
		experience_ad_free_completely_uninterrupted_offline_access_to_all_your_music_ = (TextView) findViewById(R.id.experience_ad_free_completely_uninterrupted_offline_access_to_all_your_music_);
		play_offline = (TextView) findViewById(R.id.play_offline);
	
		
		//custom code goes here
		splash2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(splash2_activity.this, splash3_activity.class);
				startActivity(intent);
			}
		});
	
	}
}
	
	