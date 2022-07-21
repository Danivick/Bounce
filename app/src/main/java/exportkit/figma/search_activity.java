package exportkit.figma;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.os.Environment;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.File;
import java.util.ArrayList;

public class search_activity extends Activity {

    private ImageView backarrow;
    ListView listview;
    String[] items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        backarrow = (ImageView) findViewById(R.id.back_arrow9);
        listview = findViewById(R.id.songlist_view);
        runtimePermission();

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(search_activity.this, home_activity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.navbar);

        bottomNavigationView.setSelectedItemId(R.id.search);

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


        public void runtimePermission(){
            Dexter.withContext(this).withPermission(Manifest.permission.READ_EXTERNAL_STORAGE).withListener(new PermissionListener() {
                @Override
                public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                    displaySongs();
                }

                @Override
                public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                }

                @Override
                public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                    permissionToken.continuePermissionRequest();
                }
            }).check();
        }

        public ArrayList<File> findSong(File file){
            ArrayList<File> arrayList = new ArrayList<>();

            File[] files = file.listFiles();

            for(File singlefile: files){
                if(singlefile.isDirectory() && !singlefile.isHidden()){
                    arrayList.addAll(findSong(singlefile));
                }
                else{
                    if(singlefile.getName().endsWith(".mp3")){
                        arrayList.add(singlefile);
                    }
                }
            }return arrayList;
        }

        void displaySongs(){
            final ArrayList<File> mySongs = findSong(Environment.getExternalStorageDirectory());
            items = new String[mySongs.size()];

            for (int i = 0; i < mySongs.size(); i++) {
                items[i] = mySongs.get(i).getName().toString().replace(".mp3","");
            }


            search_activity.customAdapter customAdapter = new search_activity.customAdapter();
            listview.setAdapter(customAdapter);

            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String songName = (String) listview.getItemAtPosition(i);
                    startActivity(new Intent(getApplicationContext(), song_activity.class).
                            putExtra("songs", mySongs).putExtra("songname", songName).putExtra("pos", i));
                }
            });
        }

        class customAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                return items.length;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                View myView = getLayoutInflater().inflate(R.layout.list_item, null);
                TextView textsong = myView.findViewById(R.id.song_name);
                textsong.setSelected(true);
                textsong.setText(items[i]);

                return myView;
            }
        }

}