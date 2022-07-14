
	 
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
import android.widget.TextView;
import android.widget.ImageView;

public class song_activity extends Activity {

	
	private View _bg__song_ek2;
	private TextView album___aura;
	private TextView vaina_loca___osuna;
	private ImageView _300_album_80039_2;
	private TextView _1_25;
	private TextView _3_15;
	private View line_1;
	private View line_2;
	private View ellipse_26;
	private ImageView vector_ek18;
	private ImageView vector_ek19;
	private ImageView vector_ek20;
	private ImageView vector_ek21;
	private ImageView vector_ek22;
	private ImageView vector_ek23;
	private ImageView vector_ek24;
	private ImageView vector_ek25;
	private ImageView vector_ek26;
	private ImageView vector_ek27;
	private ImageView vector_ek28;
	private ImageView vector_ek29;
	private ImageView vector_ek30;
	private ImageView vector_ek31;
	private ImageView vector_ek32;
	private ImageView vector_ek33;
	private ImageView vector_ek34;
	private ImageView vector_ek35;
	private TextView from_favorites;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.song);

		
		_bg__song_ek2 = (View) findViewById(R.id._bg__song_ek2);
		album___aura = (TextView) findViewById(R.id.album___aura);
		vaina_loca___osuna = (TextView) findViewById(R.id.vaina_loca___osuna);
		_300_album_80039_2 = (ImageView) findViewById(R.id._300_album_80039_2);
		_1_25 = (TextView) findViewById(R.id._1_25);
		_3_15 = (TextView) findViewById(R.id._3_15);
		line_1 = (View) findViewById(R.id.line_1);
		line_2 = (View) findViewById(R.id.line_2);
		ellipse_26 = (View) findViewById(R.id.ellipse_26);
		vector_ek18 = (ImageView) findViewById(R.id.vector_ek18);
		vector_ek19 = (ImageView) findViewById(R.id.vector_ek19);
		vector_ek20 = (ImageView) findViewById(R.id.vector_ek20);
		vector_ek21 = (ImageView) findViewById(R.id.vector_ek21);
		vector_ek22 = (ImageView) findViewById(R.id.vector_ek22);
		vector_ek23 = (ImageView) findViewById(R.id.vector_ek23);
		vector_ek24 = (ImageView) findViewById(R.id.vector_ek24);
		vector_ek25 = (ImageView) findViewById(R.id.vector_ek25);
		vector_ek26 = (ImageView) findViewById(R.id.vector_ek26);
		vector_ek27 = (ImageView) findViewById(R.id.vector_ek27);
		vector_ek28 = (ImageView) findViewById(R.id.vector_ek28);
		vector_ek29 = (ImageView) findViewById(R.id.vector_ek29);
		vector_ek30 = (ImageView) findViewById(R.id.vector_ek30);
		vector_ek31 = (ImageView) findViewById(R.id.vector_ek31);
		vector_ek32 = (ImageView) findViewById(R.id.vector_ek32);
		vector_ek33 = (ImageView) findViewById(R.id.vector_ek33);
		vector_ek34 = (ImageView) findViewById(R.id.vector_ek34);
		vector_ek35 = (ImageView) findViewById(R.id.vector_ek35);
		from_favorites = (TextView) findViewById(R.id.from_favorites);
	
		
		//custom code goes here
		vector_ek34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(song_activity.this, home_activity.class);
				startActivity(intent);
			}
		});
	}
}
	
	