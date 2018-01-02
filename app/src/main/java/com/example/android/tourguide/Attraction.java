package com.example.android.tourguide;
/**
 * Created by raylinares on 12/29/17.
 */

/**
 * {@link Attraction} represents an attraction in the city recommended to the user. It includes
 * attraction name, street address, and city, state, and zip code for that attraction.
 */
public class Attraction {

    /**Name of the city attraction*/
    private String mAttractionName;

    /**Street address of city attraction*/
    private String mAttractionStreet;

    /**City, state and zip code of city attraction*/
    private String mAttractionCityZip;

    private int mBackgroundImageResourceId;

    /**
     * Create a new com.example.android.tourguide.Attraction object
     * @param attractionName is the city attraction name
     *
     * @param attractionStreet is the city attraction street address
     *
     * @param attractionCityZip is the city attraction city name, state, and zip code
     *
     * @param backgroundImageResourceId is the resource id for the background image of the attraction
     */
    public Attraction(String attractionName, String attractionStreet, String attractionCityZip, int backgroundImageResourceId){
        mAttractionName = attractionName;
        mAttractionStreet = attractionStreet;
        mAttractionCityZip = attractionCityZip;
        mBackgroundImageResourceId = backgroundImageResourceId;
    }

    public String getAttractionName() {
        return mAttractionName;
    }
    public String getAttractionStreet(){
        return mAttractionStreet;
    }
    public String getAttractionCityZip(){
        return mAttractionCityZip;
    }
    public int getBackgroundImageResourceId(){
        return mBackgroundImageResourceId;
    }
}
