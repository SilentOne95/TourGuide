package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create new list of places.
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("test", "test polish", R.drawable.flag));
        places.add(new Place("test", "test polish", R.drawable.flag));
        places.add(new Place("test", "test polish", R.drawable.flag));
        places.add(new Place("test", "test polish", R.drawable.flag));
        places.add(new Place("test", "test polish", R.drawable.flag));
        places.add(new Place("test", "test polish", R.drawable.flag));
        places.add(new Place("test", "test polish", R.drawable.flag));
        places.add(new Place("test", "test polish", R.drawable.flag));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        // The adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
    }
}
