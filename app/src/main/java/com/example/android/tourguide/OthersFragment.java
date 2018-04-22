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
public class OthersFragment extends Fragment {


    public OthersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create new list of places.
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.other_one_eng), getString(R.string.other_one_polish)));
        places.add(new Place(getString(R.string.other_two_eng), getString(R.string.other_two_polish)));
        places.add(new Place(getString(R.string.other_three_eng), getString(R.string.other_three_polish)));
        places.add(new Place(getString(R.string.other_four_eng), getString(R.string.other_four_polish)));
        places.add(new Place(getString(R.string.other_five_eng), getString(R.string.other_five_polish)));
        places.add(new Place(getString(R.string.other_six_eng), getString(R.string.other_six_polish)));
        places.add(new Place(getString(R.string.other_seven_eng), getString(R.string.other_seven_polish)));
        places.add(new Place(getString(R.string.other_eight_eng), getString(R.string.other_eight_polish)));


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
