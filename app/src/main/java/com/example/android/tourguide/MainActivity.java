package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the "Landmarks" category
        TextView landmarks = (TextView) findViewById(R.id.landmarks);

        //Set a click listener for the Landmarks view
        landmarks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Landmarks View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LandmarksActivity}
                Intent landmarksIntent = new Intent(MainActivity.this, LandmarksActivity.class);

                // Start the new activity
                startActivity(landmarksIntent);
            }
        });

        //Find the view that shows the "Restaurants" category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        //Set a click listener for the Restaurants view
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Restaurants View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });
    }
}
