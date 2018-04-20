package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create new list of places.
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("The Sigismund's Column",
                "Kolumna Zygmunta", R.drawable.flag));
        places.add(new Place("The Tomb of the Unknown Soldier",
                "Grób Nieznanego Żołnierza", R.drawable.flag));
        places.add(new Place("The Chopin Statue",
                "Pomnik Chopina", R.drawable.flag));
        places.add(new Place("The Little Insurrectionist",
                "Pomnik Małego Powstańca", R.drawable.flag));
        places.add(new Place("The Monument to Prince Józef Poniatowski",
                "Pomnik księcia Józefa Poniatwoskiego", R.drawable.flag));
        places.add(new Place("The Nicolaus Copernicus Monument",
                "Pomnik Mikołaja Kopernika", R.drawable.flag));
        places.add(new Place("The Monument to the Heroes of Warsaw",
                "Pomnik Bohaterów Warszawy", R.drawable.flag));
        places.add(new Place("The Aviator Monument",
                "Pomnik Lotnika", R.drawable.flag));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        // The adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
