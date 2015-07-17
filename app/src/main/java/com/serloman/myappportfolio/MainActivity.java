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
        initButtonDefault(R.id.buttonSpotifyStreamer);
        initButtonDefault(R.id.buttonFootbalScores);
        initButtonDefault(R.id.buttonLibrary);
        initButtonDefault(R.id.buttonBuildItBigger);
        initButtonDefault(R.id.buttonXYZReader);
        initButtonDefault(R.id.buttonCapstone);
    }

    private void initButtonDefault(final int idButton){
        Button defaultButton = (Button) findViewById(idButton);
        defaultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionButton(idButton);
            }
        });
    }

    private void actionButton(int idButton){
        switch (idButton){
            case R.id.buttonSpotifyStreamer:
                showProvisionalButtonAction(getString(R.string.app_streamer));
                break;
            case R.id.buttonFootbalScores:
                showProvisionalButtonAction(getString(R.string.app_football_scores));
                break;
            case R.id.buttonLibrary:
                showProvisionalButtonAction(getString(R.string.app_library));
                break;
            case R.id.buttonBuildItBigger:
                showProvisionalButtonAction(getString(R.string.app_build_it_bigger));
                break;
            case R.id.buttonXYZReader:
                showProvisionalButtonAction(getString(R.string.app_XYZReader));
                break;
            case R.id.buttonCapstone:
                showProvisionalButtonAction(getString(R.string.app_capstone));
                break;
        }
    }

    private void showProvisionalButtonAction(String appName){
        Toast.makeText(this, "This will launch my " + appName + " app.", Toast.LENGTH_SHORT).show();
    }
}
