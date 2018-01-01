package com.example.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by raylinares on 12/29/17.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {


    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions){
        super(context, 0, attractions);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_name.
        TextView nameTextView = (TextView) view.findViewById(R.id.attraction_name);

        // Get the attraction name from the currentAttraction object and set this text on
        // the attraction name TextView.
        nameTextView.setText(currentAttraction.getAttractionName());

        // Find the TextView in the list_item.xml layout with the ID attraction_street.
        TextView streetTextView = (TextView) view.findViewById(R.id.attraction_street);

        // Get the attraction street address from the currentAttraction object and set this text on
        // the attraction street TextView.
        streetTextView.setText(currentAttraction.getAttractionStreet());

        // Find the TextView in the list_item.xml layout with the ID attraction_city.
        TextView cityTextView = (TextView) view.findViewById(R.id.attraction_city);

        // Get the attraction city, state and zip from the currentAttraction object and set this text on
        // the attraction city TextView.
        cityTextView.setText(currentAttraction.getAttractionCityZip());

        //Set the background image for the list item
        View textContainer = view.findViewById(R.id.text_container);
        // Find the image that the resource ID maps to
        int backgroundImage = currentAttraction.getBackgroundImageResourceId();
        // Set the background image of the text container View
        textContainer.setBackgroundResource(backgroundImage);

        // Return the whole list item layout (containing 3 TextViews and an image background) so that it can be shown in
        // the ListView in word_list.
        return view;

    }
}
