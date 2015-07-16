package com.serloman.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            actionSettings();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void actionSettings(){
        Toast.makeText(this, "This is Settings", Toast.LENGTH_SHORT).show();
    }

    private void initButtons(){
        initStreamer();
        initFootballScores();
        initLibrary();
        initBuildItBigger();
        initXYZReader();
        initCapstone();
    }

    private void initStreamer(){
        Button streamerButton = (Button) findViewById(R.id.buttonSpotifyStreamer);
        streamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionStreamer();
            }
        });
    }

    private void actionStreamer(){
        showProvisionalButtonAction(getString(R.string.app_streamer));
    }

    private void initFootballScores(){
        Button streamerButton = (Button) findViewById(R.id.buttonFootbalScores);
        streamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionFootballScores();
            }
        });
    }

    private void actionFootballScores(){
        showProvisionalButtonAction(getString(R.string.app_football_scores));
    }

    private void initLibrary(){
        Button streamerButton = (Button) findViewById(R.id.buttonLibrary);
        streamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionLibrary();
            }
        });
    }

    private void actionLibrary(){
        showProvisionalButtonAction(getString(R.string.app_library));
    }

    private void initBuildItBigger(){
        Button streamerButton = (Button) findViewById(R.id.buttonBuildItBigger);
        streamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionBuildItBigger();
            }
        });
    }

    private void actionBuildItBigger(){
        showProvisionalButtonAction(getString(R.string.app_build_it_bigger));
    }

    private void initXYZReader(){
        Button streamerButton = (Button) findViewById(R.id.buttonXYZReader);
        streamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionXYZReader();
            }
        });
    }

    private void actionXYZReader(){
        showProvisionalButtonAction(getString(R.string.app_XYZReader));
    }

    private void initCapstone(){
        Button streamerButton = (Button) findViewById(R.id.buttonCapstone);
        streamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionCapstone();
            }
        });
    }

    private void actionCapstone(){
        showProvisionalButtonAction(getString(R.string.app_capstone));
    }


    private void showProvisionalButtonAction(String appName){
        Toast.makeText(this, "This will launch my " + appName + " app.", Toast.LENGTH_SHORT).show();
    }
}
