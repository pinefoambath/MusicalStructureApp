import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.musicalstructureapp.R;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
        public SongAdapter(Activity context, ArrayList<Song> songs)

        {
            super(context, 0, songs);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.activity_main, parent, false);
            }

            // Get the Song object located at this position in the list
          Song currentSong = getItem(position);

            // Find the TextView in the list_item.xml layout that displays the artist name
            TextView artistTextView = (TextView) listItemView.findViewById(R.id.Artist);
            // Get the artist name from the current Song object and
            // set this text on the artist TextView
            artistTextView.setText(currentSong.getArtist());

            // Find the TextView in the list_item.xml layout called Songtitle
            TextView songtitleTextView = (TextView) listItemView.findViewById(R.id.Songtitle);
            // Get the song title from the current Song object and
            // set this text on the song TextView
            songtitleTextView.setText(currentSong.getSong());

            // Return the whole list item layout (containing 2 TextViews)
            // so that it can be shown in the ListView
            return listItemView;
        }

    }



}
