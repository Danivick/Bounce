
	 
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

    public class playlists_activity extends Activity {


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
        private ImageView back;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.playlists);

            back = (ImageView) findViewById(R.id.back_arrowP);

            //custom code goes here
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(playlists_activity.this, profile_activity.class);
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
	
	