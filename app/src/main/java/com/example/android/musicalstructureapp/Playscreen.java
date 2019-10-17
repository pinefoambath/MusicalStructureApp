package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Playscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playscreen);
    }


    // display the name of the artist whose song is playing

    TextView artistView = (TextView) findViewById(R.id.ArtistPlaying);
    artistView.setText(currentSong.getArtist);

    // Find the return button and set an onclick listener

    Button returnbutton = (Button) findViewById(R.id.ReturnButton);
    returnbutton.setOnClickListener(new View.OnClickListener()

    // set the OnClickListener so that the apps returns to the
    // main music library when the button is touched
    {
        @Override
        public void onClick (View view){
        Intent returnIntent = new Intent(this, MainActivity.class);
        startActivity(returnIntent);
    }

    });


}
