package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


    public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ArrayList<Song> songs = new ArrayList<Song>();
            songs.add(new Song("The Church", "Under the Milkyway"));
            songs.add(new Song("Queen", "Bohemian Rhapsody"));
            songs.add(new Song("David Hasselhoff", "I have been looking for an apostrophe"));
            songs.add(new Song("Nick Cave", "Hollywood"));
            songs.add(new Song("Nick Cave", "The Ship Song"));
            songs.add(new Song("The Strangers", "Yesterday was cursed"));
            songs.add(new Song("World Pain", "Heading back to the office"));
            songs.add(new Song("Tina Turner", "Simply the Best"));
            songs.add(new Song("Haendel", "Born and bred in Halle"));
            songs.add(new Song("Andi Pants", "Yet another late assignment"));
            songs.add(new Song("Bruce Springsteen", "The River"));
            songs.add(new Song("NKOTB", "We were great in the 80s"));
            songs.add(new Song("The Cure", "The Forest"));
            songs.add(new Song("Nick Cave", "Ghosteen"));
            songs.add(new Song("The Clash", "Should I stay or should I go"));
            songs.add(new Song("The Clash", "London calling"));


            //  ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

           SongAdapter adapter = new SongAdapter(this, songs);

            ListView listView = (ListView) findViewById(R.id.listview_Song);

            listView.setAdapter(adapter);
        }

}
