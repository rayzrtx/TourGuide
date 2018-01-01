package com.example.android.tourguide;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        //Create an ArrayList of attractions to display when Landmarks category is clicked
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("The Alamo", "300 Alamo Plaza",
                "San Antonio, TX 78205", R.drawable.alamo));
        attractions.add(new Attraction("RiverWalk", "100 Villita St.",
                "San Antonio, TX 78205", R.drawable.riverwalk));
        attractions.add(new Attraction("San Antonio Missions",
                "6701 San Jose Dr.", "San Antonio, TX 78214", R.drawable.missions));
        attractions.add(new Attraction("San Fernando Cathedral", "115 Main Plaza",
                "San Antonio, TX 78205", R.drawable.sfcathedral));
        attractions.add(new Attraction("Japanese Tea Gardens", "3853 N. St. Mary's",
                "San Antonio, TX 78212", R.drawable.teagarden));
        attractions.add(new Attraction("Botanical Gardens", "555 Funston Place",
                "San Antonio, TX 78209", R.drawable.botanicalgardens));
        attractions.add(new Attraction("Institute of Texan Cultures",
                "801 E. Cesar E. Chavez Blvd.", "San Antonio, TX 78205", R.drawable.institute));
        attractions.add(new Attraction("Tower of Americas", "739 E. Cesar E. Chavez Blvd.",
                "San Antonio, TX 78205", R.drawable.tower));
        attractions.add(new Attraction("Sea World", "10500 Sea World Dr.",
                "San Antonio, TX 78251", R.drawable.seaworld));
        attractions.add(new Attraction("Fiesta Texas", "17000 IH-10 W",
                "San Antonio, TX 78257", R.drawable.fiestatexas));


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
