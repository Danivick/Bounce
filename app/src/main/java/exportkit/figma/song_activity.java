
	 
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
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;


import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ImageView;

import java.io.File;
import java.text.BreakIterator;
import java.time.Duration;
import java.util.ArrayList;

	public class song_activity extends Activity {

	

	private TextView active_song_Name;
	private TextView time1;
	private TextView time2;
	private SeekBar seekBar;
	private View ellipse_26;
	private ImageView playbt;
	private ImageView back_arrow;
	private ImageView previousbt;
	private ImageView nextbt;

	String sName;
	private TextView from_favorites;
	public static final String EXTRA_NAME = "song_name";
	static MediaPlayer mediaPlayer;
	int position;
	ArrayList<File>mySongs;
	Thread updateSeekbar;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.song);

		active_song_Name = (TextView) findViewById(R.id.active_song_name);
		time1 = (TextView) findViewById(R.id.time1);
		time2 = (TextView) findViewById(R.id.time2);
		seekBar = (SeekBar) findViewById(R.id.seekbar);
		back_arrow = (ImageView) findViewById(R.id.back_arrow);
		previousbt = (ImageView) findViewById(R.id.previousbt);
		nextbt = (ImageView) findViewById(R.id.nextbt);
		playbt = (ImageView) findViewById(R.id.playbt);

		//custom code goes here
		if(mediaPlayer != null){
			mediaPlayer.stop();
			mediaPlayer.release();
		}
		Intent i = getIntent();
		Bundle bundle = i.getExtras();

		mySongs = (ArrayList) bundle.getParcelableArrayList("songs");
		String songname = i.getStringExtra("songname");
		position = bundle.getInt("pos", 0);
		active_song_Name.setSelected(true);

		Uri uri = Uri.parse(mySongs.get(position).toString());
		sName = mySongs.get(position).getName();
		active_song_Name.setText(sName);

		mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
		mediaPlayer.start();
		updateSeekbar = new Thread(){
			@Override
			public void run() {
				int totalDuration = mediaPlayer.getDuration();
				int currentposition = 0;

				while(currentposition < totalDuration){
					try{
						sleep(500);
						currentposition = mediaPlayer.getCurrentPosition();
						seekBar.setProgress(currentposition);
					}catch (InterruptedException | IllegalStateException e){
						e.printStackTrace();
					}
				}
			}
		};
		seekBar.setMax(mediaPlayer.getDuration());
		updateSeekbar.start();
		seekBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.line_2_color), PorterDuff.Mode.MULTIPLY);
		seekBar.getThumb().setColorFilter(getResources().getColor(R.color.bounce_purple), PorterDuff.Mode.MULTIPLY);

		seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {

			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				mediaPlayer.seekTo(seekBar.getProgress());
			}
		});

		String endTime = createTime(mediaPlayer.getDuration());
		time2.setText(endTime);

		final Handler handler = new Handler();
		final int delay = 1000;

		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				String currentTime = createTime(mediaPlayer.getCurrentPosition());
				time1.setText(currentTime);
				handler.postDelayed(this, delay);
			}
		}, delay);

				playbt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if(mediaPlayer.isPlaying()){
					mediaPlayer.pause();
				}else{
					mediaPlayer.start();
				}
			}
		});
		nextbt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mediaPlayer.stop();
				mediaPlayer.release();
				position = ((position+1)%mySongs.size());
				Uri uri2 = Uri.parse(mySongs.get(position).toString());
				mediaPlayer = MediaPlayer.create(getApplicationContext(), uri2);
				sName = mySongs.get(position).getName();
				active_song_Name.setText(sName);
				mediaPlayer.start();
			}
		});
		previousbt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mediaPlayer.stop();
				mediaPlayer.release();
				position = ((position-1)<0)?(mySongs.size()-1):(position-1);
				Uri uri2 = Uri.parse(mySongs.get(position).toString());
				mediaPlayer = MediaPlayer.create(getApplicationContext(), uri2);
				sName = mySongs.get(position).getName();
				active_song_Name.setText(sName);
				mediaPlayer.start();
			}
		});

		mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mediaPlayer) {
				nextbt.performClick();
			}
		});

		back_arrow.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(song_activity.this, home_activity.class);
				startActivity(intent);
			}
		});



	}
	public String createTime(int duration){
		String time = "";
		int min = duration/1000/60;
		int sec = duration/1000%60;

		time += min + ":";

		if(sec<10){
			time+="0";
		}
		time+=sec;

		return time;
	}
}
	
	