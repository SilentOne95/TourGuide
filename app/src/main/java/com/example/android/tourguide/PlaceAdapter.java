package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID default_translation.
        TextView defaultTranslation = listItemView.findViewById(R.id.default_translation);
        // Get the default (English) translation from the currentPlace object and set this text on
        // the Default TextView.
        defaultTranslation.setText(currentPlace.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID polish_translation.
        TextView polishTranslation = listItemView.findViewById(R.id.polish_translation);

        // Get the polish translation from the currentPlace object and set this text on
        // the Polish TextView.
        polishTranslation.setText(currentPlace.getPolishTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Display the provided image based on the resource ID
        imageView.setImageResource(currentPlace.getImageResourceId());

        return listItemView;
    }
}
