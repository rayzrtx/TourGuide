package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        //Create an ArrayList of attractions to display when Restaurants category is clicked
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Rudy's BBQ", "Multiple Locations",
                "San Antonio, TX", R.drawable.rudysbbq));
        attractions.add(new Attraction("Jacala Mexican Restaurant", "606 West Ave.",
                "San Antonio, TX 78201", R.drawable.jacala));
        attractions.add(new Attraction("The Cove", "606 W Cypress St.",
                "San Antonio, TX 78212", R.drawable.cove));
        attractions.add(new Attraction("Cured", "306 Pearl Parkway #101",
                "San Antonio, TX 78215", R.drawable.cured));
        attractions.add(new Attraction("The Granary 'Cue and Brew", "602 Avenue A",
                "San Antonio, TX 78215", R.drawable.granary));
        attractions.add(new Attraction("Kimura", "152 E. Pecan St. #102",
                "San Antonio, TX 78205", R.drawable.kimura));
        attractions.add(new Attraction("Down on Grayson", "303 E. Grayson St.",
                "San Antonio, TX 78215", R.drawable.downongrayson));
        attractions.add(new Attraction("La Fonda on Main", "2415 N. Main Ave",
                "San Antonio, TX 78212", R.drawable.lafonda));
        attractions.add(new Attraction("Pasha", "Multiple locations",
                "San Antonio, TX", R.drawable.pasha));
        attractions.add(new Attraction("Boiler House", "312 Pearl Parkway, Bldg 3",
                "San Antonio, TX 78215", R.drawable.boilerhouse));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(attractionAdapter);
    }
}
