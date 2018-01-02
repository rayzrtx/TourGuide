package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Hotel Emma", "136 E. Grayson St.",
                "San Antonio, TX 78215", R.drawable.hotelemma));
        attractions.add(new Attraction("Hotel Valencia", "150 E. Houston St.",
                "San Antonio, TX 78205", R.drawable.hotelvalencia));
        attractions.add(new Attraction("Grand Hyatt San Antonio", "600 E. Market St.",
                "San Antonio, TX 78205", R.drawable.grandhyatt));
        attractions.add(new Attraction("Marriott Rivercenter", "101 Bowie St.",
                "San Antonio, TX 78205", R.drawable.marriottrivercenter));
        attractions.add(new Attraction("JW Marriott San Antonio Hill Country Resort & Spa",
                "23808 Resort Pkwy", "San Antonio, TX 78261", R.drawable.jwmarriott));
        attractions.add(new Attraction("Hotel Havana", "1015 Navarro St.",
                "San Antonio, TX 78205", R.drawable.hotelhavana));
        attractions.add(new Attraction("Hotel Contessa", "306 W. Market St.",
                "San Antonio, TX 78205", R.drawable.hotelcontessa));
        attractions.add(new Attraction("Sheraton Gunter Hotel", "205 E. Houston St.",
                "San Antonio, TX 78205", R.drawable.hotelgunter));
        attractions.add(new Attraction("St. Anthony Hotel", "300 E. Travis St.",
                "San Antonio, TX 78205", R.drawable.stanthony));
        attractions.add(new Attraction("Hilton Palacio Del Rio", "200 S. Alamo St.",
                "San Antonio, TX 78205", R.drawable.palaciodelrio));

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
