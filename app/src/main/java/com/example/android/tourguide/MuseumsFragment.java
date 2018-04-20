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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create new list of places.
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("National Museum of Poland",
                "Muzeum Narodowe"));
        places.add(new Place("The Warsaw Uprising Museum",
                "Muzeum Powstania Warszawskiego"));
        places.add(new Place("The Royal Castle",
                "Zamek Królewski"));
        places.add(new Place("Museum of the Polish Army",
                "Muzeum Wojska Polskiego"));
        places.add(new Place("POLIN Museum of the History of Polish Jews",
                "Muzeum Historii Żydów Polskich"));
        places.add(new Place("Copernicus Science Centre",
                "Centrum Nauki Kopernik"));


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
