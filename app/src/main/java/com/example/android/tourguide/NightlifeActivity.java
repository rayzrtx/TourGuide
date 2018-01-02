package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NightlifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Lowcountry", "318 Martinez St.",
                "San Antonio, TX 78205", R.drawable.lowcountry));
        attractions.add(new Attraction("The Esquire Tavern", "155 E. Commerce St.",
                "San Antonio, TX 78205", R.drawable.esquire));
        attractions.add(new Attraction("The Friendly Spot", "943 S. Alamo St.",
                "San Antonio, TX 78205", R.drawable.friendlyspot));
        attractions.add(new Attraction("Alamo Brewery", "415 Burnet St.",
                "San Antonio, TX 78202", R.drawable.alamobrewery));
        attractions.add(new Attraction("La Tuna",
                "100 Probandt", "San Antonio, TX 78204", R.drawable.latuna));
        attractions.add(new Attraction("Paramour", "102 9th St. Ste 400",
                "San Antonio, TX 78215", R.drawable.paramour));
        attractions.add(new Attraction("The Brooklynite", "516 Brooklyn Ave",
                "San Antonio, TX 78215", R.drawable.brooklynite));
        attractions.add(new Attraction("Sternewirth", "136 E. Grayson St.",
                "San Antonio, TX 78215", R.drawable.sternewirth));
        attractions.add(new Attraction("Ocho", "1015 Navarro St.",
                "San Antonio, TX 78205", R.drawable.ocho));
        attractions.add(new Attraction("St. Mary's Strip", "2420 N. St. Mary's St.",
                "San Antonio, TX 78212", R.drawable.stmarysstrip));

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
